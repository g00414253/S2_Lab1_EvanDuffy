package productv5;

import java.util.Scanner;

public class ProductApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        Product myProduct=new Product();

        // perform 1 or more selections
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter product code: ");
            String productCode = sc.nextLine();  // read the product code

            // get the Product object "p"
            myProduct= ProductDB.getProduct(productCode);

            // display the output

            System.out.println();
            if (myProduct != null) {
                System.out.println("Description: " + myProduct.toString());
                System.out.println("Price:       " + myProduct.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            System.out.println("Product count: " + Product.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}