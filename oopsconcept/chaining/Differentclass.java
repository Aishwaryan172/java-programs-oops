package oopsconcept.chaining;
class Father{
    void mother(){
        System.out.println("old bike");
    }
}
class Son extends Father{
    void oldson(){
        super.mother();
        System.out.println("new bike");
    }
}

public class Differentclass {
    public static void main(String[] args) {
        Son s=new Son();
        s.oldson();
    }
}
