package user;

public class User {
    private String username;
    private int userid;
    private Role role;

    public User(String username, int userid, Role role) {
        this.username = username;
        this.userid = userid;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public int getUserid() {
        return userid;
    }
}
