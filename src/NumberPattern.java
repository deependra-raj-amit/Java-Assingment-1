public class NumberPattern {
    public static void main(String[] args) {
        // Outer loop for the rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for printing numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
