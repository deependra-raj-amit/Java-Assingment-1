// Define the interface Person
interface Person {
    void speak(); // Abstract method
}

// Implement the Person interface in the Student class
class Student implements Person {
    @Override
    public void speak() {
        System.out.println("Hello! I am a Student. I love to learn.");
    }
}

// Implement the Person interface in the Teacher class
class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("Hello! I am a Teacher. I enjoy teaching.");
    }
}

// Main class to demonstrate the functionality
public class PersonDemo {
    public static void main(String[] args) {
        // Create an object of Student and call its speak method
        Person student = new Student();
        student.speak();

        // Create an object of Teacher and call its speak method
        Person teacher = new Teacher();
        teacher.speak();
    }
}
