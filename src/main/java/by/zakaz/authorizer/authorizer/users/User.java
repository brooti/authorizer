package by.zakaz.authorizer.authorizer.users;

public class User {
    private String username;
    private String email;

    // Геттеры и сеттеры

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}