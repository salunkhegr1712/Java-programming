// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// lets declare a concrete class
class Concrete{
    int a;
    
    // a constructor 
    public Concrete(){
        System.out.println("object of concrete class created");
    }

    // also declare a function
    public void func(){
        
        System.out.println("func is called");
    }
    // you can create object for such concrete class
}

// create a abstract class
abstract class Hell{
    int z;
    abstract void zfunction();
    void hh(){
        System.out.println("nano");
    }

    // a abstract function never have function body 
}

// the main class
public class abstractVsConcrete {

    // main function of our java code
    public static void main(String args[]){

        // lets see concrete class first 
        // you can create object for concrete class
        Concrete a= new Concrete();
        a.func();
        // try to create object for abstract Class
        // Hell a=new Hell();
        // error:
        // Hell is abstract; cannot be instantiated

        // a reference 
        Hell z;
        // z.hh();
        // error : variable z might not have been initialized
        // for reference you cant able to acces the function inside the class if you want to access function inside a class
        // you have to initialise object for it which you cant do incase of abstract class
    }
}