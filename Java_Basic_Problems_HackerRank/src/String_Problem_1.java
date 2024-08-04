import java.util.*;
public class String_Problem_1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //  SOLUTION 1 :


        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.length()+b.length());

        char a1 = a.charAt(0);
        int a2 = (int) a1;

        char b1 = b.charAt(0);
        int b2 = (int) b1;

       // System.out.println(a2  + " " + b2 );

        if(a2>b2){System.out.println("yes");}
        else{System.out.println("No");}

        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase() +b.substring(1) );



            // SOLUTION 2 :

//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//
//        System.out.println(A.length()+B.length());
//        if(A.compareTo(B) < 0)
//        {
//            System.out.println("No");
//            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
//            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
//            System.out.println(A + " " + B);
//        }
//        else if (A.compareTo(B)==0)
//        {
//            System.out.println("No");
//            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
//            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
//            System.out.println(A + " " + B);
//        }
//        else
//        {
//            System.out.println("Yes");
//            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
//            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
//            System.out.println(A + " " + B);
//        }

        //SOLUTION 3:

//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//
//        String capitalA = convertFirstLetter2Capital(A);
//        String capitalB = convertFirstLetter2Capital(B);
//
//        System.out.println(""+ (capitalA.length() + capitalB.length()));
//
//        if(isLexicographical(capitalA, capitalB))
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//
//        System.out.println(capitalA + " " + capitalB);
//
//    }
//    public static String convertFirstLetter2Capital(String value) {
//        char[] charArray = value.toCharArray();
//        charArray[0] = (char)(charArray[0] + ('A' - 'a' ));
//
//        return charArray2String(charArray);
//    }
//
//    public static String charArray2String(char[] charArray) {
//
//        return String.valueOf(charArray);
//    }
//    public static boolean isLexicographical(String A, String B) {
//        int minLength = A.length();
//        if (A.length() > B.length()) {
//            minLength  = B.length();
//        }
//        boolean result = false;
//        char[] aCharArray = A.toCharArray();
//        char[] bCharArray = B.toCharArray();
//        int i = 0;
//        for (i = 0; i < minLength; i++) {
//            if (aCharArray[i] > bCharArray[i]) {
//                result = true;
//                break;
//            }else if(aCharArray[i] < bCharArray[i]) {
//                result = false;
//                break;
//            }
//        }
//        if (i == minLength) {
//            if (A.length() > B.length()) {
//                result = true;
//            }
//            else {
//                result = false;
//            }
//        }
//
//        return result;
    }
}
