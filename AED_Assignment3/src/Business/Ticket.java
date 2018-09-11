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
public class Ticket {
    
    private Airliner airlinerName;
    private Flight flightName;
    private String toLocation;
    private String fromLocation;
    private Date date;
    private String time;
    private int seatNum;
    private double price;
    private Seat[] seats;
    
    public Seat[] getSeatArray(){
        return seats;
    }

    public String getSeats() {
        String seatDet="";
        for(int i=0;i<seats.length;i++){
          seatDet= seatDet+seats[i].getSeatNo()+" ";
        }
        
        return seatDet;
    }

    @Override
    public String toString() {
        return airlinerName + " " + flightName;
    }
    
    

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }
    
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

    public Airliner getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(Airliner airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Flight getFlightName() {
        return flightName;
    }

    public void setFlightName(Flight flightName) {
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

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
    
    
    
    
}
