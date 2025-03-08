public interface State {
    void doAction();
    State getNextState();
    State getPreviousState();
}
