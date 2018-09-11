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
public class Employee extends Person {

    private String organization;
    private int empId;
    private static int count = 1000;

    @Override
    public String toString() {
        return this.getFirstName();
    }
    
    
    

    public Employee() {

        empId = count++;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

}
