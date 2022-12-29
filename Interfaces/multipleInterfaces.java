// in this code we are going to create code for achiving multiple inheritance using java multiple interface as 
// parent for a class

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// declaring interface 
interface I1{
    void hell();
}

interface I2{
    void hell2();
}

interface I3{
    // double z; = expected
    void hell2();
}
// declare a class having multiple parent interface
class I4 implements I1,I2,I3{
    public void hell(){
        System.out.println("hell is calling");
    };
    public void hell2(){
        System.out.println("hell 2 is calling");
    }

    // I4 is not abstract and does not override abstract method hell() in I1
}


// the main class
public class multipleInterfaces {

    // main function of our java code
    public static void main(String args[]){
        I4 a=new I4();
        // a.hell();
        // a.hell2();

        // hell is calling
        // hell 2 is calling
        // for each reference you dont have create different object each time you can also do 
        I1 g=a;
        I2 h=a;
        I3 i=a;

        g.hell();
        // g.hell2(); //error 

        // two different interface reference accesing single method as it is method which present
        // in both interface
        h.hell2();
        i.hell2();
        // hell 2 is calling
        // hell 2 is calling
    }
}