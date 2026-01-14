package Gym_system;

public class Member extends Person {

    private int age;
    private boolean active;

    public Member(int id, String name, int age, boolean active) {
        super(id, name); 
        setAge(age);     
        this.active = active;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Member: " + name + ", age=" + age + ", active=" + active);
    }

    public void deactivate() {
        active = false;
    }
}






