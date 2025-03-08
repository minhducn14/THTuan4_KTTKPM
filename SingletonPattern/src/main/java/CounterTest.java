public class CounterTest {
    public static void main(String[] args) {
        Counter counter1 = Counter.getInstance();
        Counter counter2 = Counter.getInstance();

        counter1.increment();
        counter2.increment();

        System.out.println("Counter1 value: " + counter1.getCount());
        System.out.println("Counter2 value: " + counter2.getCount());

        System.out.println("Are counter1 and counter2 the same object? " + (counter1 == counter2));
    }
}