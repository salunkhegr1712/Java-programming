// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the access specifiers are mainly used to do data hiding 
// we mainly use private access specifier to hide data 
class Rect{

    // so these both length and bredth cant be able to accesed outside the rect class
    // but the they can access the value through method as method can able to acces them as they
    // are present inside the same class 
    private int length;
    private int bredth;
    
    // function to find area 
    public int area(){
        return length*bredth;
    }
    
    // function to find out the perimeter of the rectangle 
    public int perimeter(){
        return 2*length+2*bredth;
    }

    // so now create function so that we can get and set the private values and for that we have to use the 
    // method and set is used to writeback the values and get is used to read the value 

    // functions to give back length and bredth to outside the class
    // both of them do reading 
    public int getLength(){ 
        return length;
    }

    public int getBreadth(){
        return bredth;
    }

    // following function is there which used to set the values inside the object
    // they do write operation

    public void setValues(int a,int b){

        // setValues can acts like sheild which avoid wrong input values 
        length=a;
        if(length<0)
            length=0;

        if(length<0)
            bredth=0;
        bredth=b;
    }
    // also the set value function can acts like filter which will help us to avoid incorrect or wrong input 
    // like for property like length inserting a negative value 

} 

// the main class
public class dataHiding{

    // main function of our java code
    public static void main(String args[]){
        // created a new object 
        Rect rectangle =new Rect();

        // both below code will give error so you have try for some another 
        // way so that you can access the class
        // rectangle.length;
        // rectangle.bredth;

        // so now lets try get and set function to access hidden elements inside the class
        System.out.println("old length : "+rectangle.getLength());
        System.out.println("old bredth : "+rectangle.getBreadth());

        // now lets set values and then again check for value 
        rectangle.setValues(-20,10);

        System.out.println("new length : "+rectangle.getLength());
        System.out.println("new bredth : "+rectangle.getBreadth());

        // output:
        // old length : 0
        // old bredth : 0
        // new length : 20
        // new bredth : 10


 
    }

}