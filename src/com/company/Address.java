package com.company;
import java.util.Scanner;
public class Address {
    Scanner sc=new Scanner(System.in);
    public String street;
    public String city;
    public String state;
    public Address(String street,String city,String state)
    {
        this.street=street;
        this.city=city;
        this.state=state;
    }
    public String getAddressDetails()
    {
        return "Street: "+street+" City: "+city+" State: "+state;
    }
    public void updateAddressDetails(String address)
    {
        if (street.equals(address)) {
            System.out.println("Enter the new street");
            String st = sc.next();
            this.street = st;
        } else if (city.equals(address)) {
            System.out.println("Enter the new city");
            String ci = sc.next();
            this.city = ci;
        } else if (state.equals(address)) {
            System.out.println("Enter the new State");
            String sta = sc.next();
            this.state = sta;
        } else {
            System.out.println("Wrong input");
        }
    }

}
