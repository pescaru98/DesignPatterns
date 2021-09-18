package other;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO - make it work with constructors that have variablees too
 * TODO - make it return a value for methods that returns something
 */
public class ThreadUtils implements Runnable {

    public static class Builder {
        private String methodName;
        private Class methodsClass;
        private List<Object> params;
        private List<Class> paramsTypes;

        public Builder methodName(String methodName) {
            this.methodName = methodName;
            return this;
        }

        public Builder methodsClass(Class methodsClass) {
            this.methodsClass = methodsClass;
            return this;
        }

        public Builder params(Object... params) {
            this.params = new ArrayList();
            for (Object param : params)
                this.params.add(param);
            return this;
        }

        public Builder paramsTypes(Class... paramsTypes) {
            this.paramsTypes = new ArrayList<>();
            for (Class paramType : paramsTypes)
                this.paramsTypes.add(paramType);
            return this;
        }

        public ThreadUtils build() {
            return new ThreadUtils(this);
        }
    }

    private String methodName;
    private Class methodsClass;
    private List<Object> params;
    private List<Class> paramsTypes;
    private volatile Object returnedValue;

    public ThreadUtils(String methodName, Class methodsClass) {
        this.methodName = methodName;
        this.methodsClass = methodsClass;
    }

    public ThreadUtils(Builder builder) {
        this.methodName = builder.methodName;
        this.methodsClass = builder.methodsClass;
        this.params = builder.params;
        this.paramsTypes = builder.paramsTypes;
    }

    public ThreadUtils(String methodName, Class methodsClass, List<Object> params, List<Class> paramsTypes) {
        this.methodName = methodName;
        this.methodsClass = methodsClass;
        this.params = params;
        this.paramsTypes = paramsTypes;
    }

    private void runAsync() {
        /**
         * TODO Check if the "if else" is needed
         */
        try {
            if (params != null && params.size() != 0) {
                Method method = methodsClass.getDeclaredMethod(methodName, paramsTypes.toArray(new Class[paramsTypes.size()]));
                returnedValue = method.invoke(methodsClass.getConstructor().newInstance(), params.toArray(new Object[params.size()]));
            } else {
                Method method = methodsClass.getDeclaredMethod(methodName);
                returnedValue = method.invoke(methodsClass.getConstructor().newInstance());
            }
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        runAsync();
    }

    public Object getReturnedValue() {
        return returnedValue;
    }
}
