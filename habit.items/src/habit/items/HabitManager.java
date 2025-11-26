package habit.items;

import java.util.ArrayList;
import java.util.List;

public class HabitManager {
    private List<Habit> habits = new ArrayList<>();

    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    public void displayHabits() {
        System.out.println("=== Habit List ===");
        for (Habit h : habits) {
            h.displayHabit();
        }
        System.out.println();
    }
}
