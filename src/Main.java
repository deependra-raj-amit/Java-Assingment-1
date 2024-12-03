// Class Person
class Person1 {
    // Attributes
    String name;
    int age;

    // Constructor
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
}

// Class Student inheriting Person
class Student1 extends Person1 {
    // Additional attribute
    int grade;

    // Constructor
    public Student1(String name, int age, int grade) {
        super(name, age); // Initialize name and age using the superclass constructor
        this.grade = grade;
    }

    // Method to display grade details
    public void study() {
        System.out.println("I am studying for grade: " + grade + ".");
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student1 student1 = new Student1("Deependra", 21, 12);

        // Call methods
        student1.speak();
        student1.study();
    }
}
