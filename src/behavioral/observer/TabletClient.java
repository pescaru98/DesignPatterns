package behavioral.observer;

public class TabletClient extends Observer{

    public TabletClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("Tablet Stream: " + subject.getState());
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }
}
