package oopsconcept.interfaceprograms;
interface Emp{
    void make();
    }
class Sub implements Emp{
    public void make(){
        System.out.println("hello");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Emp e=new Sub();
        e.make();
    }
}
