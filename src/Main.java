import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем ArrayList, чтобы хранить объекты типа MedicalStaff и дочерние объекты
        ArrayList<MedicalStaff> hospitalStaff = new ArrayList<>();

        // Создаем объекты пациентов и врачей
        Patient patient1 = new Patient(1, "John Doe", 30, "123 Street, City", "No known allergies");
        Doctor doctor1 = new Doctor(2, "Dr. Smith", 45, "456 Avenue, City", "Cardiologist");
        Patient patient2 = new Patient(3, "Jane Doe", 25, "789 Road, City", "Asthma");
        Doctor doctor2 = new Doctor(4, "Dr. Lee", 50, "321 Boulevard, City", "Surgeon");

        // Добавляем объекты в список
        hospitalStaff.add(patient1);
        hospitalStaff.add(doctor1);
        hospitalStaff.add(patient2);
        hospitalStaff.add(doctor2);

        // Демонстрация полиморфизма
        System.out.println("\n=== Demonstrating Polymorphism ===");
        for (MedicalStaff staff : hospitalStaff) {
            System.out.println(staff.getRole() + ": " + staff.getName());
            staff.work(); // Вызов метода work() с полиморфизмом
            System.out.println();
        }

        // Демонстрация instanceof и даункастинга
        System.out.println("\n=== Demonstrating instanceof and Downcasting ===");
        for (MedicalStaff staff : hospitalStaff) {
            if (staff instanceof Doctor) {
                Doctor doctor = (Doctor) staff; // Даункастинг для вызова методов конкретного врача
                doctor.performSurgery();
            } else if (staff instanceof Patient) {
                Patient patient = (Patient) staff; // Даункастинг для вызова методов пациента
                patient.updateMedicalHistory("Updated history for " + patient.getName());
            }
        }
    }
}
