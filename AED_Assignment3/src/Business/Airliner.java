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
public class Airliner {
    
    private String name;
    
    private ArrayList<Flight> flightSchedule;

    @Override
    public String toString() {
        return name ;
    }
    
    

    public Airliner() {
        
        flightSchedule= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Flight addFlight(){
        Flight flight= new Flight();
        
        flightSchedule.add(flight);
        return flight;
    }

    public ArrayList<Flight> getFlightSchedule() {
        return flightSchedule;
    }
    
    
    
    
    
}
