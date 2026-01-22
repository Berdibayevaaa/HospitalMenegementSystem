package model;

public class Patient extends MedicalStaff {
    private String medicalHistory;

    public Patient(int id, String name, int age, String address, String medicalHistory) {
        super(id, name, age, address);
        setMedicalHistory(medicalHistory);
    }

    @Override
    public void work() {
        System.out.println(name + " is receiving medical treatment.");
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    public void setMedicalHistory(String medicalHistory) {
        if (medicalHistory == null || medicalHistory.trim().isEmpty()) {
            throw new IllegalArgumentException("Medical history cannot be empty");
        }
        this.medicalHistory = medicalHistory;
    }
}
