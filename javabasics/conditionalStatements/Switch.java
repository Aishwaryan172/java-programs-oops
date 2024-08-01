package javabasics.conditionalStatements;
import java.util.*;

public class Switch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two choice:\n 1. Addition(+)\n 2. Subtraction(-)\n 3. Multiplication(*)\n 4. Division(/)\n 5. Modulus(%)\n ");
            int ch=sc.nextInt();
            System.out.println("enter two numbers: \n");
            int a=sc.nextInt();
            int b=sc.nextInt();
            switch(ch) {
                case 1: System.out.println("Addition: "+(a+b));
                break;
                case 2: System.out.println("Subtraction: "+(a-b));
                break;
                case 3: System.out.println("Addition: "+(a*b));
                break;
                case 4: System.out.println("Addition: "+(a/b));
                break;
                case 5: System.out.println("Addition: "+(a%b));
                break;
            }
        }
    }
}
