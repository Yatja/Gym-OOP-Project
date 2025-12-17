package Gym_system;

public class FitnessClass {
    private int id;
    private String name;
    private Trainers trainer;
    private int maxParticipants;
    public FitnessClass(int id, String name, Trainers trainer, int maxParticipants) {
        this.id = id;
        this.name = name;
        this.trainer = trainer;
        this.maxParticipants = maxParticipants;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public Trainers getTrainer() { return trainer; }
    public int getMaxParticipants() { return maxParticipants; }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setTrainer(Trainers trainer) { this.trainer = trainer; }
    public void setMaxParticipants(int maxParticipants) { this.maxParticipants = maxParticipants; }
    public String toString() {
        return "Gym_system.FitnessClass{id=" + id + ", name='" + name + "', trainer=" + trainer.getName() + ", maxParticipants=" + maxParticipants + "}";
    }
}