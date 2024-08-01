package javabasics.functions;

public class sequenceFun2c {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 10; 
        int result = sum(number); 
        System.out.println("The sum of integers from 1 to " + number + " is: " + result);
    }
}
