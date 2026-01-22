public class Appointment {
    // Поля для записи на прием
    private int appointmentId;
    private String patientName;
    private String doctorName;
    private String date;

    // Конструктор с параметрами
    public Appointment(int appointmentId, String patientName, String doctorName, String date) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.date = date;
    }

    // Геттеры
    public int getAppointmentId() { return appointmentId; }
    public String getPatientName() { return patientName; }
    public String getDoctorName() { return doctorName; }
    public String getDate() { return date; }

    // Сеттеры
    public void setAppointmentId(int appointmentId) { this.appointmentId = appointmentId; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public void setDate(String date) { this.date = date; }

    // Метод для переноса записи
    public void reschedule(String newDate) {
        this.date = newDate;
    }

    // Метод для отмены записи
    public void cancel() {
        this.date = "Cancelled";
    }

    // Метод toString
    @Override
    public String toString() {
        return "Appointment{ID=" + appointmentId + ", Patient='" + patientName + "', Doctor='" + doctorName + "', Date='" + date + "'}";
    }
}
