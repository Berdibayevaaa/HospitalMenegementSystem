public class Doctor extends MedicalStaff {
    // Дополнительное поле, специфичное для Doctor
    private String specialization;

    // Конструктор - использует super() для вызова конструктора родителя
    public Doctor(int id, String name, int age, String address, String specialization) {
        super(id, name, age, address); // ОБЯЗАТЕЛЬНО ПЕРВЫМ!
        this.specialization = specialization;
    }

    // Геттер и Сеттер для нового поля
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }

    // Переопределение метода work()
    @Override
    public void work() {
        System.out.println(name + " is performing medical duties as a " + specialization + ".");
    }

    // Переопределение метода getRole()
    @Override
    public String getRole() {
        return "Doctor";
    }

    // Новый метод, специфичный для Doctor
    public void performSurgery() {
        if ("Surgeon".equalsIgnoreCase(specialization)) {
            System.out.println(name + " is performing a surgery.");
        } else {
            System.out.println(name + " cannot perform surgery.");
        }
    }

    // Метод toString
    @Override
    public String toString() {
        return super.toString() + " | Specialization: " + specialization;
    }
}
