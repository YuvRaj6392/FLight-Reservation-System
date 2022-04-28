package com.company;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
  private String specialServices;

  public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, String specialServices, float price, boolean cancelled, Flight flight, Passenger passenger) {
     super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
        this.specialServices=specialServices;
    }
    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
    public String getSpecialServices() {
        return "Special Service: "+specialServices;
    }
    public void updateSpecialServices(String specialServices)
    {
    this.specialServices=specialServices;
    }


}
