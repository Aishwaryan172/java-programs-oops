package javabasics.functions;
import java.util.Scanner;

public class NoArgReturn {
    public static void main(String[] args) {
        System.out.println("Addition result is: "+add());
    }
    public static double add() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two numbers: ");
            @SuppressWarnings("unused")
            int a=sc.nextInt();
            @SuppressWarnings("unused")
            int b=sc.nextInt();
        }
        return 10+15.5;
    }
}
