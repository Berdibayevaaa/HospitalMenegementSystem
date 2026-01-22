package model;

public class Doctor extends MedicalStaff {
    private String specialization;

    public Doctor(int id, String name, int age, String address, String specialization) {
        super(id, name, age, address);
        setSpecialization(specialization);
    }

    @Override
    public void work() {
        System.out.println(name + " is performing medical duties as a " + specialization + ".");
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty");
        }
        this.specialization = specialization;
    }
}
