package javabasics.loops;

import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.println("enter the number of iterations to be carried out: ");
            int n=sc.nextInt();
            int i=0;
            do{
                if (i%2==0) {
                    System.out.println(i);
                }
                i++;
            }while(i<=n);
        }
    }
}
