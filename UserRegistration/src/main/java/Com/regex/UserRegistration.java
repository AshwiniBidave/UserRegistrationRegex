package Com.regex;

import java.util.regex.*;

public class UserRegistration {
    public static void checkValidEmail(String email) {

        boolean isEmail;
        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        Pattern patternObject = Pattern.compile(emailRegex);
        if (email == null) {
            isEmail = false;
        }
        Matcher matcherObject = patternObject.matcher(email);
        isEmail = matcherObject.matches();

        if (isEmail)
            System.out.println(email + " is a Valid Email address\n");
        else
            System.out.println(email + " is an Invalid Email address\n");
    }

}
