package com.company;
import java.util.Scanner;
public class Address {
    Scanner sc=new Scanner(System.in);
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private Address(String street, String city, String state)
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
