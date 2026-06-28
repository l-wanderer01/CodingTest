import java.util.*;

public class Main {

    private static class Product {
        String productName;
        int productCode;

        private Product() {
            this.productName = "codetree";
            this.productCode = 50;
        }
        private Product(String productName, int productCode) {
            this.productName = productName;
            this.productCode = productCode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        Product p2 = new Product(sc.next(), sc.nextInt());
        
        System.out.printf("product %d is %s\n", p1.productCode, p1.productName);
        System.out.printf("product %d is %s", p2.productCode, p2.productName);
    }
}