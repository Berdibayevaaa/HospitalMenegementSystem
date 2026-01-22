public class Patient extends MedicalStaff {
    // Дополнительное поле, специфичное для Patient
    private String medicalHistory;

    // Конструктор - использует super() для вызова конструктора родителя
    public Patient(int id, String name, int age, String address, String medicalHistory) {
        super(id, name, age, address); // ОБЯЗАТЕЛЬНО ПЕРВЫМ!
        this.medicalHistory = medicalHistory;
    }

    // Геттер и Сеттер для нового поля
    public String getMedicalHistory() { return medicalHistory; }
    public void setMedicalHistory(String medicalHistory) { this.medicalHistory = medicalHistory; }

    // Переопределение метода work()
    @Override
    public void work() {
        System.out.println(name + " is receiving treatment.");
    }

    // Переопределение метода getRole()
    @Override
    public String getRole() {
        return "Patient";
    }

    // Новый метод, специфичный для Patient
    public void updateMedicalHistory(String newHistory) {
        this.medicalHistory = newHistory;
        System.out.println(name + "'s medical history updated.");
    }

    // Метод toString
    @Override
    public String toString() {
        return super.toString() + " | Medical History: " + medicalHistory;
    }
}
