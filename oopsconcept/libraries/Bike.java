package oopsconcept.libraries;
class laptop{
    String model;
    int price;
    public String toString(){
        return "hey";
    }
}
public class Bike {
    public static void main(String[] args) {
        laptop b=new laptop();
        b.model="lenovo";
        b.price=1000;
        System.out.println(b.toString());
    }
}
