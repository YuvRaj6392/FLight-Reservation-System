package com.company;

import java.util.Scanner;

public class Passenger {
    private int id;
    private static int  idCounter=0;
    Address address;
    Contact contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private static class Contact {
        Scanner sc = new Scanner(System.in);
         String name, phone, email;
         Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
         String getContactDetails()
        {
            return "Name: "+this.name+" Phone: "+this.phone+" Email: "+this.email;
        }
        public void updateContactDetails(String contact)
        {
            if(name.equals(contact))
            {
                System.out.println("Enter the new name");
                this.name= sc.next();
            }
            else if(phone.equals(contact))
            {
                System.out.println("Enter the new phone number");
                this.phone= sc.next();
            }
            else if(email.equals(contact))
            {
                System.out.println("Enter the new email");
                this.email= sc.next();
            }
            else
            {
                System.out.println("Wrong input");
            }
        }
    }
    private static class Address {
        Scanner sc = new Scanner(System.in);
         String street;
         String city;
         String state;

         Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getAddressDetails() {
            return "Street: " + street + " City: " + city + " State: " + state;
        }

        public void updateAddressDetails(String address) {
            if (street.equals(address)) {
                System.out.println("Enter the new street");
                this.street = sc.next();
            } else if (city.equals(address)) {
                System.out.println("Enter the new city");
                this.city = sc.next();
            } else if (state.equals(address)) {
                System.out.println("Enter the new State");
                this.state = sc.next();
            } else {
                System.out.println("Wrong input");
            }
        }
    }
    public Passenger(String street,String city, String state,String name,String phone,String email)
    {
        this.address=new Address(street,city,state);
        this.contact=new Contact(name, phone, email);
        this.id=++idCounter;
    }
    public int getPassengerCount()
    {
       return idCounter;
    }

}
