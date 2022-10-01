package Com.regex;

import java.util.regex.*;

public class UserRegistration {
	public static void checkValidPassword(String password) {

        boolean isPassword;
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
        Pattern patternObject = Pattern.compile(passwordRegex);
        if (password == null) {
            isPassword = false;
        }
        Matcher matcherObject = patternObject.matcher(password);
        isPassword = matcherObject.matches();

        if (isPassword)
            System.out.println(password + " is a Valid  Password\n");
        else
            System.out.println(password + " is an Invalid Password");
    }

}
