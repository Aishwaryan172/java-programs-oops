package javabasics.loops;

import java.util.Scanner;

public class NestedLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object for input

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt(); // read the number of rows from the user

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt(); // read the number of columns from the user

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // inner loop for columns
            for (int j = 1; j <= columns; j++) {
                System.out.print("* "); // print an asterisk followed by a space
            }
            System.out.println(); // move to the next line after printing all columns
        }

        scanner.close(); // close the scanner
    }
}