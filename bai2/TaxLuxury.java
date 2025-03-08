public class TaxLuxury implements TaxStrategy {
    private double rate = 0.2; // 20% luxury tax
    
    @Override
    public void calculateTax() {
        System.out.println("Calculating Luxury tax at rate: " + (rate * 100) + "%");
    }
}