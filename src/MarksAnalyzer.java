import java.util.Scanner;

public class MarksAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store marks of 12 students
        int[] marks = new int[12];

        System.out.println("Enter the marks of 12 students:");

        // Input marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Initialize highest and lowest marks
        int highest = marks[0];
        int lowest = marks[0];

        // Find highest and lowest marks
        for (int mark : marks) {
            if (mark > highest) {
                highest = mark;
            }
            if (mark < lowest) {
                lowest = mark;
            }
        }

        // Display results
        System.out.println("\nHighest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);

        scanner.close();
    }
}
