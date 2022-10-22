// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class validateByMO{
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // we will write our function below
    // so we are going to write the function which will validate the name and the age 
    static boolean validate(int age){
        return (age>0 && age <100)?true:false;
    }

    static boolean validate(String name){
        return name.matches("[a-zA-Z ]+");
    }

    // main function of our java code
    public static void main(String args[]){

        // few code to check that is the code running or not 
        System.out.println(validate(11)); // true
        System.out.println(validate(111)); // false
        System.out.println(validate(-11)); // false
        System.out.println(validate("Ghansham")); // true
        System.out.println(validate("Ghansham ")); // true
        System.out.println(validate("Ghansham1712")); //false

    }
}