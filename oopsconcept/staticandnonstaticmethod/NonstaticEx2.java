package oopsconcept.staticandnonstaticmethod;

public class NonstaticEx2 {
    String brand="Nexon";
    void start(){
        System.out.println("car started");
    }
    public static void main(String[] args) {
        NonstaticEx2 car=new NonstaticEx2();
        System.out.println("brand : " +car.brand);
        car.start();
}
}