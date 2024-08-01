package oopsconcept.displaymessages;
class Shape{
    void display(){
        System.out.println("box");
    }
}
class Circle extends Shape{ 
    void display(){
        System.out.println("circle");
    }
}
class Rectangle extends Shape{
    void display(){
        System.out.println("rectangle");
    }
}
public class Specialization {
    public static void main(String[] args) {
        Shape s=new Circle();
        Shape f=new Rectangle();
        s.display();
        f.display();
    }
}
