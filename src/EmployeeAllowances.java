import java.util.Scanner;

public class EmployeeAllowances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's basic salary: ");
        double salary = scanner.nextDouble();

        double da = salary * 0.12;
        double hra = salary * 0.13;
        double pf = salary * 0.15;
        double grossSalary = salary + da + hra - pf;

        System.out.println("Employee Allowances:");
        System.out.println("Basic Salary: " + salary);
        System.out.println("DA (12%): " + da);
        System.out.println("HRA (13%): " + hra);
        System.out.println("PF (15%): " + pf);
        System.out.println("Gross Salary: " + grossSalary);

        scanner.close();
    }
}
