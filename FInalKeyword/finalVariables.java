// in this code i am going to explain about the java final variables 
// final variables are just constants 

// in java you can assign values to final variable only once and that will on declaration 
// or its first value assignment after that if you try to change the value then you will end up in some error 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// now lets see final function and final class

class Superclass {
    final void meth(){
        System.out.println("hello world");
    }
}

class Subclass extends Superclass{

    // final methods are not able to use for method overridding 

    //  void meth(){

    //  }

    //  error : meth() in Subclass cannot override meth() in Superclass overridden method is final
}

// now lets try final class 
// final class cant able to use as parent in inheritance 

final class Mother {

}

// error : cannot inherit from final Mother
// final class Child extends Mother{

// }

// the main class
public class finalVariables {

    // assign value at time of declaration 
    static final int m=100;
    static final double pi;
    
    final long cat;
    static {
        pi=11.45;
    }

    public finalVariables(){
        cat=100;
    };

    final int ill;
    final double i;
    final float kk;

    // this is block called instance block we can assign some value to variable other than static on loading of class
    // with this instance class
    {
        ill=00;
        i=12.32;
        kk=4.342f;
    }

    // main function of our java code
    public static void main(String args[]){
        // m=1100;// cannot assign a value to final variable m

        // another way to assign value is declare and then assign value first and last time whenever you wanted to 
        final int z;
        z=11;
    }
}