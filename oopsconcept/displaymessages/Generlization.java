package oopsconcept.displaymessages;
class Shape{
    void display(){
        System.out.println("box");
    }
    void print(){
        System.out.println("hollo aishu");
    }
}
class Circle extends Shape{ 
    void display(){
        System.out.println("circle");
    }
    void hii(){
        System.out.println("good morning");
    }
} 
class Rectangle extends Shape{
    void display(){
        System.out.println("rectangle");
    }
}
public class Generlization {
    public static void main(String[] args) {
       Shape s=new Shape();
       s.display();
       s.print();  
       Circle a=new Circle();
       a.display();
       a.hii();
    }
}
