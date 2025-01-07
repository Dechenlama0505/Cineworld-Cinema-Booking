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
public class MergeSort {
    /**
     * Sorts a list of MovieModel objects by their seat number in ascending or
     * descending order using the merge sort algorithm.
     *
     * @param movieList the list of MovieModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<MovieModel> sortBySeatNo(List<MovieModel> movieList, boolean isDesc) {
        if (movieList == null || movieList.isEmpty()) {
            throw new IllegalArgumentException("Movie list cannot be null or empty.");
        }
        return mergeSort(movieList, isDesc);
    }

    /**
     * Recursively splits and merges the list.
     *
     * @param movieList the list to sort
     * @param isDesc specifies the sort order
     * @return the sorted list
     */
    private List<MovieModel> mergeSort(List<MovieModel> movieList, boolean isDesc) {
        if (movieList.size() <= 1) {
            return movieList;
        }

        // Split the list into two halves
        int mid = movieList.size() / 2;
        List<MovieModel> left = new ArrayList<>(movieList.subList(0, mid));
        List<MovieModel> right = new ArrayList<>(movieList.subList(mid, movieList.size()));

        // Recursively sort both halves
        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        // Merge the sorted halves
        return merge(left, right, isDesc);
    }

    /**
     * Merges two sorted lists into one sorted list.
     *
     * @param left the left half
     * @param right the right half
     * @param isDesc specifies the sort order
     * @return the merged sorted list
     */
    private List<MovieModel> merge(List<MovieModel> left, List<MovieModel> right, boolean isDesc) {
        List<MovieModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge elements based on sorting order
        while (i < left.size() && j < right.size()) {
            if (shouldSwap(left.get(i).getSeatNumber(), right.get(j).getSeatNumber(), isDesc)) {
                merged.add(right.get(j));
                j++;
            } else {
                merged.add(left.get(i));
                i++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current seat number value
     * @param extremum the current extremum seat number value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(String current, String extremum, boolean isDesc) {
        try {
            // Parse seat numbers as integers if possible
            int currentSeat = Integer.parseInt(current);
            int extremumSeat = Integer.parseInt(extremum);
            return isDesc ? currentSeat > extremumSeat : currentSeat < extremumSeat;
        } catch (NumberFormatException e) {
            // Fallback to lexicographical comparison if seat numbers are not numeric
            return isDesc ? current.compareToIgnoreCase(extremum) > 0 : current.compareToIgnoreCase(extremum) < 0;
        }
    }
}


