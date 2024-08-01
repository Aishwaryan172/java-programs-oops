package javabasics.loops;
import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number");
            int num=sc.nextInt();
            System.out.println("print the even numbers "+num+ ": \n");

            for(int i=0;i<num;i++){
                if(i%2!=0){
                    System.out.println(i);
                }
            }
        }
    }
}
