package Gym_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<Person> people = new ArrayList<>();


        people.add(new Member(1, "John", 22, true));
        people.add(new Trainers(2, "Alex", "Yoga", 6));
        people.add(new Member(3, "Ayan", 17, true));

        boolean running = true;

        while (running) {
            System.out.println("\n=== Gym Menu ===");
            System.out.println("1. View All");
            System.out.println("2. Add Member");
            System.out.println("3. Add Trainer");
            System.out.println("4. Signed");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    for (Person p : people) {
                        p.showInfo(); 
                    }
                    break;

                case 2:
                    System.out.print("Name: ");
                    String mName = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    people.add(new Member(people.size() + 1, mName, age, true));
                    break;

                case 3:
                    System.out.print("Name: ");
                    String tName = scanner.nextLine();
                    System.out.print("Specialization: ");
                    String spec = scanner.nextLine();
                    people.add(new Trainers(people.size() + 1, tName, spec, 0));
                    break;

                case 4:
                    for (Person p : people) {
                        if (p instanceof Trainers) {
                            Trainers t = (Trainers) p;
                            System.out.println(t.name + " experienced: " + t.isExperienced());
                        }
                    }
                    break;

                case 0:
                    running = false;
                    break;
            }
        }
    }
}


