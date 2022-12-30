// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// so lets declare a class such that it has a local inner class inside some function
class Outer{

    // here we have some function
    private int z=10;
    public int m=22;

    // a simple function which print hello world
    private void method(){
        System.out.println("hello world");
    }

    // declare a function having some local inner class
    // also lets see can we will able to access data members and function from outer class or not 
    public void function(){
        
        // lets declare a inner class
        class Inner{
            public int n=11;
            private int k=111;
            public void innerFunction(){

                // you can able to access private and public data members and member function inside inner class
                System.out.println("value of m is : "+m);
                method();
            }

        }

        // now create object for inner class in function and see can we access function or not 
        Inner zz=new Inner();
        zz.innerFunction();
    }
    public void function2(){
        
        // lets declare a inner class
        class Hell{
            public int n=11;
            private int k=111;
            public void innerFunction(){

                // you can able to access private and public data members and member function inside inner class
                System.out.println("value of m is : "+m);
                method();
            }

        }

        // now create object for inner class in function and see can we access function or not 
        Hell zz=new Hell();
        zz.innerFunction();
    }
}

// the main class
public class localInnerClass {

    // main function of our java code
    public static void main(String args[]){

        // now lets create object for local class and see how local inner class is working
        Outer nn= new Outer();
        nn.function();
        nn.function2();
    }
} 