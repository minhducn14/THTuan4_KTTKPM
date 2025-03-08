public class DeliveredState implements State {
    @Override
    public void doAction() {
        System.out.println("Order has been delivered successfully!");
    }

    @Override
    public State getNextState() {
        return new CancelledState();
    }

    @Override
    public State getPreviousState() {
        return new ProcessingState();
    }
}