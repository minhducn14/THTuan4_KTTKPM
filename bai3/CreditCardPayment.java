public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public double processPayment(double amount) {
        System.out.println("Processing $" + amount + " using Credit Card: " + cardNumber);
        return amount;
    }
}