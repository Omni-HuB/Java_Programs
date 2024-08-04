import java.util.*;


public class String_Problem_2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int start = sc.nextInt();
    int end = sc.nextInt();

    String substr = str.substring(start,end);
        System.out.println(substr);
    }
}