package oopsconcept.staticAndnonStaticBlock;

public class NonstaticBlock {
    {
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        NonstaticBlock s=new NonstaticBlock();
        System.out.println("hii");
    }
    {
        System.out.println("hii world");
    }
    {
        System.out.println("welcome");
    }
}
