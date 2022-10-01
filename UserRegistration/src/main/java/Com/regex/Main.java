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
        System.out.println("Enter Your Password");
        String password  = scannerObject.nextLine();
        UserRegistration.checkValidPassword(password );



    }
}
