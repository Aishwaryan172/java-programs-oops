package javabasics.functions;

import java.util.Scanner;

public class ArgReturn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two numbers: ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Addition result is: "+add(a,b));
        }
    }
    public static int add(int num1, int num2) {
        return num1+num2;
    }
}