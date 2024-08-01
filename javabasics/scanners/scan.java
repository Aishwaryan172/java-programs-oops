package javabasics.scanners;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a integer");
            int n=sc.nextInt();
            System.out.println("enter a float number");
            float f=sc.nextFloat();
            System.out.println("enter a byte value");
            byte b=sc.nextByte();
            System.out.println("enter a short value");
            short s=sc.nextShort();
            System.out.println("enter a string");
            String st=sc.next();
            System.out.println("Int:"+n);
            System.out.println("Float:"+f);
            System.out.println("Byte:"+b);
            System.out.println("Short:"+s);
            System.out.println("String:"+st);
        }
    }
}
