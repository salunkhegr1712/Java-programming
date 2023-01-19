// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class printLetterInString {

    // lets declare a function which print each character inside string 
    static void display(String a){

        // we are going to use length function to calculate the length of the string in java
        for(int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));
        }
        System.out.println("");
    }

    // main function of our java code
    public static void main(String args[]){

        System.out.println("length of hell is : "+"hell".length());
        display("hell");
    }
}