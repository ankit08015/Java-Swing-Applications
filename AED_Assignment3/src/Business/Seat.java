/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ankit
 */
public class Seat {
    
    private final int seatNo;
    private boolean isBooked;

    public Seat(int seatNo) {
        this.seatNo = seatNo;
        isBooked=false;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public boolean isIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }
    
    
    
    
    
}
