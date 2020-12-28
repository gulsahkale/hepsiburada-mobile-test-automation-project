package datas;

public class User {
    public static final User VALID_CREDENTIALS = new User("user@mail.com", "12345678");
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
