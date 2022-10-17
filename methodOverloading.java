// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class methodOverloading {
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // we will first declare some function which has same name and will get triggered according to the input 
    static int max(int a,int b){
        // we are going to use the ternary operation in order to print the result 
        return a>b?a:b;
    }

    static float max(float a,float b){
        return a>b?a:b;
    }

    static char max(char a,char b){
        return a>b?a:b;
    }

    static double max(double a,double b){
        return a>b?a:b;
    }
    // main function of our java code
    public static void main(String args[]){

        // so we are done with the function or method writing part so lets see how it will work
        println("max between 10 and 20 : "+max(10,20));
        // float are always need to implement as the literal 
        println("max between 10.4f and 16.2f : "+max(10.4f,16.2f));
        println("max between 10.4 and 16.2 : "+max(10.4,16.2));
        println("max between 'a' and 'b' : "+max('a','b'));

        // output :
   
        // max between 10 and 20 : 20
        // max between 10.4f and 16.2f : 16.2
        // max between 10.4 and 16.2 : 16.2
        // max between 'a' and 'b' : b
    }
}