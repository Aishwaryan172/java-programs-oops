package oopsconcept.staticandnonstaticmethod;

public class NonstaticEx1 {
    String brand="Nexon";
    void start(){
        System.out.println("car started");
    }
    public static void main(String[] args) {
        NonstaticEx1 car1=new NonstaticEx1();
        NonstaticEx1 car2=new NonstaticEx1();
        System.out.println("brand : "+ car1.brand);
        car1.start();
        car2.brand="suzuki";
        System.out.println("brand : " +car2.brand);
    }
}
