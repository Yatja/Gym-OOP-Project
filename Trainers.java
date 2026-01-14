package Gym_system;

public class Trainers extends Person {

    private String specialization;
    private int experienceYears;

    public Trainers(int id, String name, String specialization, int experienceYears) {
        super(id, name);
        setSpecialization(specialization);
        setExperienceYears(experienceYears);
    }

    public void setSpecialization(String specialization) {
        if (specialization != null && !specialization.isBlank()) {
            this.specialization = specialization;
        } else {
            throw new IllegalArgumentException("Specialization cannot be empty");
        }
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        } else {
            throw new IllegalArgumentException("Experience cannot be negative");
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Trainer: " + name +
                ", specialization=" + specialization +
                ", experience=" + experienceYears + " years");
    }

    public boolean isExperienced() {
        return experienceYears >= 5;
    }
}

