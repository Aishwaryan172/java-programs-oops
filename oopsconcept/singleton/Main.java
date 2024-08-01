package oopsconcept.singleton;

public class Main {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
        
        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
        
        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
        
        // Changing variable of instance x
        x.s = x.s.toUpperCase();
        
        // Print statements for instance x, y and z
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
        
        // Changing variable of instance y
        y.s = y.s.toLowerCase();
        
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
