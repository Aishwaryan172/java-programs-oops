package oopsconcept.abstraction;
abstract class Emp{
    abstract void work();
}
class person extends Emp{
    void work(){
        System.out.println("working");
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
        Emp e=new person();
        e.work();
    }
}
