// java has a predefined class which is very largly connected with the exception
// Exception class

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class builtInExceptionClass {

    // main function of our java code
    public static void main(String args[]){

        // so now we are going to see much more information about the built in java class called exception

        Exception m=new Exception();
        System.out.println(m.getMessage());
        // it will return null as the exception object does not consist any type of exception
        // null

        // System.out.println(m.toString());
        //java.lang.Exception

        m.printStackTrace();
        // java.lang.Exception
        // at builtInExceptionClass.main(builtInExceptionClass.java:29)

    }
}