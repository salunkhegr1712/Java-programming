// in this code i will briefly explain and using function form thread class 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class and it is itself multithreading class
public class ThreadMethods extends Thread{

    // lets write the run function 
    // this function is overided 
    public void run(){

        // lets use static function to get current thread 
        Thread m=Thread.currentThread();

        // lets get id for this thread 
        long id=m.getId();

        // lets get name for thread 
        String name=m.getName();

        // lets get priority 
        int priority =m.getPriority();


        // lets get state of thread
       Thread.State z=m.getState();

    //    get Thread group 
        ThreadGroup zz=m.getThreadGroup();
    
        System.out.println("id : "+id+" name : "+name+" "+" priority : "+priority+" state : "+z+" thread group : "+zz);
    }

    // main function of our java code
    public static void main(String args[]){

        // so lets create a thread 
        ThreadMethods z=new ThreadMethods();
        // z.start();
        // id : 12 name : Thread-0  priority : 5 state : RUNNABLE thread group : java.lang.ThreadGroup[name=main,maxpri=10]
        // now lets set some value and again take output 

        // set priority 
        z.setPriority(9);
        // z.start();
        // id : 12 name : Thread-0  priority : 9 state : RUNNABLE thread group : java.lang.ThreadGroup[name=main,maxpri=10]

        // now set daemon 
        // z.setDaemon(true);
        // z.start();
        // you cant use start function on daemon 

        // now lets use 
        // enquiry function (boolean class Thread function )
        // System.out.println(z.isAlive());//true 
        
        // System.out.println(z.isDaemon());// false
        // System.out.println(z.isInterrupted());// false

        // now use some function and lets see what enquiry function will return 
        
        // z.interrupt();
        // System.out.println(z.isInterrupted());// true
        
        // z.setDaemon(true);
        // System.out.println(z.isDaemon()); //true
        
        // now lets use see our additional thread has priority 9
        z.start();
        System.out.println("hello world");
        // get current thread 
        Thread current =Thread.currentThread();

        // lets print activeCount() of thread 
        System.out.println("active thread : "+Thread.activeCount());
        // active thread : 2
        // current.yield();
        Thread.dumpStack(); //this is same function like getStackTrace in exceptions 
        // java.lang.Exception: Stack trace
        // at java.base/java.lang.Thread.dumpStack(Thread.java:1383)
        // at ThreadMethods.main(ThreadMethods.java:80)
    
    }   
}