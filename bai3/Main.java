public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment("1234-5678-9012-3456");
        Payment creditCardWithFee = new ProcessingFeeDecorator(creditCard);

        System.out.println("Credit card payment with processing fee:");
        double finalAmount1 = creditCardWithFee.processPayment(100.0);
        System.out.println("Final amount: $" + finalAmount1);

        Payment paypal = new PayPalPayment("ggduck@gmail.com");
        Payment paypalWithDiscount = new DiscountDecorator(paypal, "SAVE10");
        Payment paypalWithDiscountAndFee = new ProcessingFeeDecorator(paypalWithDiscount);

        System.out.println("\nPayPal payment with discount and processing fee:");
        double finalAmount2 = paypalWithDiscountAndFee.processPayment(100.0);
        System.out.println("Final amount: $" + finalAmount2);
    }
}