public class TaxConsumption implements TaxStrategy {
    private double rate = 0.05; // 5% consumption tax
    
    @Override
    public void calculateTax() {
        System.out.println("Calculating Consumption tax at rate: " + (rate * 100) + "%");
    }
}
