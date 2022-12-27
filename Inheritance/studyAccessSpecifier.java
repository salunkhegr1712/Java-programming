// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// first we have to find out what happens if we not provide any access specifier

// in java private is default access specifier

class One{
    
    int a; // variable without access specifier
    public int b; // variable with public access specifier
    private int c;//variable with private access specifier
    
    // a function without any access specifier
    void hell(){
        System.out.println("hello world");
    }

    // a function having access specifier as : public
    public void hell1(){
        System.out.println("hello world");
    }

    // a function having access specifier as : private
    void hell2(){
        System.out.println("hello world");
    }
    // now lets check what is we can access and what we cant 
}
// the main class
public class studyAccessSpecifier {

    // main function of our java code
    public static void main(String args[]){
        One a=new One();
        a.a=10;
    }   
}

// we will study more on this in further time 