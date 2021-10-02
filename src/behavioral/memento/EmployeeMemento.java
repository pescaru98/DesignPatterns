package behavioral.memento;

/**
 * This is "Memento"
 * We only care about name and phone, not the address
 */
public class EmployeeMemento {
    private String name;
    private String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
