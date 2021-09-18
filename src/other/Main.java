package other;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InterruptedException {

        /**
         * Version of test
         */
/*        try {
            Method method = ClassA.class.getDeclaredMethod("methodAWithParamsAndReturn", int.class, int.class);
            System.out.println(method.invoke(ClassA.class.getConstructor().newInstance(), 2, 3));

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }*/

        /**
         * Version of ThreadImpl without parameters
         */
        //ThreadImpl thread = new ThreadImpl("methodA", ClassA.class);
        //new Thread(thread).start();

        /**
         * Version of ThreadImpl with parameters
         */
/*        List<Object> params = new ArrayList<>();
        params.add(2);
        params.add(6);

        List<Class> paramsTypes = new ArrayList<>();
        paramsTypes.add(int.class);
        paramsTypes.add(int.class);
        ThreadImpl thread = new ThreadImpl("methodAWithParams", ClassA.class, params, paramsTypes);
        new Thread(thread).start();*/

        /**
         * Version of ThreadImpl with parameters and builder
         */
/*        ThreadUtils.Builder threadBuilder = new ThreadUtils.Builder();
        ThreadUtils thread = threadBuilder.methodName("methodAWithParams")
                .methodsClass(ClassA.class)
                .params(2,3)
                .paramsTypes(int.class, int.class)
                .build();

        new Thread(thread).start();*/

        /**
         * Version of ThreadImpl with parameters and builder and returned value
         */
        ThreadUtils.Builder threadBuilder = new ThreadUtils.Builder();
        ThreadUtils thread = threadBuilder.methodName("methodAWithParamsAndReturn")
                .methodsClass(ClassA.class)
                .params(2,3)
                .paramsTypes(int.class, int.class)
                .build();


        Thread newTh = new Thread(thread);
        newTh.start();
        
        //newTh.join();
        System.out.println(thread.getReturnedValue());
    }
}
