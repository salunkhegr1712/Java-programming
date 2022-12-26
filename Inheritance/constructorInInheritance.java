// in this code we are going to see how the constructors will react in case of inheritance 

import java.lang.*;
import java.util.*;

// code for the base class
class Parent{

    // lets declare a constructor (a default non parametric constructor)
    public Parent(){
        System.out.println("constructor of parent");
    }
}

// now we are going to write the code for the child class
class Child extends Parent{
    // constructor for the children (it is also a non parametric constructor)
    public Child(){
        System.out.println("constructor of child");

}
// GOAL :
// now we will going to create a object for the class child and see which constructor will get invoked 
}

// define another class which will inherit the child class
class Grandchild extends Child{

    public Grandchild(){
        System.out.println("constructor of Grnadchild");
}
}
// main class 
public class constructorInInheritance{
    // main function 
    public static void main(String args[]){
        // System.out.println("");
        // Child a= new Child();

        // so first its parent constructor is called and then further a child attributes (function and data members will get added)

        // output : 
        // constructor of parent
        // constructor of child

        Grandchild a=new Grandchild();

        // output:
        // constructor of parent
        // constructor of child
        // constructor of Grnadchild
    };  
}
      








