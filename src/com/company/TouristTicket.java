package com.company;
public class TouristTicket{
    String pnr,from,to,departureDateTime,arrivalDateTime,seatNo,specialServices,hotelAddress;
    String[] selectedTouristLocation=new String[5];
    float price;
    boolean cancelled;

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, String specialServices, float price, boolean cancelled,String hotelAddress) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.specialServices = specialServices;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress=hotelAddress;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
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
        return "PNR: "+pnr+" From: "+from+" To: "+to+" Departure Time: "+departureDateTime+" Arrival Time: "+arrivalDateTime+" Seat number: "+seatNo+" Special Services: "+specialServices+" Price: "+price+" Cancelled: "+cancelled+" Hotel address: "+hotelAddress;
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
