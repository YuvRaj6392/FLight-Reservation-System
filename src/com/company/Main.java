package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("05512507544", "Mumbai", "Goa", "2022-04-30T19:34:50.63", "2022-04-30T22:34:50.63", "55", "Dinner", 500, false,new Flight("1001","Indigo",200,1),new Passenger("Park Road","Mumbai","Maharashtra","Yuv Raj","79889900","yuvraj@gmail.com"));
        Ticket touristTicket = new TouristTicket("05512508995", "London", "Manali", "2022-05-23T19:34:50.63", "2022-05-23T23:34:50.63", "23", 600, false, "Civil Lines Manali",new Flight("0889","Air India",200,1), new Passenger("Avenue 9","London","-","Bernanrdo Silva","239283927","Bernardo@gmail.com"), new String[]{"Solang valley", "Beas river", "Manikaran Gurudwara", "Gulaba", "Bhrigu Lake"});
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
public static void printTicketDetails(Ticket ticket)
        {
            System.out.println(ticket.getPnr());
        }
    }

