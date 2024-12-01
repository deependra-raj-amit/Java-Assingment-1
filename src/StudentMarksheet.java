import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student's name and marks for 3 subjects
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 3.0);

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Determine pass/fail status
        String status = (subject1 >= 50 && subject2 >= 50 && subject3 >= 50) ? "Pass" : "Fail";

        // Output the results
        System.out.println("\nStudent Marksheet:");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
