/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ankit
 */
public class Customer {
    
    private String name;
    private int age;
    private String address;
    private String emailId;
    private String contactNum;
    private ArrayList<Ticket> tickets;

    
    

    public Customer() {
        
        tickets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }


    
    
    
    public Ticket addTicket(){
        Ticket ticket=new Ticket();
        
        tickets.add(ticket);
        
        return ticket;
    }

    @Override
    public String toString() {
        return name;
    }

    public void cancelTicket(Ticket ticket) {
        
        Seat[] seats= ticket.getSeatArray();
        
        Flight flight= ticket.getFlightName();
        int i=0;
        
        for(Seat s:flight.getSeats()){
            if(i==seats.length)break;
            if(s.equals(seats[i])){
                s.setIsBooked(false);
                i++;
            }
        }
        
        tickets.remove(ticket);
    }
    
    
    
    
    
    
}
