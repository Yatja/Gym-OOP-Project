package Gym_system;

public class FitnessClass {
    private int id;
    private String name;
    private Trainers trainer;
    private int maxParticipants;

    public FitnessClass(int id, String name, Trainers trainer, int maxParticipants) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        if (trainer == null) throw new IllegalArgumentException("Trainer cannot be null");
        if (maxParticipants <= 0) throw new IllegalArgumentException("Max participants must be positive");

        this.id = id;
        this.name = name;
        this.trainer = trainer;
        this.maxParticipants = maxParticipants;
    }

    public boolean canAcceptMore(int current) {
        return current < maxParticipants;
    }

    @Override
    public String toString() {
        return "FitnessClass{id=" + id + ", name='" + name +
                "', trainer=" + trainer + ", maxParticipants=" + maxParticipants + "}";
    }
}

