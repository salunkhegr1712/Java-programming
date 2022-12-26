import java.lang.*;
import java.util.*;

// class for circle
class Circle{
    public double radius;

    // function for area
    public double area(){
        return Math.PI*radius*radius;
    }   

    // function for perimeter and circumference
    public double circumference(){
        return Math.PI*2*radius;
    }

    public double perimeter(){
        return circumference();
    }
}

// derived class
class Cylinder extends Circle{
    // so cylinder is circle having some height to it 
    public double height;

    // another function to find out the surface area of the cylinder
    public double area1(){
        return 2*area()+perimeter()*height;
    }
    // function to return the volume of the cylinder 
    public double volume(){
        return area()*height;
    }

}

// main class
public class cylinder {

    // main function 
    public static void main(String args[]){
        Cylinder a=new Cylinder();
        a.radius=10;
        a.height=10;
        System.out.println("area is : "+a.area1());
        System.out.println("height is : "+a.height);
        System.out.println("radius is : "+a.radius);
        System.out.println("volume is : "+a.volume());
    }
    // output :
    // area is : 1256.6370614359173
    // height is : 10.0
    // radius is : 10.0
    // volume is : 3141.5926535897934
}