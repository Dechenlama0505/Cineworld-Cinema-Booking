/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.MovieBooking.model;

/**
 *
 * @author mary
 */
public class MovieModel {
    private String name;
    private int bookingID;
    private String email;
    private String contact;
    private String movie;
    private String showTime; 
    private String seatNumber; 
    private String date; 

    // Default Constructor
    public MovieModel() {
    }

    // Parameterized Constructor
    public MovieModel(int bookingID, String name, String email, String contact, 
                        String movie, String showTime, String seatNumber, String date) {
        this.name = name;
        this.bookingID = bookingID;
        this.email = email;
        this.contact = contact;
        this.movie = movie;
        this.showTime = showTime;
        this.seatNumber = seatNumber;
        this.date = date;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getBookingID() {
        return bookingID;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public String getMovie() {
        return movie;
    }

    public String getShowTime() {
        return showTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
