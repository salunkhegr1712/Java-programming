// in this code we are going to study about the interface and how they ca ne helpfull 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// declare a interface
interface One{
    // you can have data members inside the interface but cant be access
    public int a=10;
    // public One(){}  interface cant have any kind of the constructor
    public void method1();
    public void method2();
    public void method3();
    // interface abstract methods cannot have body
}

// now declare class on basis of the declared interface
// class two must be abstract or should implements all function inside parent interface
class Two implements One{

    // Two can have constructor as it is a class
    
    public Two(){
        System.out.println("object for class Two is created");
    }
    // Two is not abstract and does not override abstract method method3() in One
    public void method1(){
        System.out.println("method1 from class Two");
    }
    public void method2(){
        System.out.println("method2 from class Two");
    }
    public void method3(){
        System.out.println("method3 from class Two");
    }
    public void func(){
        System.out.println("value of a : "+(a+100));
    }
    // Two is not abstract and does not override abstract method method2() in One
}

// the main class
public class simpleInterfaces{

    // main function of our java code
    public static void main(String args[]){
        // so interface can acts like the reference and cant able to act create object from it

        // One a=new One(); //One is abstract; cannot be instantiated

        Two a=new Two();
        a.method1();
        a.method2();
        a.method3();
        a.func();

        // OUTPUT :
        // object for class Two is created
        // method1 from class Two
        // method2 from class Two
        // method3 from class Two
        // value of a : 110
         
        // now use interface as reference
        // with interface as reference we can just access function which are override in class and function is 
        // called from class (override method from class)

        // One g=new Two();
        // g.method1();
        // g.method2();
        // g.method3();
        // System.out.println();//static variable should be qualified by type name, One, instead of by an expression
        // g.func(); cannot find symbol symbol:   method func() location: variable g of type One

        // with interface we can use interface just like abstract class using dynamic method dispatch 
    }
}