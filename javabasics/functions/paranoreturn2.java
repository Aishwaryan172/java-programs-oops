package javabasics.functions;
import java.util.Scanner;

public class paranoreturn2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the 2 numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            add(num1,num2);
        }
    }
    public static void add(int num1,int num2){
        int result=num1+num2;
        System.out.println("addition of 2 numbers is "+result);
    }
}
