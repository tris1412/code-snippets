// OOPDemo.java
// Demonstration of Object-Oriented Programming in Java

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        myDog.makeSound();
    }
}
