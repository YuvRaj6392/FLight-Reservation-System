package com.company;

public class RegularTicket {
    String pnr,from,to,departureDateTime,arrivalDateTime,seatNo,specialServices;
    float price;
    boolean cancelled;

    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, String specialServices, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;

        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.specialServices = specialServices;
        this.price = price;
        this.cancelled = cancelled;
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
        return "PNR: "+pnr+" From: "+from+" To: "+to+" Departure Time: "+departureDateTime+" Arrival Time: "+arrivalDateTime+" Seat number: "+seatNo+" Special Services: "+specialServices+" Price: "+price+" Cancelled: "+cancelled;
    }
    public int getFlightDuration()
    {
        int a=Integer.parseInt(departureDateTime);
        int b=Integer.parseInt(arrivalDateTime);
        int c=b-a;
        return c;
    }
    public void cancel()
    {
        cancelled=true;
    }
}
