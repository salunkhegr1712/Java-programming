// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;
 

// a class rectangle 
class Rectangle{

    int aaaa=100;
    public double length,bredth;
    // declare mutiple overloaded constructors 
    public Rectangle(){

        length=bredth=1;
        System.out.println("Non-Parametric Constructors");
    }
    // parameters will be intergers and it is rectangle
    public Rectangle(int l,int b){

        length=bredth=1;
        System.out.println("2 int Parametric Parent Constructors");
    }
    // parameters will be integer and it is a square 
    public Rectangle(int side){

        length=bredth=side;
        System.out.println("1 int Parametric Parent Constructors");
    }
    // parameters will be double and it is a rectangle
    public Rectangle(double l,double b){

        length=bredth=1;
        System.out.println("2 double Parametric Parent Constructors");
    }
    // parameters will be double and it is square
    public Rectangle(double side){

        length=bredth=side;
        System.out.println("1 double Parametric Parent Constructors");
    }
}

// so Cuboid is a structure such that it is 3D rectangle and it has some of the height
class Cuboid extends Rectangle{
    public double height;

    // we are fetching the value from the parent from child with help of super keyword
    public int valueFromParent(){
        return super.aaaa;
    }   

    // code for the overloaded constructors
    public Cuboid(){
        height=1;
        System.out.println("Non-parametric Child Constructors");
    }

    // a constructors which only takes the parameters of height
    // for this we not taking variable 
    public Cuboid(int h){
        System.out.println("1 int Parametric child Constructors");
        height=h;
    }
    // a constructor which takes double as input and it also take single input 
    public Cuboid(double h){
        height=h;
        System.out.println("1 double Parametric child Constructors");
    }  
    
    // constructor for adjesting for 2 parameters
    public Cuboid(double h,double s){
        
        // s is double so we are passing this to parent constructor which takes double as input
        super(s);   
        height=h;
        System.out.println("2 double Parametric child Constructors");
    }

    public Cuboid(int h,int s){
        
        // s is double so we are passing this to parent constructor which takes double as input
        super(s);   
        height=h;
        System.out.println("2 int Parametric child Constructors");
    }

    // constructor function for 3 parameters
    public Cuboid(int a,int b,int c){
        super(b,c);
        height=a;

        System.out.println("3 int Parametric child Constructors");
    }

    public Cuboid(double a,int b,int c){
        super(b,c);
        height=a;
        System.out.println("1 double and 2 int Parametric child Constructors");
    }

    public Cuboid(double a,double b,double c){
        super(b,c);
        height=a;
        System.out.println("3 double Parametric child Constructors");
    }
    
    public Cuboid(int a,double b,double c){
        super(b,c);
        height=a;
        System.out.println("1 int and 2double Parametric child Constructors");
    }
    // in this case we are going to use the super keyword which will pass the parameters from the child class
    // to parent class

    // function to print the volume of the Cuboid
    public double volume(){
        return height*length*bredth;
    }
}


// the main class
public class parametricConstructors {

    // main function of our java code
    public static void main(String args[]){

        // so now we are ready 
        // so lets start with non parametric Constructors

        // Cuboid a=new Cuboid();
        // Non-Parametric Constructors
        // Non-parametric Child Constructors

        // single int parameteric constructor
        // Cuboid a=new Cuboid(10);
        // Non-Parametric Constructors
        // 1 int Parametric child Constructors

        // single double parameteric constructor
        // Cuboid a=new Cuboid(10.56);
        //Non-Parametric Constructors
        //1 double Parametric child Constructors

        // 2 parameters both int 
        // Cuboid a=new Cuboid(10,20);
        // 1 int Parametric Parent Constructors
        // 1 int Parametric child Constructors
        // so you can see that above case one parameter is passed to parent and child

        // both parameter are double
        // Cuboid a=new Cuboid(10.44,20.13);
        // 1 double Parametric Parent Constructors
        // 2 double Parametric child Constructors

        // now we are going to deal with three constructor
        // Cuboid a=new Cuboid(10,10.44,20.13);
        // 2 double Parametric Parent Constructors
        // 1 int and 2double Parametric child Constructors

        // Cuboid a=new Cuboid(10.66,10.44,20.13);
        // 2 double Parametric Parent Constructors
        // 3 double Parametric child Constructors
        
        // Cuboid a=new Cuboid(10.66,10,20);
        // 2 int Parametric Parent Constructors
        // 1 double and 2 int Parametric child Constructors

        Cuboid b= new Cuboid(10,44,52);
        // 2 int Parametric Parent Constructors
        // 3 int Parametric child Constructors
    }   
}

// super keyword can also be able to fetch the value of fetch defined the value from the parents 
