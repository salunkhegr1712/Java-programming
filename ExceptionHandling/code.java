// inside this code i will use the code to see and learn the different types of error 
// which can be tackled while working with the programme

// in this code we are going to create a divide by zero exception and we have to solve it 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class code{

    // main function of our java code
    public static void main(String args[]){

        // int a,b,c=0;
        // a=100;b=0;
        // try{
            
        //     c=a/b;
            
        // }
        // catch(ArithmeticException e){
            
        //     System.out.println("you ran in exception error");
        //     System.out.println(e);
        // }   
        // System.out.println("the value of the division is : "+c);
        // System.out.println("end of code!\nBye!");     

        // output :
        // you ran in exception error
        // java.lang.ArithmeticException: / by zero
        // the value of the division is : 0
        // end of code!
        // Bye!

        int a,b,c=0;
        a=100;b=22; //change
        try{
            
            c=a/b;
            
        }
        catch(ArithmeticException e){
            
            System.out.println("you ran in exception error");
            System.out.println(e);
        }   
        System.out.println("the value of the division is : "+c);
        System.out.println("end of code!\nBye!");  
        
        // output: 
        // the value of the division is : 4
        // end of code!
        // Bye!
    }

    // see above two code and you can able to see and learn how try and catch can be helpfull inorder to 
    // deal with the exceptions
    
}