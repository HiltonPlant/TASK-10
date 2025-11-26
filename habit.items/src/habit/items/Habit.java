package habit.items;

public class Habit {
    private String name;
    private String category;

    public Habit(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public void displayHabit() {
        System.out.println("Habit: " + name + " | Category: " + category);
    }
}
