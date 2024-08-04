import java.util.*;


public class String_Tokens_Problem_SolvedUsing_Split_Regex_Trim {


  ////////////////////  SOLUTION 1:

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s = s.trim();
        String[] str = s.split("[ !,?._'@-]+");     ///    Using Regex
        if(s.length()==0){
            System.out.println(0);
        }else{
            System.out.println(str.length);
            for (String value : str) {
                System.out.println(value);

            }
        }
    }
}


/////////////////////////////   SOLUTION 2:

/***********************
*public static void main(String[] args) {
 *         Scanner scan = new Scanner(System.in);
 *         if(!scan.hasNext()){
 *             System.out.println("0");
 *             return;
 *         }
 *         String s = scan.nextLine();
 *         scan.close();
 *
 *         // Write your code here.
 *         String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
 *         int size = tokens.length;
 *         System.out.println(size);
 *         for(int i=0; i<size; i++){
 *             System.out.println(tokens[i]);
* */


////////////////////////////////////    SOLUTION 3 :

//                public class Solution {
//
//                    public static void main(String[] args) {
//                        Scanner scan = new Scanner(System.in);
//                        String s = scan.nextLine();
//                        scan.close();
//                        String splits[] = s.split("[!,?._'@ ]");
//                        splits = Arrays.asList(splits).stream().filter(str -> !str.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
//                        System.out.println(splits.length);
//                        for(String z : splits)
//                            System.out.println(z);
//                    }

