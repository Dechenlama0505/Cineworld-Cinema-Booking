/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MovieBooking.controller.datastructure;
import com.MovieBooking.view.MovieBooking;
import com.MovieBooking.model.MovieModel;
import java.util.LinkedList;

/**
 *
 * @author mary
 */
public class CustomQueue {
    private LinkedList<MovieModel> vivaList;
    private int capacity;
    
    public CustomQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        vivaList = new LinkedList<>();
        this.capacity = capacity;
    }
 
    
    public MovieModel deQueue() {
        try {
            return vivaList.removeFirst();
        } catch (Exception ex) {
            throw new IllegalStateException("Cannot remove from empty queue."); // Indicates the queue is full.
        }
     
    }
    
    public int enQueue(MovieModel MovieBooking) {
        if (isFull()) {
            throw new IllegalStateException("Cannot peek into an empty queue."); // Indicates the queue is full.
        }
        vivaList.addLast(MovieBooking);
        return vivaList.size();
    }
    
    public int poll() {
        return vivaList.size();
    }
    
    public MovieModel peek() {
        try{
            return vivaList.getFirst();
        }catch (Exception ex) {
            throw new IllegalStateException("Cannot peek into an empty queue.");
        }
    }
    
    public boolean isEmpty() {
        return vivaList.isEmpty();
    }
    
    public boolean isFull() {
        return vivaList.size() == capacity;
    }
}
