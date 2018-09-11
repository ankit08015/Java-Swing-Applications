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


import java.util.ArrayList;




public class CarList {
    
    private ArrayList<Car> carCatalogue;
    private String updateTime;
    private ArrayList<Car> carSearchCatalogue;

    public CarList() {
        carCatalogue = new ArrayList<>();
        carSearchCatalogue = new ArrayList<>();
        
    }
    
    public void flushSearchCatalog(){
        carSearchCatalogue.clear();
    }

    public ArrayList<Car> getCarSearchCatalogue() {
        return carSearchCatalogue;
    }
    
    public void addCarToSearch(Car c){
        carSearchCatalogue.add(c);
    }


    public void searchList(String data, String column){
        flushSearchCatalog();
        if(column.equalsIgnoreCase("City")){
            for(Car c: carCatalogue){
                if(c.getCity().equalsIgnoreCase(data)){
                    carSearchCatalogue.add(c);
                }
            }
        }
        
           if(column.equalsIgnoreCase("Manufacturer")){
            for(Car c: carCatalogue){
                if(c.getManufacturer().equalsIgnoreCase(data)){
                    carSearchCatalogue.add(c);
                }
            }
        }
           
              if(column.equalsIgnoreCase("Model Number")){
            for(Car c: carCatalogue){
                if(c.getModelNumber().equalsIgnoreCase(data)){
                    carSearchCatalogue.add(c);
                }
            }
        }
              
                 if(column.equalsIgnoreCase("Manufacturing Year")){
            for(Car c: carCatalogue){
                if(c.getManYear()==(Integer.parseInt(data))){
                    carSearchCatalogue.add(c);
                }
            }
        }
                           if(column.equalsIgnoreCase("Serial Number")){
            for(Car c: carCatalogue){
                if(c.getSerialNum().equalsIgnoreCase(data)){
                    carSearchCatalogue.add(c);
                }
            }
        }
                           
            if(column.equalsIgnoreCase("Certificate")){
            for(Car c: carCatalogue){
                if(c.getMainCert().equalsIgnoreCase(data)){
                    carSearchCatalogue.add(c);
                }
            }
        }
    }
    
    
    

    public ArrayList<Car> getCarCatalogue() {
        return carCatalogue;
    }

    public void setCarCatalogue(ArrayList<Car> carCatalogue) {
        this.carCatalogue = carCatalogue;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
    
    public ArrayList<Car> searchCars(String query){
        ArrayList<Car> temp= new ArrayList<>();
        
        for(Car c: carCatalogue){
            if(c.getManufacturer().equals(query)){
                temp.add(c);
            }
        }
        
        return temp;
        
    }
    public Car addCar(){
        
        Car c= new Car();
        carCatalogue.add(c);
        return c;
        
    }
    
    public void removeCar(Car c){
        carCatalogue.remove(c);
        
    }
       public void removeSearchCar(Car c){
        carSearchCatalogue.remove(c);
        
    }
    
    public int noOfAvailableCars(){
        int count=0;
        for(Car c: carCatalogue){
            if(c.getIsAvailable())count++;
            
        }
        
        return count;
    }
    
    public int noOfCars(){
        int count=0;
        count= carCatalogue.size();
        return count;
    }

    public void searchCarBetweenSeatNumbers(int start, int end) {
        for(Car c: carCatalogue){
            if(c.getNoOfSeats()>=start && c.getNoOfSeats()<=end)carSearchCatalogue.add(c);
        }
    }

    public Car getFirstAvail() {
        Car firstAvail=null;
             for(Car c: carCatalogue){
            if(c.getIsAvailable()){
                firstAvail=c;
                break;
            }
        }
             System.out.println(firstAvail);
       return firstAvail;
    }
}
