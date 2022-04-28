package com.company;

import java.time.LocalDateTime;

public class TouristTicket extends Ticket{
    private String hotelAddress;
  private  String[] selectedTouristLocation=new String[5];
  public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo,float price, boolean cancelled, String hotelAddress, Flight flight, Passenger passenger,String[] selectedTouristLocation) {
      super(pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled,flight,passenger);
      this.hotelAddress=hotelAddress;
      this.selectedTouristLocation=selectedTouristLocation;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }
    public void removeTouristLocation(String location)
    {
        for(int i=0;i<selectedTouristLocation.length;i++)
        {
            if(selectedTouristLocation[i]==location)
            {
                selectedTouristLocation[i]=null;
            }
        }
    }
public void addTouristLocation(String location)
{

    for(int i=0;i<selectedTouristLocation.length;i++)
    {
        if(selectedTouristLocation[i]==null)
        {

            selectedTouristLocation[i]=location;
        }

    }

}
}
