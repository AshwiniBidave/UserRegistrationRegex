package Com.regex;

import java.util.regex.*;

public class UserRegistration {
	public static void checkValidMobileNumber(String mobileNumber) {

        boolean isMobileNumber;
        String mobileRegex = "^(91){1}[ ]+[0-9]{10}$";
        Pattern patternObject = Pattern.compile(mobileRegex);
        if (mobileNumber == null) {
            isMobileNumber = false;
        }
        Matcher matcherObject = patternObject.matcher(mobileNumber);
        isMobileNumber = matcherObject.matches();

        if (isMobileNumber)
            System.out.println(mobileNumber + " is a Valid  Mobile Number\n");
        else
            System.out.println(mobileNumber + " is an Invalid Mobile Number");
    }

}
