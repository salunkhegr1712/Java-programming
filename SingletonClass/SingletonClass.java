// in this code i will explain in detail about the SingletonClass

// importing basic functionalities from the java library
import java.lang.*;

// now we are going to declare the SingletonClass

class CoffeeMachine{

    // add coffee machine related variables 
    public double coffeeQuantity;
    public double sugarQuantity;
    public double milkQuantity;
    // create a static reference having value null initially
    static private CoffeeMachine reference=null;

    // now we have to make constructor private
    private CoffeeMachine(){
        coffeeQuantity=100;
        milkQuantity=50;
        sugarQuantity=10;
    }

    // so now we have to create the method which can be used by main function in order to access the class object 
    public static CoffeeMachine getObjectInstance(){
        // initially if objext is no there so create one and pass it to reference
        if(reference==null)
            reference=new CoffeeMachine();
        return reference;
    }   
}

// the main class
public class SingletonClass {

    // main function of our java code
    public static void main(String args[]){
        //  you cant perform 
        // CoffeeMachine m=new CoffeeMachine();
        // CoffeeMachine() has private access in CoffeeMachine

        // as method is static so it is common throughout the class
        CoffeeMachine z=CoffeeMachine.getObjectInstance();
        System.out.println("coffee quantity of variable 1 is : "+z.coffeeQuantity);
        System.out.println("milk quantity of variable 1 is : "+z.milkQuantity);
        System.out.println("sugar of variable 1 is : "+z.sugarQuantity);
        //coffee quantity of variable 1 is : 100.0
        // milk quantity of variable 1 is : 50.0
        // sugar of variable 1 is : 10.0

        // now create another object and see are both have same reference or not 
        CoffeeMachine k=CoffeeMachine.getObjectInstance();
        
        if(k==z){
            System.out.println("reference  is same ");
        }
        else{
            System.out.println("reference is not same ");
        }
        //reference  is same 
        
    }
    // thus how you can use the singleton objects 
}