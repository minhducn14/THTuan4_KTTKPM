public class TaxVAT implements TaxStrategy {
    private double rate = 0.1; // 10% VAT

    @Override
    public void calculateTax() {
        System.out.println("Calculating VAT tax at rate: " + (rate * 100) + "%");
    }
}
