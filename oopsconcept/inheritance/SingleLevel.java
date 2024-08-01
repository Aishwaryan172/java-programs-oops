package oopsconcept.inheritance;

class perent{
    void colour(){
        System.out.println("hair block");
    }
}
class child extends perent{
    void grey(){
        System.out.println("hair grey");
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        child ch=new child();
        ch.colour();
        ch.grey();
    }
}
