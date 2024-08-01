package javabasics.functions;

public class chainFunction {
    static int val;
    public static void add(int num) {
        val=val+num;
        sub(5);
    }
    public static void sub(int num) {
        val=val-num;
        System.out.println(val);
    }
    public static void main(String[] args) {
        add(10);
    }
}
