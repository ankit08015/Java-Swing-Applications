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
public class Car {
    
    private String manufacturer;
    private int manYear;
    private String serialNum;
    private int noOfSeats;
    private String modelNumber;
    private String city;
    private String mainCert;
    private Boolean isAvailable;

    @Override
    public String toString() {
        return serialNum ;
    }
    
    

 
    
    
    

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManYear() {
        return manYear;
    }

    public void setManYear(int manYear) {
        this.manYear = manYear;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMainCert() {
        return mainCert;
    }

    public void setMainCert(String mainCert) {
        this.mainCert = mainCert;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    
    
    
}
