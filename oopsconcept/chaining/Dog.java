package oopsconcept.chaining;
public class Dog extends Animal {
    private int age;

    // Constructor of the subclass
    public Dog() {
        this(0); // Calls the parameterized constructor
        System.out.println("Dog: Default constructor called");
    }

    // Parameterized constructor of the subclass
    public Dog(int age) {
        super("Dog"); // Calls the superclass constructor
        this.age = age;
        System.out.println("Dog: Constructor with one parameter called");
    }

    // Method to display Dog details
    public void display() {
        super.display();
        System.out.println("Dog Age: " + age);
    }
}
