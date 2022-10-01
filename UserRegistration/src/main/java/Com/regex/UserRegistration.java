package Com.regex;

import java.util.regex.*;

public class UserRegistration {
    public static void checkValidFirstName(String firstName) {

        boolean isFirstName;
        String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern patternObject = Pattern.compile(firstNameRegex);
        if (firstName == null) {
            isFirstName = false;
        }
        Matcher matcherObject = patternObject.matcher(firstName);
        isFirstName = matcherObject.matches();

        if (isFirstName)
            System.out.println(firstName + " is an Valid First Name\n");
        else
            System.out.println(firstName + " is an Invalid First Name");
    }
    public static void checkValidLastName(String lastName) {

        boolean isLastName;
        String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern patternObject = Pattern.compile(lastNameRegex);
        if (lastName == null) {
            isLastName = false;
        }
        Matcher matcherObject = patternObject.matcher(lastName);
        isLastName = matcherObject.matches();

        if (isLastName)
            System.out.println(lastName + " is an Valid Last Name\n");
        else
            System.out.println(lastName + " is an Invalid Last Name");
    }

}
