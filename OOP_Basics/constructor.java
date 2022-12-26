import java.lang.*;
 
// in this code we are going to write the code for the constructor

// declaring a class called Rectangle 
class Rectangle{

    // declaring property related to the class
    private int length;
    private int bredth;


    // so now we are going to write the function for the class Rectangle
    
    // constructor is special method which will get invoked on object creation and dont have any return type
    // related to it 

    // you can create multiple overloaded constructor function
    // a non parametric constructor
    // there exist a single non parametric constructor only

    public Rectangle(){
        length=10;
        bredth=5;
        System.out.println("non parametric constructor is called!");
    }
    
    // a parametric constructor
    // multiple parametric constructor function can exist
    public Rectangle(int l,int b){
        length=l;bredth=b;
        System.out.println("parametric constructor is called!");
    } 

    // case if Rectangle is a square 
    public Rectangle(int s){
        length=bredth=s;
        System.out.println("parametric constructor is called!");
    } 
    
    // now defining two basic function for the Rectangle class that is area and the perimeter
    // methods have some return type related to them  

    // area method 
    public int area(){
        return length*bredth;
    }

    // perimeter method
    public int perimeter(){
        return 2*(length+bredth);
    }

    // so as we are using data hiding so lets declare some get function which can return us the
    // value of the property

    public int getLength(){
        return length;
    }

    public int getBredth(){
        return bredth;
    }
}


// main class
public class constructor {

    // main function 
    public static void main(String args[]){
        // System.out.println("hello world");

        // Rectangle a=new Rectangle();
        // System.out.println("value of length : "+a.getLength());
        // System.out.println("value of bredth : "+a.getBredth());

        // Rectangle b=new Rectangle(15,10);
        // System.out.println("value of length : "+b.getLength());
        // System.out.println("value of bredth : "+b.getBredth());

        Rectangle b=new Rectangle(10);
        System.out.println("value of length : "+b.getLength());
        System.out.println("value of bredth : "+b.getBredth());

    }
}