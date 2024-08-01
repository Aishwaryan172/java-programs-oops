package javabasics.conditionalStatements;

import java.util.Scanner;

public class nestedif2 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the  number");
            int num=sc.nextInt();

            if(num>0){
                if(num%2==0){
                    System.out.println(num + "is a positive and even number ");
                }
                else{
                    System.out.println(num + " is positive and odd numbers");
                }
   }
        }
}
}

