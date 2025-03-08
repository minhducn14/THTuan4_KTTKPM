public class ProcessingFeeDecorator extends PaymentDecorator {
    private double feePercentage = 0.02; // 2% processing fee

    public ProcessingFeeDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public double processPayment(double amount) {
        double fee = amount * feePercentage;
        System.out.println("Adding processing fee: $" + fee);
        return super.processPayment(amount + fee);
    }
}