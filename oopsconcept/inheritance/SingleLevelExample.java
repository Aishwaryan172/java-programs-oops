package oopsconcept.inheritance;
public class SingleLevelExample {
    int age = 45;
    void display(){
    System.out.println("old bike");
    }
}
    
class Son extends SingleLevelExample{
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println("age : "+ s.age );
        s.display();
    }
}
