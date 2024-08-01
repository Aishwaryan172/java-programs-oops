package javabasics.conditionalStatements;
import java.util.Scanner;;

public class elseif {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter any number: ");
            int num=sc.nextInt();
            if(num>0) {
                System.out.println(num+" is positive");
            }else if(num<0) {
                System.out.println(num+" is negative");
            }else {
                System.out.println("number is zero");
            }
        }
    }
}
