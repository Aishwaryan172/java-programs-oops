package javabasics.operators;

public class logical {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        System.out.println("sum= "+(a&&b));
        System.out.println("sum= "+(a||b));
        System.out.println("sum= "+(!a));
        System.err.println("sum= "+(!b));
    }
}
