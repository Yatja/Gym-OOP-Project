package Gym_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<Equipment> equipmentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        members.add(new Member(1, "John", 22, true));
        members.add(new Member(2, "Ayan", 17, true));
        equipmentList.add(new Equipment(1, "Treadmill", "Good", true));
        equipmentList.add(new Equipment(2, "Bike", "Good", true));
        int choice;
        do {
            System.out.println("\n=== Gym Management System ===");
            System.out.println("1. Add Member");
            System.out.println("2. View All Members");
            System.out.println("3. Add Equipment");
            System.out.println("4. View All Equipment");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addMember(scanner);
                case 2 -> viewMembers();
                case 3 -> addEquipment(scanner);
                case 4 -> viewEquipment();
                case 0 -> System.out.println("Program terminated.");
                default -> System.out.println("Invalid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
    private static void addMember(Scanner scanner) {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            members.add(new Member(id, name, age, true));
            System.out.println("Member added.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void viewMembers() {
        System.out.println("\n--- Members ---");
        for (Member m : members) {
            System.out.println(m);
        }
    }
    private static void addEquipment(Scanner scanner) {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Condition: ");
            String condition = scanner.nextLine();

            equipmentList.add(new Equipment(id, name, condition, true));
            System.out.println("Equipment added.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.nextLine();
        }
    }
    private static void viewEquipment() {
        System.out.println("\n--- Equipment ---");
        for (Equipment e : equipmentList) {
            System.out.println(e);
        }
    }
}

