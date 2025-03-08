public abstract class PaymentDecorator implements Payment {
    protected Payment payment;

    public PaymentDecorator(Payment payment) {
        this.payment = payment;
    }

    @Override
    public double processPayment(double amount) {
        return payment.processPayment(amount);
    }
}