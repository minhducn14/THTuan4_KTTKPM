public class DiscountDecorator extends PaymentDecorator {
    private String discountCode;
    private double discountPercentage = 0.1; // 10% discount

    public DiscountDecorator(Payment payment, String discountCode) {
        super(payment);
        this.discountCode = discountCode;
    }

    @Override
    public double processPayment(double amount) {
        double discount = amount * discountPercentage;
        System.out.println("Applying discount code " + discountCode + ": -$" + discount);
        return super.processPayment(amount - discount);
    }
}