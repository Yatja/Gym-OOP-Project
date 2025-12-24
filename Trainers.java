package Gym_system;

public class Trainers {
    private int id;
    private String name;
    private String specialization;
    private int experienceYears;


    public Trainers(int id, String name, String specialization, int experienceYears) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String toString() {
        return "Trainer{id=" + id + ", name='" + name + "', specialization='" + specialization + "', experienceYears=" + experienceYears + "}";
    }

    public boolean isExperienced() {
        return experienceYears >= 5;
    }

    public void addExperienceYear() {
        experienceYears++;
    }
}
