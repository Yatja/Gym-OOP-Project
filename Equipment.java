package Gym_system;

public class Equipment {
    private int id;
    private String name;
    private String condition;
    private boolean available;

    public Equipment(int id, String name, String condition, boolean available) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        if (condition == null || condition.isBlank()) throw new IllegalArgumentException("Condition cannot be empty");

        this.id = id;
        this.name = name;
        this.condition = condition;
        this.available = available;
    }
    public void markAsBroken() {
        condition = "Broken";
        available = false;
    }
    public boolean canBeUsed() {
        return available && !condition.equalsIgnoreCase("Broken");
    }
    @Override
    public String toString() {
        return "Equipment{id=" + id + ", name='" + name + "', condition='" + condition + "', available=" + available + "}";
    }
}


