package oopsconcept.nonprimitiveclasscasting;

class father{
    void display(){
        System.out.println("old man");
    }
}
class son extends father{
    void display(){
        System.out.println("new son");
    }
}
class doughter extends father{
    void display(){
        System.out.println("new doughter");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        father s=new son();//upcasting father to son class
        father d=new doughter();//upcasting father to doughter class
        s.display();//new son
        d.display();//new doughter
    }
}
