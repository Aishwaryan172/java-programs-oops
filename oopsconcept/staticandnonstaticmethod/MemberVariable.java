package oopsconcept.staticandnonstaticmethod;

public class MemberVariable {
    private String name;
    private int age;
    public MemberVariable(String name, int age) {
        // Using 'this' keyword 
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public static void main(String[] args) {  
        MemberVariable membervariable = new MemberVariable("aishwarya", 21);
        membervariable.display();
    }
}