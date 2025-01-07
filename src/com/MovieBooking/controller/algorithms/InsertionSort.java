/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MovieBooking.controller.algorithms;

import com.MovieBooking.model.MovieModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mary
 */
public class InsertionSort {
    private List<MovieModel> movieSortList;

    public InsertionSort() {
        movieSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of MovieModel objects by their name in ascending or
     * descending order.
     *
     * @param movieList the list of MovieModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<MovieModel> sortByName(List<MovieModel> movieList, boolean isDesc) {
        this.movieSortList.clear();
        this.movieSortList.addAll(movieList);

        if (movieSortList == null || movieSortList.isEmpty()) {
            throw new IllegalArgumentException("Movie list cannot be null or empty.");
        }

        for (int i = 1; i < movieSortList.size(); i++) {
            MovieModel currentMovie = movieSortList.get(i);
            int j = i - 1;

            // Compare and shift elements based on the specified order
            while (j >= 0 && shouldSwap(movieSortList.get(j).getName(), currentMovie.getName(), isDesc)) {
                movieSortList.set(j + 1, movieSortList.get(j));
                j--;
            }

            movieSortList.set(j + 1, currentMovie);
        }

        return movieSortList;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current name value
     * @param extremum the current extremum name value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(String current, String extremum, boolean isDesc) {
        return isDesc ? current.compareToIgnoreCase(extremum) > 0 : current.compareToIgnoreCase(extremum) < 0;
    }
}
