// EH= exception handling 
// in this code we are going to explain about the multiple exceptions with the use of multiple catch statements

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class multipleCatchEH {

    // main function of our java code
    public static void main(String args[]){

        // read here 

        // int a[]={10,0,8,9,3,5};
        // int r;
        
        // r=a[0]/a[1]; // this code will give a arithematic exception
        // error: Exception in thread "main" java.lang.ArithmeticException: / by zero

        // System.out.println("division is : "+r);

        // System.out.println("element at position 10 is : "+a[10]);// this will give ArrayIndexOutOfBoundsException
        // error:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

        // so lets see how this code is running 

        // so lets solve this problem with the try catch block 

        try{
        
            int a[]={10,0,8,9,3,5};
            int r;
            r=a[0]/a[2];
            
            System.out.println("division is : "+r);
            System.out.println("element at position 10 is : "+a[10]);
            
        }
        // first catch will try to handle ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("hello user you entered wrong Index for array");
            // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
            
        }
        // now another catch block is for ArithmeticException
        catch(ArithmeticException a){
            System.out.println("hello user you entered a wrong value at denominator");     
            // java.lang.ArithmeticException: / by zero
        }

        
    }
}