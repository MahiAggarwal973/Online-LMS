public class User {
    private int id;
    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Getters and setters

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getRole() { return role; }
}