public class Test {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Attempt to modify the string
        str =" World";
        System.out.println("After concat: " + str); // Prints "Hello"
    }
}
