package oopsconcept.nonprimitiveclasscasting;
class father{
    void display(){
        System.out.println("old man");
    }
}
class son extends father{
    void display1(){
        System.out.println("new son");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        father f=new son();// upacasting father to son
        son myson=(son) f;    //downcasting means explicity
        myson.display1(); //output new son
}
}
