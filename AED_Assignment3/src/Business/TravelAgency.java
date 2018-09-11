/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Interface.ManageAirliner.AddFlightJPanel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ankit
 */
public class TravelAgency {

    private ArrayList<Airliner> masterSchedule;

    private ArrayList<Customer> customerDirectory;

    public TravelAgency() {

        masterSchedule = new ArrayList<>();
        customerDirectory = new ArrayList<>();
    }

    public Airliner addAirliner() {
        Airliner airliner = new Airliner();
        masterSchedule.add(airliner);
        return airliner;
    }

    public void removeAirliner(Airliner airliner) {
        masterSchedule.remove(airliner);
    }

    public Customer addCustomer() {
        Customer customer = new Customer();

        customerDirectory.add(customer);

        return customer;
    }

    public ArrayList<Flight> searchFlight(String from, String to) {

        ArrayList<Flight> flights = new ArrayList<>();

        for (Airliner a : getMasterSchedule()) {
            for (Flight f : a.getFlightSchedule()) {
                if (f.getFromLocation().equalsIgnoreCase(from) && f.getToLocation().equalsIgnoreCase(to)) {
                    flights.add(f);
                }
            }
        }
        return flights;
    }

    public ArrayList<Airliner> getMasterSchedule() {
        return masterSchedule;
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public ArrayList<Flight> searchFlightAirline(String from, String to, String airline) {
        ArrayList<Flight> flights = new ArrayList<>();

        for (Airliner a : getMasterSchedule()) {
            if (a.getName().equalsIgnoreCase(airline)) {
                for (Flight f : a.getFlightSchedule()) {
                    if (f.getFromLocation().equalsIgnoreCase(from) && f.getToLocation().equalsIgnoreCase(to)) {
                        flights.add(f);
                    }
                }
            }
        }
        return flights;

    }

    public ArrayList<Flight> searchFlightDate(String from, String to, String date) {
         Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
              JOptionPane.showMessageDialog(null, "Please enter Date in dd/mm/yyyy format to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return null;
        }
        
        ArrayList<Flight> flights = new ArrayList<>();

        for (Airliner a : getMasterSchedule()) {
            for (Flight f : a.getFlightSchedule()) {
                if (f.getFromLocation().equalsIgnoreCase(from) && f.getToLocation().equalsIgnoreCase(to)&&f.getDate().equals(date1)) {
                    flights.add(f);
                }
            }
        }
        return flights;
        
        
    }
    

    public ArrayList<Flight> searchFlightMaster(String from, String to, String airline, String date) {
                 Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please enter Date in dd/mm/yyyy format to search", "Warning", JOptionPane.WARNING_MESSAGE);
                return null;
        }
        
        ArrayList<Flight> flights = new ArrayList<>();
        
                for (Airliner a : getMasterSchedule()) {
            if (a.getName().equalsIgnoreCase(airline)) {
                for (Flight f : a.getFlightSchedule()) {
                    if (f.getFromLocation().equalsIgnoreCase(from) && f.getToLocation().equalsIgnoreCase(to)&&f.getDate().equals(date1)) {
                        flights.add(f);
                    }
                }
            }
        }
        return flights;
        
        
    }

}
