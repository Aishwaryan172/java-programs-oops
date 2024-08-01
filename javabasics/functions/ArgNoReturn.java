package javabasics.functions;
import java.util.Scanner;

public class ArgNoReturn {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("enter two numbers: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                add(a,b);
            }
    }
    public static void add(int x, int y) {
        int res=x+y;
        System.out.println("Addition result is: "+res);
    }
}