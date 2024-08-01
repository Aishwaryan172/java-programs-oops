package javabasics.conditionalStatements;
import java.util.Scanner;

public class ifelseif2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the three  numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=sc.nextInt();

                if(num1>num2 && num1>num3){
                    System.out.println(num1+" is a gretter number");
                }
                else if(num2>num3){
                    System.out.println(num2+" is a gretter number");
                }
                else{
                    System.out.println(num3+" is a gretter number");
                }
        }
    }
}
