public class C_Format_Output_In_Java {

    public static void main(String[] args){

        System.out.println(300000000.0/89.0);
        System.out.printf("%10.3f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%10.5f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%10.2f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%10.8f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%20.3f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%30.3f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%,.8f",300000000.0/89.0);
        System.out.println();


        /* output for above code
                33707.86516853933
        3370786.517
        3370786.51685
        3370786.52
        3370786.51685393
                 3370786.517     // trailing with 0's since 20 width field is set for this command
                           3370786.517     // trailing with 0's since 30 width field is set for this command
        3,370,786.51685393          // formatted with commas and 8 width precision size

         */


        System.out.println(300000000.0/89.0);
        System.out.printf("%10.3f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%10.5f",300000000.0/89.0);
        System.out.println();
        System.out.printf("%,.8f",300000000.0/89.0);
        System.out.println();

        /* output for above code
        3370786.5168539328   // for System.out.println(300000000.0/89.0);
        3370786.517
        3370786.51685
        3,370,786.51685393
         */
    }
}
