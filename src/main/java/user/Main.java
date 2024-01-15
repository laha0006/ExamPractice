package user;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Users userAgent = new Users();

        userAgent.createUser("tolana",Role.Admin);
        userAgent.createUser("tolana2",Role.Admin);
        userAgent.createUser("multiply",Role.Editor);
        userAgent.createUser("multiply2",Role.Editor);
        userAgent.createUser("wit",Role.Reader);
        userAgent.createUser("wit2",Role.Reader);

        ArrayList<User> users = userAgent.getUsersByRole(Role.Admin);
        for (User user : users) {
            System.out.println(user.getUserid());
        }
    }
}
