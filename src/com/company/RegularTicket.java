package com.company;

import java.time.LocalDateTime;

public class RegularTicket {
   private String pnr,from,to,departureDateTime,arrivalDateTime,seatNo,specialServices;
   private float price;
   private boolean cancelled;
   private Flight flight;
   private Passenger passenger;

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, String specialServices, float price, boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.specialServices = specialServices;
        this.price = price;
        this.cancelled = cancelled;
        this.flight=flight;
        this.passenger=passenger;
    }

    public String getSpecialServices() {
        return "Special Service: "+specialServices;
    }
    public void updateSpecialServices(String specialServices)
    {
    this.specialServices=specialServices;
    }
    public String checkStatus()
    {
        if(cancelled)
        {
            return "cancelled";
        }
        else
        {
            return "Confirmed";
        }
    }
    public int getFlightDuration()
    {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }
    public void cancel()
    {
        cancelled=true;
    }
}
