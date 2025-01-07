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
public class SelectionSort {
    private List<MovieModel> movieSortList;

    public SelectionSort() {
        movieSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of MovieModel objects by their Booking ID in ascending or
     * descending order.
     *
     * @param movieList the list of MovieModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<MovieModel> sortByBookingId(List<MovieModel> movieList, boolean isDesc) {
        this.movieSortList.clear();
        this.movieSortList.addAll(movieList);

        if (movieSortList == null || movieSortList.isEmpty()) {
            throw new IllegalArgumentException("Movie list cannot be null or empty.");
        }

        for (int i = 0; i < movieSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(movieSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(movieSortList, i, extremumIndex);
            }
        }

        return movieSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param movieSortList the list of MovieModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<MovieModel> movieSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < movieSortList.size(); j++) {
            if (shouldSwap(movieSortList.get(j).getBookingID(), movieSortList.get(extremumIndex).getBookingID(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(long current, long extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param movieSortList the list of MovieModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<MovieModel> movieSortList, int i, int j) {
        MovieModel temp = movieSortList.get(i);
        movieSortList.set(i, movieSortList.get(j));
        movieSortList.set(j, temp);
    }
}
