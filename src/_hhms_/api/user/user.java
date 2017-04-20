package _hhms_.api.user;


/**
 * A class representing a receptionist logging into the system.
 * @author GROUP5
 * @version 0.2.1
 */

public class user {

    public String username;
    public String password;

    /**
     * Initialises a new receptionist
     */
    public user (){
        this.username="user";
        this.password="user"
    }
    /**
     * Gets the user's username
     * @return the user's username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the user's password.
     * @return The user's password.
     */
    public String getPassword() {
        return password;
    }
}
