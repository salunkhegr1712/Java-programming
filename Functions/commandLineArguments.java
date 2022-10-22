// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class commandLineArguments{
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // so we will see how the command line argumnets will work in java programming language

    // main function of our java code

    // the string args is iteself  is one of the command line argumnets tool inside the java programming language
    public static void main(String args[]){

        // so the command line arguments are the one which are we pass them to a programm while execution of object file
        for(int i=0;i<args.length;i++){
            println(args[i]);
        }

    }
}
// ghansham@an5  ~/Java-Programming/Functions   master ±  java commandLineArguments hello im ghansham how are you 
// hello
// im
// ghansham
// how
// are
// you

// so see the above example and learn how the code take the input and we can use such input and able to acces them inside the function

// so how can you take the int in the input lets see 
// so we can take the number as input as the command line argument and then we can parse the string 

// int i=Integer.parseInt(s);  
// the Integer object has function called parseint which conver the numberical string into the integer 