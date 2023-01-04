// inside this code i will explain about the heiarchy inside the java exceptions 
// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class heiarchyOfExceptions{

    // main function of our java code
    public static void main(String args[]){

        // the Exception is enough to handle all types of exceptions inside the code 
        // nested try catch blocks
        // try{
        //     int a=10,b=0,c;
        //     try{
        //         c=a/b;
        //     }
        //     catch(Exception z){
        //         System.out.println(z);
        //     }
        //     int aa[]= new int[5];
        //     System.out.println("element at position 10 : "+aa[10]);
        // }
        // catch(Exception z){
        //     System.out.println(z);
            
        // }
        // output :
        // java.lang.ArithmeticException: / by zero
        // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5


        // try{
        //     int a=10,b=0,c;
        //     try{
        //         c=a/b;
        //     }
        //     catch(ArithmeticException z){
        //         System.out.println(z);
        //     }
        //     int aa[]= new int[5];
        //     System.out.println("element at position 10 : "+aa[10]);
        // }
        // catch(ArrayIndexOutOfBoundsException m){
        //     System.out.println(m);
        // }
        // catch(ArithmeticException m){
        //     System.out.println("");
        // }
        // catch(Exception z){
        //     System.out.println(z);
            
        // }
        // output :
        // java.lang.ArithmeticException: / by zero
        // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
        
        try{
            int aa[]= new int[5];
            System.out.println("element at position 10 : "+aa[10]);
        }
        
        catch(Exception z){
            System.out.println(z);
            
        }
        catch(ArrayIndexOutOfBoundsException m){
            System.out.println(m);
        }
        catch(ArithmeticException m){
            System.out.println("");
        }
        // heiarchyOfExceptions.java:77: error: exception ArithmeticException has already been caught
        // catch(ArithmeticException m){
        // 1 error
        
    }
}