package oopsconcept.inheritance;

class son{
    void display(){
        System.out.println("new bike");
    }
}
class father extends son{
    void display(){
        super.display();
        System.out.println("old bike");
    }
}
class doughter extends father{
    void display(){
        super.display();
        System.out.println("scooty");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        doughter sc=new doughter();
        sc.display();
    }
}
