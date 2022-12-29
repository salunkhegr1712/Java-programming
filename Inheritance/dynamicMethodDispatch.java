// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;
// in this code we will learn about dynamic memory dispatch 

class Parent{
    public void meth1(){
        System.out.println("parent meth1");
    };
    public void meth2(){
        System.out.println("parent meth2");
    };
    public void meth3(){
        System.out.println("parent meth3");
    };
}

class Child extends Parent{
    public void meth2(){
        System.out.println("Child meth2");
    };
    public void meth3(){
        System.out.println("Child meth3");
    };
    public void meth4(){
        System.out.println("Child meth1");
    };
}


// the main class
public class dynamicMethodDispatch{

    // main function of our java code
    public static void main(String args[]){

        // so lets use dynamic method dispatch

        // here a is reference of parent class and object is created of type Child
        Parent a= new Child();

        a.meth1();
        // method 2 and 3 are overided so that function will get called from 
        // child class
        a.meth2();
        a.meth3();

        // OUTPUT :
        // parent meth1
        // Child meth2
        // Child meth3  
        // so we can access function on basic of reference and function will called on basis of object 

        // this will show error as reference parent class dont have that method inside it 
        // a.meth4();
    }
}