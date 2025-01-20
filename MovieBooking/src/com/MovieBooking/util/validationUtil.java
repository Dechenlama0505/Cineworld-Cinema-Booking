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
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    private static final Pattern CONTACT_PATTERN = Pattern.compile("^98\\d{8}$");

    // Constants for valid time, movies, seats, and dates
    private static final String[] VALID_TIMES = {"1:30 PM", "3:30 PM"};
    private static final String[] VALID_MOVIES = {"Zootopia", "How to Lose a Guy in 10 Days", "Inside Out"};
    private static final String[] VALID_SEATS = {"A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5"};
    private static final String[] VALID_DATES = {"Sunday", "Monday"};

     /**
     * Validation utility methods for checking various input formats.
     */
    public static boolean isNullOrEmpty(String value) {
        // Check if the string is null or empty after trimming any spaces
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates the format of a name.
     * @param name the name to validate
     * @return true if the name is valid, false otherwise
     */
    public static boolean isValidName(String name) {
        // Check if the name is not empty and matches the defined name pattern
        return !isNullOrEmpty(name) && NAME_PATTERN.matcher(name).matches();
    }

    /**
     * Validates the format of an ID.
     * @param id the ID to validate
     * @return true if the ID is valid, false otherwise
     */
    public static boolean isValidId(String id) {
        // Check if the ID is not empty and matches the defined ID pattern
        return !isNullOrEmpty(id) && ID_PATTERN.matcher(id).matches();
    }

    /**
     * Validates the format of an email.
     * @param email the email to validate
     * @return true if the email is valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        // Check if the email is not empty and matches the defined email pattern
        return !isNullOrEmpty(email) && EMAIL_PATTERN.matcher(email).matches();
    }

    /**
     * Validates the format of a contact number.
     * @param contact the contact number to validate
     * @return true if the contact is valid, false otherwise
     */
    public static boolean isValidContact(String contact) {
        // Check if the contact is not empty and matches the defined contact pattern
        return !isNullOrEmpty(contact) && CONTACT_PATTERN.matcher(contact).matches();
    }

    /**
     * Validates if the given time matches a valid time from the predefined list.
     * @param time the time to validate
     * @return true if the time is valid, false otherwise
     */
    public static boolean isValidTime(String time) {
        // Check if the given time matches any of the valid times in the list
        for (String validTime : VALID_TIMES) {
            if (validTime.equals(time)) {
                return true;
            }
        }
        return false; // No valid time matched
    }


    /**
    * Validates if the given movie is in the list of valid movies.
    * @param movie the movie to validate
    * @return true if the movie is valid, false otherwise
    */
   public static boolean isValidMovie(String movie) {
       for (String validMovie : VALID_MOVIES) {
           if (validMovie.trim().toLowerCase().equals(movie.toLowerCase())) {
               return true; 
           }
       }
       return false;
   }


    /**
    * Validates if the given seat is in the list of valid seats.
    * @param seat the seat to validate
    * @return true if the seat is valid, false otherwise
    */
   public static boolean isValidSeat(String seat) {
       for (String validSeat : VALID_SEATS) {
           if (validSeat.equals(seat)) {
               return true; 
           }
       }
       return false; 
   }


    /**
    * Validates if the given date is in the list of valid dates.
    * @param date the date to validate
    * @return true if the date is valid, false otherwise
    */
   public static boolean isValidDate(String date) {
       for (String validDate : VALID_DATES) {
           if (validDate.equalsIgnoreCase(date)) {
               return true; 
           }
       }
       return false;
   }


    /**
    * Main validation method that checks if all the input fields are valid.
    * @param name the name to validate
    * @param id the ID to validate
    * @param email the email to validate
    * @param contact the contact number to validate
    * @param time the time to validate
    * @param movie the movie to validate
    * @param seat the seat to validate
    * @param date the date to validate
    * @return true if all inputs are valid, false otherwise
    */
   public static boolean validateInputs(String name, String id, String email, String contact, String time, String movie, String seat, String date) {
       if (isNullOrEmpty(name) || !isValidName(name)) {
           showDialogBox("Please enter a valid name (letters and spaces only).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false; 
       }
       
       if (isNullOrEmpty(id) || !isValidId(id)) {
           showDialogBox("Please enter a valid ID (7 digits).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false;
       }

       
       if (isNullOrEmpty(email) || !isValidEmail(email)) {
           showDialogBox("Please enter a valid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false;
       }

      
       if (isNullOrEmpty(contact) || !isValidContact(contact)) {
           showDialogBox("Please enter a valid contact number (starting with 98 and 10 digits).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false; 
       }

      
       if (isNullOrEmpty(time) || !isValidTime(time)) {
           showDialogBox("Please enter a valid available time (1:30 PM or 2:30 PM).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false; 
       }

    
       if (isNullOrEmpty(movie) || !isValidMovie(movie)) {
           showDialogBox("Please enter a valid movie (Zootopia, How to Lose a Guy in 10 Days, or Inside Out).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false; 
       }

    
       if (isNullOrEmpty(seat) || !isValidSeat(seat)) {
           showDialogBox("Please enter a valid seat (A1, A2, ..., C5).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false; 
       }

       
       if (isNullOrEmpty(date) || !isValidDate(date)) {
           showDialogBox("Please enter a valid date (Sunday or Monday).", "Validation Error", JOptionPane.ERROR_MESSAGE);
           return false; 
       }

      
       return true;
   }

    /**
     * Helper method for showing dialog boxes with validation error messages.
     * @param message the message to display in the dialog box
     * @param title the title of the dialog box
     * @param messageType the type of message (e.g., error message)
     */
    private static void showDialogBox(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
}


