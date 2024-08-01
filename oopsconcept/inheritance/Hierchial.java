package oopsconcept.inheritance;
class perent{
    void colour(){
        System.out.println("black colour");
    }
}
class aishu extends perent{
    void blue(){
        System.out.println("colour is blue");
        
    }
}
class preethu extends perent{
    void pink(){
        System.out.println("colour is pink");
    }
}

public class Hierchial {
    public static void main(String[] args) {
        preethu p=new preethu();
        p.pink();
    }
}
