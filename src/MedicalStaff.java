public class MedicalStaff {
    // Защищенные поля - доступные в дочерних классах
    protected int id;
    protected String name;
    protected int age;
    protected String address;

    // Конструктор с параметрами
    public MedicalStaff(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Геттеры
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }

    // Сеттеры
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAddress(String address) { this.address = address; }

    // Метод, который будет переопределен дочерними классами
    public void work() {
        System.out.println(name + " is working.");
    }

    // Метод, который не будет переопределяться
    public String getRole() {
        return "Medical Staff";
    }

    // Метод toString
    @Override
    public String toString() {
        return "[" + getRole() + "] " + name + " (ID: " + id + ", Age: " + age + ", Address: " + address + ")";
    }
}
