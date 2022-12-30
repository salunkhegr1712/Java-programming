// in this code i will briefly explain the  anonymous Classes
// it will create a file name : anonymousClasses$1.class for each anonymous class
// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// lets declare a concrete class, a abstract class, and an interface

class Banana{
    public int a=10;
    public void methodInBanana(){
        System.out.println("this methodInBanana from class Banana");
    }
}

abstract class Apple{

    abstract void methodInApple();
    public void function(){
        System.out.println("this function from class Apple");
    }
}

interface Pineapple{
    void methodInPineapple();
}

// the main class
public class anonymousClasses {

    // main function of our java code
    public static void main(String args[]){

        // so if we do method overriding or add a new function to object while initialisation 
        // it will give rise to new class so that class is anonymous class

        // you can implement interface extend abstract or concrete class and give birth to anonymous class

        Banana a= new Banana(){
            // you can add data members and member function inside anonymous class 
            public void addedFunction(){
                int bt=100;
                System.out.println("adding new function to Banana class while object initialisation");
            }
        };

        // lets check type of object a
        // System.out.println((Object)a.getClass().getSimpleName());
        //
        // blank output so it is a anonymous class

        // lets see can we use previous function and new added function or not
        // you cant access extra added function and data members as it has reference of banana and it 
        // can access function and values outside that class 
        // a.addedFunction();

        // so it is bad idea to use anonymous class to extends a concrete class 
        
        
        // now lets see for abstract class
        
        Apple z= new Apple(){
            
            // lets override function in class apple and create anonymous class
            public void methodInApple(){
                System.out.println("successfulley overrided the function in anonymous class");
            } 
        };
        // check type of class for z 
        // System.out.println((Object)z.getClass().getSimpleName());
        // 
        // blank so it is anonymous Class
        //  try to access function 
        // z.methodInApple();
        // z.function();
        // successfulley overrided the function in anonymous class
        // this function from class Apple

        // so it is good to use the abstract class for abstract class and interface
        Pineapple m= new Pineapple(){
            public void methodInPineapple(){
                System.out.println("overrided function from interface and created a anonymous Class");
            }
        };
        // lets see type of m  
        System.out.println((Object)m.getClass().getSimpleName()); //anonymous
        // try to access function which is overrided
        m.methodInPineapple();
        // overrided function from interface and created a anonymous Class
    }
}