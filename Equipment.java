package Gym_system;

public class Equipment {
    private int id;
    private String name;
    private String condition;
    private boolean available;

    public Equipment(int id, String name, String condition, boolean available) {
        this.id = id;
        this.name = name;
        this.condition = condition;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "Gym_system.Equipment{id=" + id + ", name='" + name + "', condition='" + condition + "', available=" + available + "}";
    }

    public void markAsBroken() {
        condition = "Broken";
        available = false;
    }
    
    public boolean canBeUsed() {
        return available && !condition.equalsIgnoreCase("Broken");
    }
}
