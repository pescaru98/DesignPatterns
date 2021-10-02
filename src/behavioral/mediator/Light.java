package behavioral.mediator;

/**
 * This is "Receiver"
 */
public class Light {

    private boolean isOn = false;

    private String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    public void on() {
        System.out.println(location + " Light switched on");
    }

    public void off() {
        System.out.println(location + " Light switched off");
    }

    public boolean isOn() {
        return isOn;
    }
}
