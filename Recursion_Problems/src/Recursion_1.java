//package Recursion_Problems.src;

public class Recursion_1 {

    public static int sum(int n) {
        if (n == 1) { // Base case for getting sum of n numbers
            return 1;
        }
        return n + sum(n - 1); // sum of n numbers can be written as """" sum of (n-1) numbers + n """"
    }

    public static void main(String[] args) {

        System.out.println(sum(15));
    }
}
