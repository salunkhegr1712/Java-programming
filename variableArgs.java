// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class variableArgs{
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // code
    static void displayParameters(int...x){
        // this x will acts like the arrays 
        for(int b:x){
            println(""+b);
        }
    }

    // main function of our java code
    public static void main(String args[]){
        
        // lets try to use variable arguments
        // so we are going print the different parameters and then you dont have to write all overloded functions 
        displayParameters(10,20);println("");
        displayParameters(10,20,30);println("");
        displayParameters(10,20,30,40);println("");
        // output : 
        // 10
        // 20

        // 10
        // 20
        // 30
        
        // 10
        // 20
        // 30
        // 40
    
    }
}