public class Register {
    String username;
    String fullname;
    String email;
    String birthday;
    String password;

    // Return Messages
    String message;

    public Register (String username,
                     String fullname,
                     String email,
                     String birthday,
                     String password) {
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.birthday = birthday;
        this.password = password;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUsername() {
        return this.username;
    }
}
