/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MovieBooking.util;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author mary
 */
public class validationUtil {

    // Regular expression patterns
    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");

    // Constants for valid time, movies, seats, and dates
    private static final String[] VALID_TIMES = {"1:30 PM", "2:30 PM"};
    private static final String[] VALID_MOVIES = {"Zootopia", "How to Lose a Guy in 10 Days", "Inside Out"};
    private static final String[] VALID_SEATS = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5"};
    private static final String[] VALID_DATES = {"Sunday", "Monday"};

    // Validation utility methods
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidName(String name) {
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    public static boolean isValidId(String id) {
        return !isNullOrEmpty(id) && ID_PATTERN.matcher(id).matches();
    }

    public static boolean isValidEmail(String email) {
        return !isNullOrEmpty(email) && EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidContact(String contact) {
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    // Time validation (1:30 PM or 2:30 PM)
    public static boolean isValidTime(String time) {
        for (String validTime : VALID_TIMES) {
            if (validTime.equals(time)) {
                return true;
            }
        }
        return false;
    }

    // Movie validation (Zootopia, How to Lose a Guy in 10 Days, Inside Out)
    public static boolean isValidMovie(String movie) {
        for (String validMovie : VALID_MOVIES) {
            if (validMovie.equals(movie)) {
                return true;
            }
        }
        return false;
    }

    // Seat validation (A1, A2, ..., C5)
    public static boolean isValidSeat(String seat) {
        for (String validSeat : VALID_SEATS) {
            if (validSeat.equals(seat)) {
                return true;
            }
        }
        return false;
    }

    // Date validation (Sunday or Monday)
    public static boolean isValidDate(String date) {
        for (String validDate : VALID_DATES) {
            if (validDate.equalsIgnoreCase(date)) {
                return true;
            }
        }
        return false;
    }

    // Main validation method
    public static boolean validateInputs(String name, String id, String email, String contact, String time, String movie, String seat, String date) {
        // Validate Name
        if (isNullOrEmpty(name) || !isValidName(name)) {
            showDialogBox("Please enter a valid name (letters and spaces only).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate ID
        if (isNullOrEmpty(id) || !isValidId(id)) {
            showDialogBox("Please enter a valid ID (7 digits).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate Email
        if (isNullOrEmpty(email) || !isValidEmail(email)) {
            showDialogBox("Please enter a valid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate Contact
        if (isNullOrEmpty(contact) || !isValidContact(contact)) {
            showDialogBox("Please enter a valid contact number (starting with 98 and 10 digits).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate Time
        if (isNullOrEmpty(time) || !isValidTime(time)) {
            showDialogBox("Please enter a valid time (1:30 PM or 2:30 PM).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate Movie
        if (isNullOrEmpty(movie) || !isValidMovie(movie)) {
            showDialogBox("Please enter a valid movie (Zootopia, How to Lose a Guy in 10 Days, or Inside Out).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate Seat
        if (isNullOrEmpty(seat) || !isValidSeat(seat)) {
            showDialogBox("Please enter a valid seat (A1, A2, ..., C5).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validate Date
        if (isNullOrEmpty(date) || !isValidDate(date)) {
            showDialogBox("Please enter a valid date (Sunday or Monday).", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // If all validations pass
        return true;
    }

    // Helper method for showing dialog boxes
    private static void showDialogBox(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
}


