import java.util.ArrayList;

public class UserMethods {
    private static User operator = new User("operator1","Password1!", Role.Operator);
    private static User customerManager = new User("customerManager1","Password1!", Role.CustomerManager);
    private static User candidate = new User("candidate1","Password1!", Role.Candidate);
    private static ArrayList<User> systemUsers = new ArrayList<>();


    public static Role Login(String username, String password){
        systemUsers.add(operator);
        systemUsers.add(customerManager);
        systemUsers.add(candidate);
        for (User user: systemUsers){
            if (user.username.equals(username) && user.password.equals(password)){
                return user.role;
            }
        }
        return null;
    }
}
