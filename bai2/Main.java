public class Main {
    public static void main(String[] args) {
        Product normalProduct = new Product("Book", 100, new TaxVAT());
        Product foodProduct = new Product("Rice", 50, new TaxConsumption());
        Product luxuryProduct = new Product("Diamond", 5000, new TaxLuxury());

        normalProduct.calculateProductTax();
        foodProduct.calculateProductTax();
        luxuryProduct.calculateProductTax();

        System.out.println("\nChanging tax strategy for Book...");
        normalProduct.setTaxStrategy(new TaxLuxury());
        normalProduct.calculateProductTax();
    }
}