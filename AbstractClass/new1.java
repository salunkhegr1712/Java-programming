// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// declaration of abstract class
abstract class Hell{
    abstract void function();
}

interface Joker{
    void function();
}
class Abra{

}
// the main class
public class new1 {

    // main function of our java code
    public static void main(String args[]){

        // you can override function inside the abstract class while declaration of objects just like that 
        
        // an abstract objects creation with overriding on intialisation 
        Hell z= new Hell(){

            // override the existing function 
            void function(){
                System.out.println("hello world");
            }

        };

        // creation of anonymous class object with interface 
        Joker zz= new Joker(){

            // override the existing function 
            public void function(){
                System.out.println("hello world");
            }

        };
        zz.function();

        Abra m=new Abra();
        // this type of z is anonymous 
        System.out.println((Object)m.getClass().getSimpleName());
        System.out.println((Object)zz.getClass().getSimpleName());
        // there is no name for class of z thats why such initilisation lead to anonymous class
        // you cant do this in case of interface as interface is not a class but abstract classes are class 

    }
}