public class String_Removing_SpacesFromString_Problem {

    public static void main(String[] args) {
        String str = "       geek    fro     ff   n n    sfklsflsf sf slfnlnsfls fl sf sfl slf slf s  nnnj    juioo   ";
        removeSpaces(str);
    }

    static void  removeSpaces(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                System.out.print(str.charAt(i));
            }
        }
    }
}


