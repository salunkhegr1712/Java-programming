// it is a process where a function will be created in child class such that it is already created inside the 
// its parent so now for each class function which is present in that class will be called
// so such method is called as the overided method 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// declaring parent class
class Parent{
    int a;
    // @overided
    public void hell(){
        System.out.println("burn...");
    }
}

// declaring child class
class Child extends Parent{

    // the function hell is now overided function
    public void hell(){
        System.out.println("suffer...");
    }
}
// the main class
public class methodOveriding {

    // main function of our java code
    public static void main(String args[]){

        // now see for the for which object which function will get called 
        Parent a=new Parent();
        // a.hell();

        Child b= new Child();
        // b.hell();

        // output: 
        // burn...
        // suffer...
        // dynamic method dispatch 
        // a parent class refernce can also abel to points to the it child 
        Parent m= new Child();
        m.hell();
        // so if we use refernce for 
        // most of the time this will lead to error 
    }
}