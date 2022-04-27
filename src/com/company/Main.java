package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Address a1=new Address("KK","Gorakhpur","Uttar Pradesh");
        System.out.println(a1.getAddressDetails());
        a1.updateAddressDetails(a1.street);
        System.out.println(a1.getAddressDetails());
        Passenger p1=new Passenger(1001);
        System.out.println("Passenger id: "+p1.getId());
        Contact c1=new Contact("Yuv Raj","798566","yuvraj@gmail.com");
        System.out.println(c1.getContactDetails());
        c1.updateContactDetails(c1.name);
        System.out.println(c1.getContactDetails());
        Flight f1=new Flight("188","Vistara",200,1);
        f1.incrementBookingCounter();
        System.out.println(f1.getFlightDetails());
        System.out.println("Availability: "+f1.checkAvailability());
        RegularTicket rt1=new RegularTicket("05512507548","Mumbai","Goa","7","11","55","Samosa",2000,false);
            System.out.println(rt1.getSpecialServices());
            rt1.updateSpecialServices("Momos");
            System.out.println(rt1.getSpecialServices());
            System.out.println( rt1.getFlightDuration()+"hours");
        System.out.println(rt1.checkStatus());
            rt1.cancel();
        System.out.println(rt1.checkStatus());
        TouristTicket tt1=new TouristTicket("05512507548","Mumbai","Goa","7","11","55","Samosa",2000,false,"shivoy");
        tt1.setSelectedTouristLocation(new String[]{"city","manu","psg","stefano","munich"});
        tt1.removeTouristLocation("city");
        tt1.addTouristLocation("old trafford");
        System.out.println(Arrays.toString(tt1.getSelectedTouristLocation()));
        System.out.println(tt1.checkStatus());

    }
}
