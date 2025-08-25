// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        // Upcasting - reference of parent, object of child
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.sound();  // Output: Cat meows
    }
}
