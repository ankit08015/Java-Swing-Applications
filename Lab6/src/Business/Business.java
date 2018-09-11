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
public class Business {

    private EmployeeDirectory empDir;
    private UserAccountDirectory userAccDir;

    // singleton in making
    public static Business business;

    private Business() {

        empDir = new EmployeeDirectory();
        userAccDir = new UserAccountDirectory();

    }

    public static Business getInstance() {

        if (business == null) {
            business = new Business();

        }

        return business;
    }

    public EmployeeDirectory getEmpDir() {
        return empDir;
    }

    public void setEmpDir(EmployeeDirectory empDir) {
        this.empDir = empDir;
    }

    public UserAccountDirectory getUserAccDir() {
        return userAccDir;
    }

    public void setUserAccDir(UserAccountDirectory userAccDir) {
        this.userAccDir = userAccDir;
    }

}
