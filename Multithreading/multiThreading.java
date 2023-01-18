// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// declare a class extending Thread class
class MyThread extends Thread{
    
    // now write the code for run function in java 
    public void run(){
        
        // you have to write all code which sholuld be run by additional thread inside run function
        int i=0;
        while(i<100){
            System.out.println("additional thread : "+i+" hello ");
            i++;
        }
    }
}

// now use a interface
// for not known reason i cant use interface here


// the main class
public class multiThreading extends Thread{

    // now write the code for run function in java 
    public void run(){
        
        // you have to write all code which sholuld be run by additional thread inside run function
        int i=0;
        while(i<100){
            System.out.println("additional thread "+i+" hello ");
            i++;
        }
    }

    // main function of our java code
    public static void main(String args[]){

        // now lets create a object for the multiThreaded class
        // multiThreading m= new multiThreading();
            MyThread m=new MyThread();

        // now use start function
        // this execution will now take place inside the seprate controll flow 
        m.start();

        // now write some code inside the main 
        int k=0;
        while(k<100){
            System.out.println("original thread " +k+" world ");
            k=k+1;
        }


    }
    // sample output 
    
}