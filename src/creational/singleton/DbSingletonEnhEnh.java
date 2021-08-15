package creational.singleton;

/** Lazily loaded, thread safe*/
public class DbSingletonEnhEnh {
    private static volatile DbSingletonEnhEnh instance = null;

    private DbSingletonEnhEnh() {
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    public static DbSingletonEnhEnh getInstance() {
        if(instance == null){
            synchronized (DbSingletonEnhEnh.class){
                if(instance == null){
                    instance = new DbSingletonEnhEnh();
                }
            }
        }
        return instance;
    }
}
