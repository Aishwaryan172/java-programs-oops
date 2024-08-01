package javabasics.conditionalStatements;
import java.util.*;;

public class simpleif {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter any number: ");
            int num=sc.nextInt();
            if(num>=10) {
                System.out.println(num+" is greater than or equal to 10");
            }
        }
    }
}
