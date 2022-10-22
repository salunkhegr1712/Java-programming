// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class sum{
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // main function of our java code
    public static void main(String args[]){

        // so take the input as operation parameters using the command line 
        // here we will get the numerical data as the string so first we have to parse it 

        // get operation in string and numbers inside the integer variables
        int a=Integer.parseInt(args[1]);
        int b=Integer.parseInt(args[2]);
        println(args[0]);
        println("Addition is : "+ (a+b));
        println("Substraction is : "+ (a-b));
        println("multiplication is : "+ (a+b));
        println("division is : "+ (a/b));
    }
}

// TO parsing function like 
// parseInt 
// parseDouble
// parseFloat 
// such function are there and keep in mind that they found very usefull when you want to convert the string into 
// some perticular numberical datatype 
