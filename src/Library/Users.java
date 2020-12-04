package Library;

import java.io.Serializable;
import javax.swing.*;

public class Users implements Serializable {

    private int userID;
    private String username;
    private String password;
    private String admin;

    public Users() {this(0,"Not Given","Not Given","Not Given");}

    public Users(int userID, String username, String password, String admin) {
        setUserID(userID);
        setUsername(username);
        setPassword(password);
        setAdmin(admin);
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return String.format("User ID: %s\nUsername: %s\nPassword: %s\nAdmin: %.2f\n",getUserID(),getUsername(),getPassword(),getAdmin());
    }
}
