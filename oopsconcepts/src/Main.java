abstract class Animal {

    private String name;   // Encapsulation

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    abstract void sound(); // Abstraction
}

// Inheritance
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Polymorphism - Method Overriding
    void sound() {
        System.out.println("Dog says: Woof");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog("Tommy"); // Object

        d.display();
        d.sound();
    }
}
