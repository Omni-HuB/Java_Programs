import java.sql.SQLOutput;
import java.util.*;
public class Data_Types_Problem_1 {

    public static void main(String[] args) {

            //  SOLUTION 1: using brute force and  explicitly typecasting the integer and comparing there bits


        Scanner sc = new Scanner(System.in);

        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:kljjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");

                try{
                    byte y = (byte) x;
                    if(y == x)
                    {
                        System.out.println("* byte");
                    }
                }catch(Exception ignored){}
                try{
                    short y = (short) x;
                    if(y == x)
                    {
                        System.out.println("* short");
                    }
                }catch(Exception ignored){}

                try{
                    int y = (int) x;
                    if(y == x)
                    {
                        System.out.println("* int");
                    }
                }catch(Exception ignored){}

                System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }



        //SOLUTION 2 : Using formula (-2^(n-1)  to 2^(n-1) - 1)  to calculate the min and max value that can be stored in the given data type

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//            try {
//                long x = sc.nextLong();
//                System.out.println(x + " can be fitted in: ");
//                if (x >= -128 && x <= 127) {
//                    System.out.println("* byte");
//                }
//                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
//                    System.out.println("* short");
//                }
//                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
//                    System.out.println("* int");
//                }
//                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
//                    System.out.println("* long");
//                }
//            } catch (Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
//            }
//
//        }



            //    SOLUTION 3 :  when we don't remember the max and min values of byte , short, int , long
            //    can store (-2^(n-1)  to 2^(n-1) - 1)  where n is no. of bits in the given data type


//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//
//        for(int i=0;i<t;i++)
//        {
//            try
//            {
//                long x=sc.nextLong();
//                System.out.println(x+" can be fitted in: ");
//                if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) {System.out.println("* byte");}
//                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){System.out.println("* short");}
//                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){System.out.println("* int");}
//                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){System.out.println("* long");}
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//
//        }





    }
}