// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// also we are going to write the function for each of these

// this will be our base class 
class Rectangle{
    // so each Rectangle has length and breadth
    protected double length,breadth;

    // function to find area 
    public double area(){
        return length*breadth;
    }   

    // function to find out the perimeter
    public double perimeter(){
        return 2*length+2*breadth;
    }
}

// so we are now going to use the inheritance here to create a class such that it has length==breadth
class Square extends Rectangle  {

    protected double side;

    public double area(){
        length=breadth=side;    
        return side*side;
    }
}

// the main class
public class first{

    // main function of our java code
    public static void main(String args[]){

        // lets declare some objects 
        Rectangle r=new Rectangle();
        Square a=new Square();

        a.length=10;
        a.breadth=10;
        a.side=15;
        System.out.println("area of Square is : "+ a.area());
        // System.out.println("area of Square is : "+ a.area());
    }
}