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
class secondSon extends father{
    void display(){
        System.out.println("second son");
    }
}
public class InstanceOf {
    public static void main(String[] args) {
        father c=new doughter();
        if(c instanceof doughter){
            c.display();
        }
        else if(c instanceof secondSon){
            c.display();
        }
        if(c instanceof son){
            c.display();
        }
    }
}
