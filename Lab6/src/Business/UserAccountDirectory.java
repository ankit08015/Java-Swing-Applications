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
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccList;

    public UserAccountDirectory() {
        userAccList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccList() {
        return userAccList;
    }

    public void setUserAccList(ArrayList<UserAccount> userAccList) {
        this.userAccList = userAccList;
    }

    public UserAccount addUserAcc() {
        UserAccount ua = new UserAccount();
        userAccList.add(ua);

        return ua;
    }

    public void deleteUserAcc(UserAccount ua) {
        userAccList.remove(ua);
    }

}
