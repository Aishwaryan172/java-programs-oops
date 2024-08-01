package javabasics.conditionalStatements;
import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the age of a person");
            int age=sc.nextInt();

            if(age>=18){
                System.out.println(age+" person is elegible for vote");
            }
            else{
                System.out.println("person is not elegible for vote");
            }
        }
    }
    
}
