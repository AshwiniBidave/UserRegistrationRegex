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
        String email = "abc@bridgelabz.co.in";
        UserRegistration.checkValidEmail(email);

        String email1 = "abc@gmail.com.com";
        UserRegistration.checkValidEmail(email1);

         String email2= "abc@yahoo.com";
         UserRegistration.checkValidEmail(email2);

         String email3 = "abc@1.com";
         UserRegistration.checkValidEmail(email3);

        String email4 = "abc-100@yahoo.com";
        UserRegistration.checkValidEmail(email4);

        String email5 = "abc.100@yahoo.com";
        UserRegistration.checkValidEmail(email5);

        String email6= "abc111@abc.com";
        UserRegistration.checkValidEmail(email6);

        String email7 = "abc-100@abc.net";
        UserRegistration.checkValidEmail(email7);

        String email8 = "abc.100@abc.com.au";
        UserRegistration.checkValidEmail(email8);

        String  email10 = "abc+100@gmail.com";
        UserRegistration.checkValidEmail(email10);

        System.out.println("---------------------------------------------------");

        System.out.println("---------- Invalid Emails ----------");

        String  email11 = ".abc@abc.com";
     UserRegistration.checkValidEmail(email11);

        String  email12 = "abc";
        UserRegistration.checkValidEmail(email12);

        String email13 = "abc@.com.my";
        UserRegistration.checkValidEmail(email13);

        String  email14 = "abc@abc@gmail.com";
        UserRegistration.checkValidEmail(email14);

        String  email15 = "abc()*@gmail.com";
        UserRegistration.checkValidEmail(email15);

        String email16 = "abc..2002@gmail.com";
        UserRegistration.checkValidEmail(email16);

        String email17= "abc.@gmail.com";
        UserRegistration.checkValidEmail(email17);

        String email18 = "abc123@.com";
        UserRegistration.checkValidEmail(email18);

        String email19 = "abc123@.com.com";
        UserRegistration.checkValidEmail(email19);

        String   email20 = "abc123@gmail.a";
        UserRegistration.checkValidEmail(email20);

        String email21= "abc@%*.com";
        UserRegistration.checkValidEmail(email21);

        String  email22= "abc@gmail.com.1a";
        UserRegistration.checkValidEmail(email22);

        String  email23 = "abc@gmail.com.aa.au";
        UserRegistration.checkValidEmail(email23);



    }
}
