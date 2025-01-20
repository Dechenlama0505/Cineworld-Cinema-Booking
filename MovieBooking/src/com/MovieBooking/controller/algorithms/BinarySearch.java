/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MovieBooking.controller.algorithms;

import com.MovieBooking.model.MovieModel;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author [Your Name]
 */
public class BinarySearch {

    /**
     * Searches for a person by their name using binary search and updates the table.
     *
     * @param searchValue the name to search for
     * @param movieList the sorted list of MovieModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @param table the JTable to update with the search result
     */
    public void searchAndUpdateTable(String searchValue, List<MovieModel> movieList, int left, int right, JTable table) {
        MovieModel foundPerson = searchByName(searchValue, movieList, left, right);

        // Clear the table and update it with the search result
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        if (foundPerson != null) {
            model.addRow(new Object[]{
                foundPerson.getName(),
                foundPerson.getBookingID(),
                foundPerson.getEmail(),
                foundPerson.getContact(),
                foundPerson.getMovie(),
                foundPerson.getShowTime(),
                foundPerson.getSeatNumber(),
                foundPerson.getDate()
            });
        } else {
            System.out.println("Name not found.");
        }
    }

    /**
     * Searches for a person by their name using binary search.
     *
     * @param searchValue the name to search for
     * @param movieList the sorted list of MovieModel objects
     * @param left the starting index of the search range
     * @param right the ending index of the search range
     * @return the MovieModel object if found; otherwise, null
     */
    private MovieModel searchByName(String searchValue, List<MovieModel> movieList, int left, int right) {
        if (right < left) {
            return null;
        }

        int mid = (left + right) / 2;


        int comparison = searchValue.compareToIgnoreCase(movieList.get(mid).getName().trim());

        if (comparison == 0) {
            return movieList.get(mid);
        } else if (comparison < 0) {
            return searchByName(searchValue, movieList, left, mid - 1);
        } else {
            return searchByName(searchValue, movieList, mid + 1, right);
        }
    }
}




