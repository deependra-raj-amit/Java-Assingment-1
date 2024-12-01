// Base class Animal
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Derived class Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        // Creating Dog and Cat objects
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Demonstrating method overriding
        dog.makeSound(); // Calls Dog's makeSound
        cat.makeSound(); // Calls Cat's makeSound
    }
}
