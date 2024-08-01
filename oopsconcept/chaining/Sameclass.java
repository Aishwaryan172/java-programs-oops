package oopsconcept.chaining;
public class Sameclass{
    int a;
    public Sameclass(int a){
        System.out.println("enter a details"); 
        this.a=a;
    }
    public static void main(String[] args) {
        Sameclass s =new Sameclass(30);
        System.out.println(s.a);
    }
}
    

