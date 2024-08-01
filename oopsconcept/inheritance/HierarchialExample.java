package oopsconcept.inheritance;

class Vechical{
    String brand = "Honda";
}

class Car extends Vechical{
    String colour = "White";
    void start(){
        System.out.println("Car Started");
    }
}
class Bike extends Vechical{
     double cost = 45000;
    void stop(){
        System.out.println("Car stoped");
    }
}
public class HierarchialExample {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.colour);
        c.start();
        Bike b = new Bike();
        System.out.println(b.cost);
        b.stop();
    
    }
}
