package com.company;

public class Flight {
    private String flightNumber,airline;
    private int capacity,bookSeats;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookSeats() {
        return bookSeats;
    }

    public void setBookSeats(int bookSeats) {
        this.bookSeats = bookSeats;
    }

    public Flight(String flightNumber, String airline, int capacity, int bookSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookSeats = bookSeats;
    }
    public String getFlightDetails()
    {
        return "Flight number: "+this.flightNumber+" Airline: "+this.airline+" Capacity: "+this.capacity+" Book Seats: "+this.bookSeats;
    }
    public boolean checkAvailability()
    {
       return bookSeats<capacity;
    }
    public void incrementBookingCounter()
    {
     bookSeats++;
    }
}
