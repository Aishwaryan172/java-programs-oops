package oopsconcept.libraries;

public class Car {
    public static void main(String[] args) {
        Car c= new Car();
        System.out.println(c.hashCode());
    }

public int hashCode(){
    return 234;
}
}