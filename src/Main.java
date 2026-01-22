public class Main {
    public static void main(String[] args) {
        // 1. Welcome message
        System.out.println("=== Hospital Management System ===");
        System.out.println();

        // 2. Create Objects
        Patient patient1 = new Patient(101, "John Doe", 25, "A+");
        Patient patient2 = new Patient(102, "Jane Smith", 17, "O+");

        Doctor doctor1 = new Doctor(201, "Dr. Sarah Lee", "Surgeon", 10);
        Doctor doctor2 = new Doctor(202, "Dr. Michael Brown", "General", 3);

        Appointment appointment1 = new Appointment(301, "John Doe", "Dr. Sarah Lee", "2026-01-25");
        Appointment appointment2 = new Appointment(302, "Jane Smith", "Dr. Michael Brown", "2026-01-26");

        // 3. Display All Objects
        System.out.println("--- PATIENTS ---");
        System.out.println(patient1);
        System.out.println(patient2);

        System.out.println("--- DOCTORS ---");
        System.out.println(doctor1);
        System.out.println(doctor2);

        System.out.println("--- APPOINTMENTS ---");
        System.out.println(appointment1);
        System.out.println(appointment2);

        // 4. Test Getters
        System.out.println("--- TESTING GETTERS ---");
        System.out.println("Patient 1 age: " + patient1.getAge());
        System.out.println("Doctor 1 specialization: " + doctor1.getSpecialization());

        // 5. Test Setters
        patient1.setAge(26);
        System.out.println("Updated Patient 1 age: " + patient1.getAge());

        // 6. Test Additional Methods
        System.out.println("--- TESTING METHODS ---");
        System.out.println("Is Patient 1 a minor? " + patient1.isMinor());
        System.out.println("Is Doctor 1 experienced? " + doctor1.isExperienced());
        appointment1.reschedule("2026-01-30");
        System.out.println("Updated Appointment 1: " + appointment1);

        // 7. Final Summary
        System.out.println("--- FINAL STATE ---");
        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(appointment1);
        System.out.println(appointment2);

        // 8. Completion message
        System.out.println("\n=== Program Complete ===");
    }
}
