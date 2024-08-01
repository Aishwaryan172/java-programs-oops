package oopsconcept.methodoverloading;

class House{
    void colour(){
        System.out.println("blue colour");
    }
}
class MyHouse extends House{
    void colour(){
    System.out.println("pink colour");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        House H=new MyHouse();
        H.colour();
}
}