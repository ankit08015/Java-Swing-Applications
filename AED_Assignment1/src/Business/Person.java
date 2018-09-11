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
public class Person {
    
    
    private String name;
    private String geographic_data;
    private String dob;
    private String phone;
    private String fax;
    private String email;
    private String ssn;
    private String medRecNum;
    private String imageTxt; //Health plan beneficiary number
    private String bankAccNum; //Bank account numbers
    
//Full face photos and comparable images
//Any unique identifying number, characteristic or code

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographic_data() {
        return geographic_data;
    }

    public void setGeographic_data(String geographic_data) {
        this.geographic_data = geographic_data;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMedRecNum() {
        return medRecNum;
    }

    public void setMedRecNum(String medRecNum) {
        this.medRecNum = medRecNum;
    }

    public String getImagetxt() {
        return imageTxt;
    }

    public void setImageTxt(String imageTxt) {
        this.imageTxt = imageTxt;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }
    
    
    
}
