public class Doctor {
    // Private Fields
    private int doctorId;
    private String name;
    private String specialization;
    private int experienceYears;

    // Constructor with parameters
    public Doctor(int doctorId, String name, String specialization, int experienceYears) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
    }

    // Default constructor (optional)
    public Doctor() {
        this.doctorId = 0;
        this.name = "Unknown";
        this.specialization = "General";
        this.experienceYears = 0;
    }

    // Getters
    public int getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Setters
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    // Methods with business logic
    public boolean isExperienced() {
        return this.experienceYears > 5;
    }

    public boolean canPerformSurgery() {
        return "Surgeon".equalsIgnoreCase(this.specialization);
    }

    // toString method to display doctor info
    @Override
    public String toString() {
        return "Doctor{ID=" + doctorId + ", Name='" + name + "', Specialization='" + specialization + "', Experience=" + experienceYears + " years}";
    }
}
