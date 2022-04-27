package com.company;
import java.util.Scanner;
public class Contact {
    Scanner sc=new Scanner(System.in);
    String name,phone,email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
   public String getContactDetails()
   {
       return "Name: "+this.name+" Phone: "+this.phone+" Email: "+this.email;
   }
   public void updateContactDetails(String contact)
   {
       if(name.equals(contact))
       {
           System.out.println("Enter the new name");
           String n=sc.next();
           this.name=n;
       }
       else if(phone.equals(contact))
       {
           System.out.println("Enter the new phone number");
           String p=sc.next();
           this.phone=p;
       }
       else if(email.equals(contact))
       {
           System.out.println("Enter the new email");
           String e=sc.next();
           this.email=e;
       }
       else
       {
           System.out.println("Wrong input");
       }
   }
}
