package javabasics.loops;

import java.util.Scanner;

    public class WhileLoopExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // create a Scanner object for input
            System.out.print("Enter a number: ");
            int maxNumber = scanner.nextInt(); // read the user's input
            
            int i = 1; // initialization
    
            // while loop
            while (i <= maxNumber) {
                System.out.println(i); // print the current value of i
                i++; // increment i by 1
            }
            
            scanner.close(); // close the scanner
        }
    }
    