package login.models;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        /*
        * TODO:
        * Tambahkan attribute, method, atau constructor
        * yang dibutuhkan di kelas user
        */
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}