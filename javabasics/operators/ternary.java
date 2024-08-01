package javabasics.operators;

public class ternary {
    public static void main(String[] args) {
        int a=25;
        int b=35;
        int max =a>b ? a:b;
            System.out.println("sum= "+ max);
            System.out.println("sum= "+(a>b || a==b));
            System.out.println("sum= "+(!true));
            System.out.println("sum= "+(a<=b));
            System.out.println("sum= "+(!(a==b)));
            System.out.println("sum=" +(a!=b));
    }
}
