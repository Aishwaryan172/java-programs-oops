package oopsconcept.constructor;
public class ConstructorOverloading {
    ConstructorOverloading(String name){
        System.out.println(name);
    }
    ConstructorOverloading(double salary){
        System.out.println(salary);
    }
    ConstructorOverloading(String name, double salary){
        System.out.println(name);
        System.out.println(salary);
    }
    ConstructorOverloading(double salary, String name){
        System.out.println(name);
        System.out.println(salary);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ConstructorOverloading e1=new ConstructorOverloading("aishu");
        new ConstructorOverloading(11000);
        new ConstructorOverloading("aishu", 10000);
        new ConstructorOverloading(10000, "aishu");
    }
}
