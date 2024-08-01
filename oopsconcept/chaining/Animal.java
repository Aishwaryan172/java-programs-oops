package oopsconcept.chaining;
public class Animal {
    private String name;

    // Constructor of the superclass
    public Animal() {
        this("Unknown Animal"); // Calls the parameterized constructor
        System.out.println("Animal: Default constructor called");
    }

    // Parameterized constructor of the superclass
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal: Constructor with one parameter called");
    }

    // Method to display Animal details
    public void display() {
        System.out.println("Animal Name: " + name);
    }
}
