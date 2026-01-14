package Gym_system;

public class Member {
    private int id;
    private String name;
    private int age;
    private boolean active;
    public Member(int id, String name, int age, boolean active) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");

        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
    }
    public void deactivate() {
        active = false;
    }
    public boolean isAdult() {
        return age >= 18;
    }
    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "', age=" + age + ", active=" + active + "}";
    }
}



