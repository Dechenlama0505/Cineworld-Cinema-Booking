/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MovieBooking.controller;

import com.MovieBooking.view.MovieBooking;
import com.MovieBooking.model.MovieModel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author mary
 */
    public class SelectionSort {
    List<MovieModel> MovieSortList;
    
    public SelectionSort(){
        MovieSortList = new ArrayList<>();
    }

    /*public List<MovieModel> sortByLmuId(List<MovieModel> studentList, boolean isDesc) {
        this.MovieSortList.clear();
        this.MovieSortList.addAll(studentList);
        if (MovieSortList == null || MovieSortList.isEmpty()) {
            throw new IllegalArgumentException("Movie list cannot be null or empty.");
        }

        for (int i = 0; i < MovieSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(MovieSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(MovieSortList, i, extremumIndex);
            }
        }

        return MovieSortList;
    }

    private int findExtremumIndex(List<MovieModel> movieSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < movieSortList.size(); j++) {
            if (shouldSwap(movieSortList.get(j).getBookingID(), movieSortList.get(extremumIndex).getBookingID(), isDesc)) {
                extremumIndex = j;
           
        }

        return extremumIndex;
    }

    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }
    
    private void swap(List<MovieModel> studentSortList, int i, int j) {
        MovieModel temp = studentSortList.get(i);
        studentSortList.set(i, studentSortList.get(j));
        studentSortList.set(j, temp);
    }*/
}
