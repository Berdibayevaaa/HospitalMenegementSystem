package menu;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalMenu implements Menu {
    private ArrayList<MedicalStaff> hospitalStaff;
    private Scanner scanner;

    public HospitalMenu() {
        this.hospitalStaff = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        // Тестовые данные
        hospitalStaff.add(new Doctor(1, "Dr. Smith", 45, "123 Street, City", "Cardiologist"));
        hospitalStaff.add(new Patient(2, "John Doe", 30, "123 Street, City", "No known allergies"));
    }

    @Override
    public void displayMenu() {
        System.out.println("\n========================================");
        System.out.println(" HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Add Doctor");
        System.out.println("2. Add Patient");
        System.out.println("3. View All Staff");
        System.out.println("4. Make All Staff Work");
        System.out.println("0. Exit");
        System.out.println("========================================");
    }

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Enter choice: ");
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1: addDoctor(); break;
                    case 2: addPatient(); break;
                    case 3: viewAllStaff(); break;
                    case 4: demonstrateWork(); break;
                    case 0: running = false; break;
                    default: System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private void addDoctor() {
        try {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Specialization: ");
            String specialization = scanner.nextLine();
            Doctor doctor = new Doctor(id, name, age, address, specialization);
            hospitalStaff.add(doctor);
            System.out.println("Doctor added!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void addPatient() {
    }

    private void viewAllStaff() {

    }

    private void demonstrateWork() {
        for (MedicalStaff staff : hospitalStaff) {
            staff.work();
        }
    }
}

