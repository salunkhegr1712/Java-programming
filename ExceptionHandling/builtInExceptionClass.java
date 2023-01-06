// java has a predefined class which is very largly connected with the exception
// Exception class

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// import io which can take input from the
import java.io.*;
// also lets write some code for the exception handling in case of Checked Exception


// the main class
public class builtInExceptionClass {

    public static void meth4(){
    
        System.out.println(10/0);
    }
    public static void meth3(){
        meth4();
    }
    public static void meth2(){
        meth3();
    }

    public static void meth1(){
        meth2();
    }

    // main function of our java code
    public static void main(String args[]){

        // so now we are going to see much more information about the built in java class called exception

        Exception m=new Exception();
        System.out.println(m.getMessage());
        // it will return null as the exception object does not consist any type of exception
        // null

        // System.out.println(m.toString());
        //java.lang.Exception

        // m.printStackTrace();
        // java.lang.Exception
        // at builtInExceptionClass.main(builtInExceptionClass.java:29)

        // meth1();
        // this is a example of method stack tree 
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at builtInExceptionClass.meth4(builtInExceptionClass.java:13)
        // at builtInExceptionClass.meth3(builtInExceptionClass.java:16)
        // at builtInExceptionClass.meth2(builtInExceptionClass.java:19)
        // at builtInExceptionClass.meth1(builtInExceptionClass.java:23)
        // at builtInExceptionClass.main(builtInExceptionClass.java:43)


        // a example code where we have to handle the checked exception /
        
        // FileInputStream n= new FileInputStream("hell.txt");
        // unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

        // as unchecked exception do not make any noise in compilation process 
        // but checkes exception give error in compilation process itself 

        // now lets handle it 
        try{
        
            FileInputStream n= new FileInputStream("hell.txt");
        }
        catch(IOException z){
            
            System.out.println(z);
            //java.io.FileNotFoundException: hell.txt (No such file or directory)
            
        }
    }   
}