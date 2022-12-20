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

// this is a class where we are going to define the  basic class for rectangle which has the length and bredth as its
// property and the it will also have some method inside them  
class rectangle{
    
    // declaring length and bredth 
    public double length;
    public double bredth;

    // now we are ready to go and now we have to add some method inside them 
    public double area(){
        return length*bredth;
    }

    // method which can be helpfull to calculate the perimeter of the rectangle 
    public double perimeter(){
        return 2*(length+bredth);
    }

    // we are going to write the code for the check that rectangle is square or not 

    public boolean isSquare(){
        // ternary operator to return that given dimensions are of square or not 
        return (length==bredth)?true:false;
     
    }
}

// also we are going to write a class for square 
class square{

    // property of class square 
    public double side;

    public double area(){
        return Math.pow(side,2);
        // return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}

// we are going right function for cylinder 
class cylinder {
    // properties of class cylinder 
    public double height;
    public double radius;
    
    // we are going to write the methods for the cylinder
    // method to calculate the volume() of the cylinder
    public double volume(){
    
        // using another class inside a class 
        circle c=new circle();
        c.radius=radius;
        return c.area()*height;
    } 
    
    // code to calculate surfaceArea of the cylinder 
    public double surfaceArea(){
        // A=2πrh+2πr**2
        circle c=new circle();
        c.radius=radius;
        double area=c.perimeter()*height+2*c.area();
        return area;
    }

    // code for lateral area of the cylinder
    public double lateralArea(){
        return 2*3.14*radius*height;
    }
    public double baseArea(){
        return Math.PI*radius*radius;
    }
}
// class student {

// }
// in java main class is declared with key word public before it and any other class can declared just like above 

// the main class
public class first{

    // main function of our java code
    public static void main(String args[]){

        // System.out.println("hello world");

        // now access the class inside the main function from main class 

        // circle c1=new circle();
        // c1.main();

    //     circle c1=new circle();
    //     // here you cant access the private value but the main function inside the circle class
    //     // can be able to access the private property and the method
    //     c1.radius=12.22;
    //     System.out.println(c1.area());
    //     System.out.println(c1.perimeter());


        // you are also able to create multiple objects for a class
        // circle c2=new circle();
        // c2.radius=11;
        // System.out.println(c2.area());
        // System.out.println(c2.perimeter());

        // lets check the class rectangle and class square

        // rectangle a=new rectangle();
        // square b=new square();

        // a.length=10;
        // a.bredth=10;

        // b.side=20;

        // System.out.println("area of rectangle is : "+a.area());
        // System.out.println("perimeter of rectangle is : "+a.perimeter());
        // System.out.println("is rectangle is square : "+a.isSquare());
        // System.out.println("area of square is : "+b.area());
        // System.out.println("perimeter of square is : "+b.perimeter());

        // lets now check the code for the cylinder 

        cylinder c1=new cylinder();

        c1.height=10;
        c1.radius=7;

        System.out.println("Surface Area of cylinder is : "+c1.surfaceArea());
        System.out.println("lateral Area of cylinder is : "+c1.lateralArea());
        System.out.println("volume of cylinder is : "+c1.volume());
        System.out.println("Base area of cylinder is : "+c1.baseArea());
    }
}
