public class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public double processPayment(double amount) {
        System.out.println("Processing $" + amount + " using PayPal account: " + email);
        return amount;
    }
}