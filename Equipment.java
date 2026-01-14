package Gym_system;

public class Equipment {
    private int id;
    private String name;
    private String condition;
    private boolean available;

    public Equipment(int id, String name, String condition, boolean available) {
        if (id <= 0 || name.isBlank() || condition.isBlank()) {
            throw new IllegalArgumentException("Invalid equipment data");
        }
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.available = available;
    }

    public void markAsBroken() {
        condition = "Broken";
        available = false;
    }

    @Override
    public String toString() {
        return "Equipment{id=" + id +
                ", name='" + name +
                "', condition='" + condition +
                "', available=" + available + "}";
    }
}


