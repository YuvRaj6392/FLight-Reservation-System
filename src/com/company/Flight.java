package com.company;

public class Flight {
    public String flightNumber,airline;
    public int capacity,bookSeats;
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
