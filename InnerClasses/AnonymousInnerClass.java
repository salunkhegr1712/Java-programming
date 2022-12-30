// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;
// in this code i will create a Anonymous Inner Class
// create a abstract class and 

interface Hell{
    public void method1();
}

abstract class Joker{
    abstract void function();
}

// so now we are going to write the code for anonymous inner class

class Outer{

    private int a=10;
    public int m=1100;

    // declaring anonymous class as nested anonymous class over abstract class
    // this is one way 
    Joker z= new Joker(){
        public void function(){
            System.out.println("anonymous inner class over abstract class");
        }
    };

    // nested anonymous class over a interface 
    Hell np= new Hell(){
        public void method1(){
            System.out.println("anonymous inner class over interface");
        }
    };

    // now lets write a function to test nested anonymous inner class
    public void test(){
        np.method1();
        z.function();
    }

    // also you will able to create a local anonymous class over abstract class or interface
    // inside a function

    public void ghansham(){
        
        Joker zz= new Joker(){
            public void function(){
                System.out.println("from function : anonymous inner class over abstract class");
            }
        };
    
        // nested anonymous class over a interface 
        Hell nnp= new Hell(){
            public void method1(){
                System.out.println("for function : anonymous inner class over interface");
            }
        };

        // now lets call the object and test function 
        zz.function();
        nnp.method1();
        }
    
}
// the main class
public class AnonymousInnerClass{

    // main function of our java code
    public static void main(String args[]){
        
        // now lets run the code 
        // lets create a object first 
        Outer a=new Outer();
        a.test();
        a.ghansham();
    
    }
}