package model;

public abstract class MedicalStaff {
    protected int id;
    protected String name;
    protected int age;
    protected String address;

    public MedicalStaff(int id, String name, int age, String address) {
        setId(id);
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public abstract void work();
    public abstract String getRole();


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address = address;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be positive");
        }
        this.id = id;
    }


    public void displayInfo() {
        System.out.println(name + " - " + age + " years old");
    }
}
