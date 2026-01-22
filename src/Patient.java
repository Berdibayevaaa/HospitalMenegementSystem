public class Patient {
    // Private Fields
    private int patientId;
    private String fullName;
    private int age;
    private String bloodType;

    // Constructor with parameters
    public Patient(int patientId, String fullName, int age, String bloodType) {
        this.patientId = patientId;
        this.fullName = fullName;
        this.age = age;
        this.bloodType = bloodType;
    }

    // Default constructor (optional)
    public Patient() {
        this.patientId = 0;
        this.fullName = "Unknown";
        this.age = 0;
        this.bloodType = "Unknown";
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }

    // Setters
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // Methods with business logic
    public boolean isMinor() {
        return this.age < 18;
    }

    public String getAgeCategory() {
        return isMinor() ? "Minor" : "Adult";
    }

    // toString method to display patient info
    @Override
    public String toString() {
        return "Patient{ID=" + patientId + ", Name='" + fullName + "', Age=" + age + ", Blood Type='" + bloodType + "'}";
    }
}
