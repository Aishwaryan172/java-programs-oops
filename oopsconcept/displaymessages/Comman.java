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
public class Comman {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.display();
        s=new Rectangle();
        s.display();
    }
}
