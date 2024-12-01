// Calculator class demonstrating method overloading
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the add method with two arguments
        int sum1 = calc.add(10, 20);
        System.out.println("Sum of two numbers: " + sum1);

        // Calling the add method with three arguments
        int sum2 = calc.add(10, 20, 30);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
