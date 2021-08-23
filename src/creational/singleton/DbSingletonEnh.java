package creational.singleton;

/** Not thread safe, lazily loaded
 * Lazily loaded because we get an instance, not at the starting point,
 * but when someone calls getInstance()
 * */
public class DbSingletonEnh {
    private static DbSingletonEnh instance = null;

    private DbSingletonEnh(){}


    public static DbSingletonEnh getInstance(){
        if(instance == null){
            instance = new DbSingletonEnh();
        }
        return instance;
    }
}