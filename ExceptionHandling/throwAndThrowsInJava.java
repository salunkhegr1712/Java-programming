// in this code i will explain the use of throw and throw keywords in detailed manner 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class throwAndThrowsInJava {

    // this is caller function for area
    // a function which taking input for length and bredth 
    static void method() throws Exception{

        Scanner input= new Scanner(System.in);
        System.out.print("enter length : ");
        double l= input.nextDouble();
        System.out.print("enter bredth : ");
        double b= input.nextDouble();
        // try{
        // //    System.out.println("area is : "+area(l,b)); 
        // }
        // catch(Exception m){
        //     System.out.println(m);
        // }
        System.out.println("area is : "+area(l,b)); 
        input.close();
    
    }

    // a function which is able to find out the area on basic of given values
    // and will throw exception when length or breadth provided are invalid 
    static double area(double l, double b) throws Exception{
        if(l<=0 || b<=0)
            throw new Exception("negative distances provided");
        
        else{
            return l*b;
        }
    }
    // main function of our java code
    // main function will act like caller for method 
    public static void main(String args[]){

        // lets create a series of functions such like functions call will look like :
            // main()==> method() ==> area() 

        // in area we will check for negative distance and they happens the function area() will throw error 
        // calling method 
        try{
           method(); 
        }
        catch(Exception z){
            System.out.println(z);
        }
        // if you dont do any mistake program runs normally 
        // output :
        // enter length : 10
        // enter bredth : 20
        // area is : 200.0

        // if do some kind of blunder 
        // enter length : 10
        // enter bredth : -1
        // java.lang.Exception: negative distances provided
    }
}