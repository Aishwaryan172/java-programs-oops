package javabasics.loops;
import java.util.Scanner;

public class nestedforloop {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)){
            System.out.println("enter the number of i and j: ");
            int k=sc.nextInt();
            int n=sc.nextInt();
            for(int i=0; i<=n; i++)
            for(int j=0; j<=k; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
