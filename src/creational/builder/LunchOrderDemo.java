package creational.builder;

public class LunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        LunchOrder lunchOrder = builder.condiments("Pepper").bread("White_Bread").build();

        System.out.println(lunchOrder.getCondiments());
    }
}
