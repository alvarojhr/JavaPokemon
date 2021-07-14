package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class User extends Base{
    private String password;
    private static final ArrayList<User> defaultUsers = new ArrayList<>(Arrays.asList(
            new User("LuisaF","123"),
            new User("Cristo","asdfa")
    ));

    public User(String nombre, String password) {
        super(nombre);
        this.password = password;
    }

    public static ArrayList<User> getDefaultUsers() {
        return defaultUsers;
    }

    public String getPassword() {
        return password;
    }

    public static boolean isValid(String username, String password){

        //Find a user with the same credentials
        for (User userI : User.defaultUsers) {
            if (userI.getName().equals(username) && userI.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
