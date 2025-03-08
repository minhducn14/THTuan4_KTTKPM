public class Order {
    private State state;

    public Order() {
        state = new NewState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction();
    }

    public void nextState() {
        state = state.getNextState();
    }

    public void previousState() {
        state = state.getPreviousState();
    }
}