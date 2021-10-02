package behavioral.memento;

public class MementoDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Employee emp = new Employee();

        emp.setName("John Wick");
        emp.setAddress("111 main street");
        emp.setPhone("888-444-2343");

        System.out.println("Employee before save: " + emp);
        careTaker.save(emp);

        emp.setPhone("222-233-6432");
        careTaker.save(emp);

        System.out.println("Employee after changed phone number: " + emp);

        emp.setPhone("333-111-000");
        careTaker.revert(emp);
        System.out.println("Reverts to last save point: " + emp);

        careTaker.revert(emp);
        System.out.println("Reverts to original: " + emp);
    }
}
