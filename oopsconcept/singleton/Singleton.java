package oopsconcept.singleton;
public class Singleton {
    // Private static instance of the same class
    private static Singleton singleInstance = null;
    
    // Variable of type String
    public String s;
    
    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        s = "Hello, I am a part of the Singleton class";
    }
    
    // Static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (singleInstance == null)
            singleInstance = new Singleton();
        
        return singleInstance;
    }
}

 