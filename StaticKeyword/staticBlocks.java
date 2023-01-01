// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;
// in java the class which is going to used inside main function will get loaded 
// and if class goes to loading the only static block inside them going to load 

class Hell{
    static{
        System.out.println("block 1 from hell");
        
    }
    static{
        System.out.println("block 2 from hell");
        
    }
}

// the main class
public class staticBlocks {

    // in this code i will explain usage of the static variable and how they can be used 

    // static block are used in order to set up values of static variables 
    // static block only able to assign values to static variable only 
    // static block executes on loading of class that is on running of .class file itself

    static{
        Scanner input= new Scanner(System.in);
        System.out.println("static block 1 executed");
    }
    static int z;
    // there can be multiplr static block can exist 

    static{
        // Scanner input= new Scanner(System.in);
        
        z=100;
        // z=input.nextInt();
        System.out.println("value of z is : "+z);
        System.out.println("static block 2 is executed");
        // input.close();
        
        // such like that you can use static block and it can be helpfull to how system is going to execute for run time messages 
        // the applications of static block are low that static function and static data members 
    }

    // there can be multiple static block and they gonna executes order in which you declared them 

    // main function of our java code
    public static void main(String args[]){
        // main function will execute after complete loading of class so static class will run before main 
        System.out.println("main function");

        // static block 1 executed
        // value of z is : 100
        // static block 2 is executed
        // static block 3 executed
        // main function
    }

    // another static block 
    // the static block is like void function without name and returntype 
    static {
        // Hell m= new Hell();
        System.out.println("static block 3 executed");
        // Hell m= new Hell();

    }
}

