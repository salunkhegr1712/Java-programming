// in this code i will going to explain UserDefinedExceptions and how can we use throw and throws in order
// whenever we need them

// importing basic functionalities from the java library
import java.lang.*;
// import java.lang.Exception;
import java.util.*;

// declaring exception class
// a UserDefinedExceptions is child of class Exception 

// you should write java.lang.Exception 
class NegativeDistanceException extends java.lang.Exception{

    // here inside UserDefinedException write function 
    public String getMessage(){
        return "you entered a negative length \n\t~ getMessage() from NegativeDistanceException";
    }
    public String toString(){
        return "Bad input!! \n\t~ getMessage() from NegativeDistanceException";
    }
    // object of UserDefinedException class is a exception
    // class is only blueprint of exception
}
// the main class
public class exceptionThrowing{

    // a exception throwing function
    static double area(double l, double b) throws NegativeDistanceException{
        if(l<=0 || b<=0)
            throw new NegativeDistanceException();

        return l*b;
        
    }
    // main function of our java code
    public static void main(String args[]){

        // goal of our code is same and it is to throw exception of type NegativeDistanceException when user provides a 
        // negative length
        try{
            area(10,-10);
        }  
        catch(NegativeDistanceException m){
            System.out.println(m.getMessage());
            System.out.println(m);

            // output :
            // you entered a negative length 
            //          ~ getMessage() from NegativeDistanceException
            // Bad input!! 
            //          ~ getMessage() from NegativeDistanceException
        } 
        

        // function calls : main()--> area()
        // area will be exception throwing function and main will be its caller so we handle exception inside the main
        // function itself

    }   
}
// incompatible types: NegativeDistanceException cannot be converted to java.lang.Throwable