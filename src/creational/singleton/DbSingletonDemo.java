package creational.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        DbSingletonEnhEnh instance = DbSingletonEnhEnh.getInstance();
        System.out.println(instance);
        DbSingletonEnhEnh instance2 = DbSingletonEnhEnh.getInstance();
        System.out.println(instance2);
    }
}
