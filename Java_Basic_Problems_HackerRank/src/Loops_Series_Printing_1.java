import java.io.*;
import java.util.*;

public class Loops_Series_Printing_1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        int a = 0;
        int b = 0;
        int n = 0;

        if ((q >= 0) && (q <= 500)) {

            for (int i = 1; i <= q; i++) {

                a = sc.nextInt();
                b = sc.nextInt();
                n = sc.nextInt();


                if ((a >= 0) && (a <= 50) && (b >= 0) && (b <= 50) && (n >= 1) && (n <= 15)) {

                    int sum = a;

                    for (int j = 0; j <= n - 1; j++) {

                        sum += (Math.pow(2, j) * b);
                        System.out.print(sum + " ");


                    }

                    System.out.println("");
                }


            }
        }
    }
}







