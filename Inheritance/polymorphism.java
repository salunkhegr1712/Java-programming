// inside java we can achive polymorphism using method overloading  or using using overiding

// here inside this code we are going to see the both method overiding and method overloading

// in java objects were get created at run time that why :

// method overloading provides compile time polymorphism
// method overiding provides run time polymorphism

// functions differ by parameters and return type are called as the overloaded functions 
// in method overriding all things are same return type and also the count of the parameter 
// you can have multiple overloaded functions inside the same class but for overloading you atleast need 
// one parent and Child class pair 

// importing basic functionalities from the java library
import java.lang.*;

// we see here both method overiding and method overloading
class Parent{
    public void display(){
        System.out.println("parent saying hello");
    }
    public void display(int a){
        System.out.println(" 1 parameter : parent saying hello");
    }
    public void display(int a,int b){
        System.out.println(" 2 parameter : parent saying hello");
    }

    // three function inside same class so they are overloaded
}

class Child extends Parent{
    @Override
    public void display(){
        System.out.println(" Child saying hello");
    }
    @Override
    public void display(int b){
        System.out.println(" 1 parameter : Child saying hello");
    }
    // two classes are overloaded 
}

// public void display(int b) and public void display(int b,int c) both are the function and these two 
// are overloaded and also overided 


// the main class
public class polymorphism {

    // main function of our java code
    public static void main(String args[]){
        Child a=new Child();

        a.display();
        a.display(1);
        a.display(2,1);

        // Child saying hello
        // 1 parameter : Child saying hello
        // 2 parameter : parent saying hello
    }
}
