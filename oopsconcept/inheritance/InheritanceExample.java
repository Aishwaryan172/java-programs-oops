package oopsconcept.inheritance;

class son{
    void display(){
        System.out.println("old bike");
    }
}
class father extends son{
  void display(){
    
  }
}
public class InheritanceExample {
    public static void main(String[] args) {
        father fa=new father();
        fa.display();
    }
}
