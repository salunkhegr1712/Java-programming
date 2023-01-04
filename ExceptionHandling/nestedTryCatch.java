// in this code i will demonstrate the try catch block and how can we use them 
// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class nestedTryCatch {

    // main function of our java code
    public static void main(String args[]){

        try{
        
            int a[]={10,0,8,9,3,5};
            int r;

            // we deal with following line with inner try catch
            try{
                r=a[0]/a[1];
            }
            catch(ArithmeticException z){
                System.out.println("error! denominator is zero");
                r=0;            
            }        
            System.out.println("division is : "+r);

            // we deal following line with outer try catch
            System.out.println("element at position 10 is : "+a[10]); // this code will lead to ArrayIndexOutOfBoundsException
            
        }
        // this catch will try to handle ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("hello user you entered wrong Index for array");
            // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
            
        }
        
        // output :
        // error! denominator is zero
        // division is : 0
        // hello user you entered wrong Index for array
    }
}