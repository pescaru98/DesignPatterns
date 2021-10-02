package behavioral.state;

public class Fan {
    State fanOffState;
    State fanLowState;
    State fanMedState;

    State state;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);

        state = fanOffState;
    }

    public void pullChain() {
        state.handleRequest();
    }

    @Override
    public String toString() {
        return state.toString();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getFanLowState() {
        return fanOffState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
