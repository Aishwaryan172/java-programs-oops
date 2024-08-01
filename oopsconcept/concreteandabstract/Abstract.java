package oopsconcept.concreteandabstract;

abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method (with implementation)
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
        circle.display();
        circle.draw();
        
        rectangle.display();
        rectangle.draw();
    }    
}
