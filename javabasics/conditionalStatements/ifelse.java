package javabasics.conditionalStatements;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the age of the person to see the eligibility for voting: ");
            int age= sc.nextInt();
            if(age>=18) {
                System.out.println("the person is eligible to vote");
            }else {
                System.out.println("the person is not eligible to vote");
            }
        }
    }
}
