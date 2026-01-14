package Gym_system;

public class Trainers {
    private int id;
    private String name;
    private String specialization;
    private int experienceYears;
    public Trainers(int id, String name, String specialization, int experienceYears) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        if (specialization == null || specialization.isBlank())
            throw new IllegalArgumentException("Specialization cannot be empty");
        if (experienceYears < 0) throw new IllegalArgumentException("Experience cannot be negative");

        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }
    public boolean isExperienced() {
        return experienceYears >= 5;
    }
    @Override
    public String toString() {
        return "Trainer{id=" + id + ", name='" + name +
                "', specialization='" + specialization +
                "', experienceYears=" + experienceYears + "}";
    }
}
