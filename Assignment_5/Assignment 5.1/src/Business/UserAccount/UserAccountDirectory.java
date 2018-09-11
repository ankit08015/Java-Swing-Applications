/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author ajaygoel
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;
    
    public UserAccountDirectory()
    {
        userAccountDirectory = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(ArrayList<UserAccount> userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
        public UserAccount addUserAccount() {
        UserAccount userAccount = new UserAccount();
        userAccountDirectory.add(userAccount);
        return userAccount;
    }

    public void delUserccount(UserAccount ua) {
        userAccountDirectory.remove(ua);
    }
    
}
