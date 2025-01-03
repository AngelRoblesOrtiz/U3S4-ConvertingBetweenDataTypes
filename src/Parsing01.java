public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = "1.05";
        String gibberish = "sbjbasbfjb";

        int price = Integer.parseInt(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        System.out.println("Total price after tax: " + (price * tax));
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        
        
        
        //Try to parse taxRate as an int
        int taxFalse = Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
        int gibber = Integer.parseInt(gibberish);
    }
    
}
