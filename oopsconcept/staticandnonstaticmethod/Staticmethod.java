package oopsconcept.staticandnonstaticmethod;

public class Staticmethod {
    static String brand="Nexon";
    static void start(){
        System.out.println("car Started");
    }
    public static void main(String[] args) {
        System.out.println("brand: "+ Staticmethod.brand);
        Staticmethod.start();
    }
}
