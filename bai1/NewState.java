public class NewState implements State {
    @Override
    public void doAction() {
        System.out.println("Checking order information...");
    }

    @Override
    public State getNextState() {
        return new ProcessingState();
    }

    @Override
    public State getPreviousState() {
        return this;
    }
}