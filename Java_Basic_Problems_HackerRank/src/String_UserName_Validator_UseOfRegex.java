
import java.util.*;

    public class String_UserName_Validator_UseOfRegex {
        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            int n = Integer.parseInt(scan.nextLine());
            while (n-- != 0) {
                String userName = scan.nextLine();

                if (userName.matches(UsernameValidator.regularExpression)) {
                    System.out.println("Valid");
                } else {
                    System.out.println("Invalid");
                }
            }
        }
    }

    class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";  ///[for first letter of username][for only alphanumeric characters]
                                                                                        // [for userName to be greater than 8 characters and sma,ler than 30 characters]
}

