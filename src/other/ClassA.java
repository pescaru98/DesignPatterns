package other;

public class ClassA {
    public void methodA() {
        System.out.println("METHOD A");
    }

    public void methodAWithParams(int paramA, int paramB) {
        System.out.println("Method with PARAM: " + paramA + " " + paramB);
    }

    public int methodAWithParamsAndReturn(int paramA, int paramB) {
        System.out.println("Method with param and RETURN: " + paramA + " " + paramB);
        return 5;
    }
}
