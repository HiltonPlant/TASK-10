package habit.user;

public class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("=== User Information ===");
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
