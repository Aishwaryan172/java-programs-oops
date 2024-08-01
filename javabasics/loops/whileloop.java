package javabasics.loops;
import java.util.Scanner;

public class whileloop {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("enter the num");
                int num=sc.nextInt();
                int i=0;
                while(i <= num){
                    if(i%2==0){
                        System.out.println(i);
                    }
                    i++;
                }
            }
        }   
    }