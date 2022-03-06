import java.math.BigDecimal;

public class Tax_Calculation {
    public static void main(String[] args) {

        double withoutVAT = 9.99;
        System.out.println("The price of the product without VAT is " + withoutVAT);

        double withVAT = withoutVAT * 1.23;
        System.out.println("The price of the product with VAT included is " + withVAT);

        double valueWithVAT = withVAT * 10000;
        System.out.println("The price of 10000 pcs od this product with VAT included is " + valueWithVAT);

        double valueWithoutVAT = valueWithVAT / 1.23;
        System.out.println("The price of 10000 pcs of this product without VAT is " + valueWithoutVAT);

        // Using the BigDecimal class
        System.out.println("");
        System.out.println("After using Big Decimal:");

        BigDecimal bdWithoutVAT = new BigDecimal("9.99");
        System.out.println("The price of the product without VAT is " + bdWithoutVAT);

        BigDecimal bdWithVAT = bdWithoutVAT.multiply(new BigDecimal("1.23"));

        bdWithVAT = bdWithVAT.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("The price of the product with VAT included and rounded is " + bdWithVAT);

        BigDecimal bdValueWithVAT = bdWithVAT.multiply(new BigDecimal(10000));
        System.out.println("The price of 10000 pcs of this product with VAT included and rounded is " + bdValueWithVAT);

        BigDecimal bdValueWithoutVAT = bdValueWithVAT.divide(new BigDecimal("1.23"), BigDecimal.ROUND_HALF_EVEN);
        System.out.println("The price of 10000 pcs of this product without VAT and rounded is " + bdValueWithoutVAT);



}
    }

