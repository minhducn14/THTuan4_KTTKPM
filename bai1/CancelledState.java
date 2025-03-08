public class CancelledState implements State {
    @Override
    public void doAction() {
        System.out.println("Order cancelled, processing refund...");
    }

    @Override
    public State getNextState() {
        return this;
    }

    @Override
    public State getPreviousState() {
        return new DeliveredState();
    }
}