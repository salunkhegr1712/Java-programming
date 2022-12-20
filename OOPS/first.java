// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// in this code we are going to write the class in java 
// in the class there exist categorisation and that is data members and member function

// that is one is 1) property which signifies some value and 2) Behaviour which will able to show some
// method in which property can be manipulated 

// in class with each property and each Behaviour you should provide some access specifier which will
// play important role when we want to fetch that class outside the declared class
// ex:

// public double radius;  ===> property
// public double area(double radius){ ===> method
    // 
// }

class circle{

    // private property and function cant be accessed outside the class 
    // declaring a property 

    public double radius;

    // this function will calculate and return the area of the circle
    public double area(){

        return Math.PI*Math.pow(radius,2);
    }

    // this function will return the perimeter of the circle 
    public double perimeter(){
   
        return 2*Math.PI*radius;
    }
    // you can able to call the class inside the function and also outside the function
    public void main(){
        circle c1=new circle();
        c1.radius=10;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}

// class rectangle{

// }

// class student {

// }
// in java main class is declared with key word public before it and any other class can declared just like above 

// the main class
public class first{

    // main function of our java code
    public static void main(String args[]){

        // System.out.println("hello world");

        // now access the class inside the main function from main class 

        circle c1=new circle();
        c1.main();

    //     circle c1=new circle();
    //     // here you cant access the private value but the main function inside the circle class
    //     // can be able to access the private property and the method
    //     c1.radius=12.22;
    //     System.out.println(c1.area());
    //     System.out.println(c1.perimeter());


        // you are also able to create multiple objects for a class
        circle c2=new circle();
        c2.radius=11;
        System.out.println(c2.area());
        System.out.println(c2.perimeter());
    }
}
