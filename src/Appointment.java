public class Appointment {
    // Private Fields
    private int appointmentId;
    private String patientName;
    private String doctorName;
    private String date;

    // Constructor with parameters
    public Appointment(int appointmentId, String patientName, String doctorName, String date) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    // Default constructor (optional)
    public Appointment() {
        this.appointmentId = 0;
        this.patientName = "Unknown";
        this.doctorName = "Unknown";
        this.date = "Unknown";
    }

    // Getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Methods with business logic
    public void reschedule(String newDate) {
        this.date = newDate;
    }

    public void cancel() {
        this.date = "Cancelled";
    }

    // toString method to display appointment info
    @Override
    public String toString() {
        return "Appointment{ID=" + appointmentId + ", Patient='" + patientName + "', Doctor='" + doctorName + "', Date='" + date + "'}";
    }
}
