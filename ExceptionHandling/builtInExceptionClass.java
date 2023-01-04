// java has a predefined class which is very largly connected with the exception
// Exception class

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// inside this code i will briefy explain the three important function inside the Exception class
// a) String getMessage(); String is returntype of the function

    // this function will return the String which contains the exception error message from that object 

// b) String toString();
    // this function is by default function inside the System.out.println("");
    // and which is able to return String for any object provided 

// c) void printStackTree()
    // this is function which found sometime usefull as it can be used in order to find out in which order the function
    // where called and with this info we can be able to solve some problems  

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