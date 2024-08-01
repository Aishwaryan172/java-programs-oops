package oopsconcept.chaining;
public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this("Unknown"); // Calls the constructor with one parameter
        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    public Person(String name) {
        this(name, 0); // Calls the constructor with two parameters
        System.out.println("Constructor with one parameter called");
    }

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor with two parameters called");
    }

    // Method to display Person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person("Alice");
        p2.display();
        Person p3 = new Person("Bob", 25);
        p3.display();
    }
}