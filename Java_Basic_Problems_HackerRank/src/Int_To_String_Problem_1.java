import java.util.*;

public class Int_To_String_Problem_1 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if((n>= -100)&&(n<=100)){

            String intToString = Integer.toString(n);
          //  System.out.println(intToString);
            System.out.println("Good job");
        }


    }
}
