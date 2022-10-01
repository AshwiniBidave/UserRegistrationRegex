package Com.regex;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "******Welcome To Regex***********" );
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String firstName = scannerObject.nextLine();
        UserRegistration.checkValidFirstName(firstName);
        System.out.println("Enter Your Last Name");
        String lastName = scannerObject.nextLine();
        UserRegistration.checkValidLastName(lastName);



    }
}
