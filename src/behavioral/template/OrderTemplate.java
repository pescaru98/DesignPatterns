package behavioral.template;

/**
 * This is "AbstractBase"
 */
public abstract class OrderTemplate {

    //hook
    public boolean isGift;
    public abstract void doCheckout();
    public abstract void doPayment();
    public abstract void doReceipt();
    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift was wrapped");
    }

    public final void processOrder() {
        doCheckout();
        doPayment();
        if(isGift) {
            wrapGift();
        } else {
            doReceipt();
        }

        doDelivery();
    }
}
