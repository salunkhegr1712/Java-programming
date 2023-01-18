// in this code we are going to write the code for priorityThreads inside java 

// importing basic functionalities from the java library
import java.lang.*;

// the main class
// lets create main class as the 
public class priorityThreads extends Thread {

    // lets create a run function 
    @Override
    public void run(){
        // this code will give current thread reference 
        Thread m=Thread.currentThread();
        // get priority will give priority of that thread
        System.out.println("Thread priority is : "+m.getPriority()+ " hello world");
    }
    // main function of our java code
    public static void main(String args[]){

        // now we are going to use setPriority and getPriority function 
        Thread a=new priorityThreads();
        Thread b=new priorityThreads();
        Thread c=new priorityThreads();

        // so firstly lets see how code is working 
        System.out.println("priority of a : "+a.getPriority());
        System.out.println("priority of b : "+b.getPriority());
        System.out.println("priority of c : "+c.getPriority());
        // current output ::
        // priority of a : 5
        // priority of b : 5
        // priority of c : 5

        // a.start();
        // // a.start();
        // b.start();
        // c.start();

        // now lets assign some priority
        a.setPriority(9);
        b.setPriority(6);
        c.setPriority(2);

        // now let try to execute them 
        c.start();
        a.start();
        b.start();
        // Thread priority is : 9 hello world
        // Thread priority is : 6 hello world
        // Thread priority is : 2 hello world

        // as i said thread one with highest priority will get executed first 
        // and it will get some priority 

        // so lets see what is priority and what is current workflow 
        Thread m= Thread.currentThread();

        // now get priority for main thread
        System.out.println("priority of main : "+m.getPriority());
        // priority of main : 5

        // now lets set priority for main and then check priority
        m.setPriority(1);
        System.out.println("priority of main is : "+m.getPriority());
        // priority of main is : 10

        // function to get active count 
        System.out.println("active count : "+ Thread.activeCount());
        // active count : 4
        
        // we can use getName function to get name of the thread 
        System.out.println("name of thread : "+m.getName());
        // name of thread : main

        // with the use of setName() function we can get the name of the thread 
        m.setName("ghansham");
        System.out.println("name of thread : "+m.getName());
        // name of thread : ghansham

        // also we can get the id for the thread 
        System.out.println("id is : "+m.getId());
        
        // you cant set the id for the thread 
        
        

    }
}