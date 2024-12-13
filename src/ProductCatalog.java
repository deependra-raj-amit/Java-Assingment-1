import java.util.Scanner;

public class ProductCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store product names
        String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "Printer"};

        System.out.println("Enter the product name to search:");
        String searchProduct = scanner.nextLine();

        // Flag to check if the product is found
        boolean isFound = false;

        // Search for the product in the catalog
        for (String product : products) {
            if (product.equalsIgnoreCase(searchProduct)) {
                isFound = true;
                break;
            }
        }

        // Display search results
        if (isFound) {
            System.out.println("Product " + searchProduct + " is available.");
        } else {
            System.out.println("Product " + searchProduct + " is not available.");
        }

        scanner.close();
    }
}
