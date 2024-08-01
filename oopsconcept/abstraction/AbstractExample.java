package oopsconcept.abstraction;
abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("bow bow");
    }
}
public class AbstractExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();
    }
}
    