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
public class EmployeeDirectory {

    private ArrayList<Employee> empList;

    public EmployeeDirectory() {
        empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public Employee addEmployee() {
        Employee emp = new Employee();
        empList.add(emp);
        return emp;
    }

    public void deleteEmployee(Employee emp) {
        empList.remove(emp);
    }

}
