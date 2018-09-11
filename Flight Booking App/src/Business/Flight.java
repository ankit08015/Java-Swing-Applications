/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author ankit
 */
public class Flight {
    
    private Seat[] seats;
    
    private String flightName;
    
    private String toLocation;
    
    private String fromLocation;
    
    private double price;
    
    private Date date;
    
    private String time;
    
    private String airlinerName;

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }
    
    
    
    public int getAvailableSeats(){
        int availableSeat=0;
        for(int i=0;i<seats.length;i++){
            if(!seats[i].isIsBooked())availableSeat++;
        }
        
        return availableSeat;
    }

    @Override
    public String toString() {
        return flightName;
    }
    
    
    


    public void addFlightSeat(int seatNum) {
        seats= new Seat[seatNum];
        
        for(int i=0;i<seatNum;i++){
            Seat s= new Seat(i+1);
            s.setIsBooked(false);
            seats[i]=s;
        }
        

        
        
    }
    
    public Seat[] bookSeat(int numSeat){
        Seat[] seatTicket= new Seat[numSeat];
        int j=0;

        while(j<numSeat){
           
        for(int i=0;i<seats.length;i++){
            if(!seats[i].isIsBooked())
            {
            seats[i].setIsBooked(true);
            seatTicket[j]=seats[i];
            j++;
            break;
            }
      
        }
        }
        
        
        
        return seatTicket;
    }
    
    
    public void cancelTicket(Seat[] s){
        int j=0;
        while(j<s.length){
            for(Seat s1: seats){
                if(s1.equals(s[j])){
                    s1.setIsBooked(false);
                }
            }
        }
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Seat[] getSeats() {
        return seats;
    }
    
    
    
    
    
}
