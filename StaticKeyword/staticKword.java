// in this code i will brieflt explain and also demonstarte the use of static keyword 

// mainly static is used in order access a functionality or a data member and member function 
// without creating objectt for that class

// importing basic functionalities from the java library
import java.lang.*;

// now we are going to create a class and a interface and study how it works 
class Hondacar{

    // the static member are and function are common for class and if one object change it
    // it will change for whole class 
    static public int xprice=100;
    int m=10;

    // create a function for Hondacar class 
    static public double onShowroomPrice(String city){

        city=city.toLowerCase();
        switch(city){
            case "mumbai":  
                return xprice+xprice*0.05;
            
            case "delhi":  
                return xprice+xprice*0.07;
            case "pune":  
                return xprice+xprice*0.04;
            default:
                return xprice+xprice*.01;
        }
    }

    // normal function can access both the normal and static variables 
    public void function(){
        xprice=120;
    }
}

// now declare a interface and try to acces the values 
interface Car{
    static int price=1000;
    // we can able to create static functions with body
    
    static void function(){
        System.out.println("function inside the interface ");
    }
    default void hell(){
        System.out.println("hell inside the interface "); 
    }
}

// the main class
public class staticKword {

    // so for our main class lets create a class and lets see how it is going to work

    // function with the static keyword 
    static void function(){
        System.out.println("function from the main class");
    }

    // now create a method with dont have any static keyword before it 
    void method(){
        System.out.println("method from the main class");
    }
    // main function of our java code
    public static void main(String args[]){

        // so lets try to access both the static and non static method()
        // you can able to access the  static function() without creating object for it 
        function();
        // function from the main class
        // now we are going to access the non static function() and lets see what will going to happen 
        
        // for this we have to create object 
        staticKword m=new staticKword();
        m.method();
        // method from the main class

        // now we are going to see class Hondacar
        Hondacar a=new Hondacar();
        Hondacar b=new Hondacar();
        Hondacar c=new Hondacar();

        System.out.println("price for a : "+a.xprice+" price for b : "+b.xprice+" price for c : "+c.xprice);
        // price for a : 100 price for b : 100 price for c : 100

        // now change value for a object and see this again 
        c.xprice=111;
        System.out.println("price for a : "+a.xprice+" price for b : "+b.xprice+" price for c : "+c.xprice);
        // price for a : 111 price for b : 111 price for c : 111


        // lets see can a non-static function() change value for static value
        b.function();
        System.out.println("price for a : "+a.xprice+" price for b : "+b.xprice+" price for c : "+c.xprice);
        // price for a : 120 price for b : 120 price for c : 120

        // access function through object
        System.out.println("price of car in delhi : "+a.onShowroomPrice("delhi"));
        //price of car in delhi : 128.4

        // now lets try to access function with object
        // we can access static method() and data member with name of class or interface directly 
        System.out.println(Hondacar.xprice); // 120
        System.out.println(Hondacar.onShowroomPrice("PunE"));
        //124.8 

        // now lets see this for interface 
        
        Car.function();
        System.out.println("price is : "+Car.price);
        // function inside the interface 
        // price is : 1000

        // we only can access the static method() and data members from interface 
        
    }   
}