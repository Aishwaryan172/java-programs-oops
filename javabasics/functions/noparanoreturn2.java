package javabasics.functions;
import java.util.Scanner;

public class noparanoreturn2 {
   public static void main(String[] args) {
    add();
   }
   public static void add(){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("enter the 2 numbers");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int result=num1+num2;
       System.out.println("addition of 2 numbers is "+result);
   }
   }
}
