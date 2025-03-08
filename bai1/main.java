public class main {
    public static void main(String[] args) {
        Order order = new Order();

        State newState = new NewState();

        order.setState(newState);
        order.doAction();

        State processingState = new ProcessingState();
        order.setState(processingState);
        order.doAction();
    }
}
