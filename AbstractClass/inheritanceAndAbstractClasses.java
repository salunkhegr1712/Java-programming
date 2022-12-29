// so main use of the abstract class is in inheritance where we just declare the name of function 
// inside the parent and do method overriding in order to access it s

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// lets declare a abstract class 
// say Polygon and then we will create its child like rectangle, triangle
abstract class Polygon{
    int a;
    // this will help us to see is its child created a abstract class or not 
    public Polygon(){
        System.out.println("a abstract class object is created");
    }

    // declare a basic function which we will access with dynamic method dispatch 

    public void DMD(){
        System.out.println("you used DMD or accessed through child");
    }
    // a abstract class should have a function to overriding
    // so each polygon has area and parameter so lets declare two abstract function
    // for area and perimeter 
    abstract public double area();
    abstract public double perimeter();
}   

// so now we can create the concrete or abstract class which has parent polygon
// if you want to create a concrete class you have to do method overriding for each abstract function inside the parent
// polygon class

// concrete child/derived class
class Triangle extends Polygon{
    // error : triangle is not abstract and does not override abstract method perimeter() in Polygon
    double a,b,c;
    public double area(){
        double s=(a+b+c)/2;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),1/2);
    }
    public double perimeter(){
        return a+b+c;
    }
    // if you override all abstract function inside parent class then current class is concrete class
}

class Rectangle extends Polygon{
    // error : triangle is not abstract and does not override abstract method perimeter() in Polygon
    double length,bredth;

    public double area(){
        return length*bredth;
    }
    public double perimeter(){
        return 2*(length+bredth);
    }
    // if you override all abstract function inside parent class then current class is concrete class

    // DMD cant accces following function 
    public void hh(){
        System.out.println("none");
    }
}
// abstract child class
abstract class Derived extends Polygon{
    // in abstract class you dont have to do method overriding
}
// the main class
public class inheritanceAndAbstractClasses {

    // main function of our java code
    public static void main(String args[]){

        // lets see for rectangle
        // Rectangle a=new Rectangle();
        // System.out.println("area is : "+ a.area());
        // System.out.println("perimeter is : "+ a.perimeter());

        //  output : 
        // a abstract class object is created
        // area is : 0.0
        // perimeter is : 0.0

        // for triangle
        // Triangle a=new Triangle();
        // System.out.println("area is : "+ a.area());
        // System.out.println("perimeter is : "+ a.perimeter());
        
        // o/p :
        // a abstract class object is created
        // area is : 1.0
        // perimeter is : 0.0
        

        // lets try to access function inside abstract class
        Polygon a=new Rectangle();
        System.out.println("area is : "+ a.area());
        a.DMD();    
        // it cant accces hh()
    }   
    // such like that the abstract class can be very usefull in many cases of inheritance
}
