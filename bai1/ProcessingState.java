public class ProcessingState implements State {
    @Override
    public void doAction() {
        System.out.println("Packaging and shipping the order...");
    }

    @Override
    public State getNextState() {
        return new DeliveredState();
    }

    @Override
    public State getPreviousState() {
        return new NewState();
    }
}