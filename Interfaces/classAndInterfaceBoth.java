// a single class can extends a class and implements a interface

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// we can declare any one abstract or concrete but why to use abstract as we can use interface
class One {
    public double z=100;
    public void hell(){
        System.out.println("hell function from class One");
    }
    public One(){
        System.out.println("object of class One is created");
    }
}

interface Zero{
    void func1();
    void func2();
}

// now create a class having both a class and interface as parent 
// Five is not abstract and does not override abstract method func2() in Zero
class Five extends One implements Zero {
    public void func2(){
        System.out.println("func1 function from class Five");
    };
    public void func1(){
        System.out.println("func2 function from class Five");
    };
    // so now object of Five can access function from both class and interface
    
}
// the main class
public class classAndInterfaceBoth {

    // main function of our java code
    public static void main(String args[]){
        // Five a=new Five();
        // function from class One
        // a.hell();
        // // overrided functions from interface Zero
        // a.func1();
        // a.func2();   
        // System.out.println("value of z is : "+ a.z);

        // O/p:
        // object of class One is created
        // hell function from class One
        // func2 function from class Five
        // func1 function from class Five

        // so we can acces class with interface reference and parent class reference
        // One g=new Five();
        // Zero h=new Five();

        // g can only acces function and data members inherited from class One 
        // System.out.println("value of z is : "+g.z);
        // g.hell();
        // O/p:
        // object of class One is created
        // value of z is : 100.0
        // hell function from class One

        Zero h=new Five();
        h.func1();
        h.func2();
        // output :
        // object of class One is created
        // func2 function from class Five
        // func1 function from class Five
    }   
}