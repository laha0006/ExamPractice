package user;

import java.util.ArrayList;

public class Users {
    private int userid = 1;
    private ArrayList<User> users = new ArrayList<>();

    public void createUser(String username, Role role) {
        User user = new User(username, userid++,role );
        users.add(user);
    }

    public ArrayList<User> getUsersByRole(Role role) {
        ArrayList<User> usersWithRole = new ArrayList<>();
        for (User user : users) {
            if (user.getRole() == role) {
                usersWithRole.add(user);
            }
        }
        return usersWithRole;
    }

}
