// in this code we are going to see how 2 thread works and we are not going to use the synchronisation 
// anywhere inside the code 

// importing basic functionalities from the java library
import java.lang.*;

// now lets create a multithreading class
class MyThread1 extends Thread{
    testCode data;
    // create a constructor 
    public MyThread1(testCode d){
        data=d;
    }

    // now write the run function 
    @Override
    public void run(){ 
        
        data.display("hello_world");
        
    }
}

// another class in order to print welcome 
class MyThread2 extends Thread{
    
    testCode data;
    // create a constructor 
    public MyThread2(testCode d){
        data=d;
    }

    // now write the run function 
    @Override
    public void run(){
        testCode m= new testCode();
        data.display("welcome");
    }
}

// the main class
public class testCode {

     // lets declare a function which print each character inside string 
    synchronized void display(String a){

        // synchronized block 
        synchronized(this){
        // we are going to use length function to calculate the length of the string in java
        for(int i=0;i<a.length();i++){
            System.out.print(a.charAt(i));
        }
        // System.out.println();
        }
        // for(int i=0;i<a.length();i++){
        //     System.out.print(a.charAt(i));
        //     try{Thread.sleep(1000);}catch(Exception e){};

        // }
    }

    // main function of our java code
    public static void main(String args[]){

        // create a object and send same object to both class 

        testCode data=new testCode();
        // now lets create object for each class
        MyThread1 a= new MyThread1(data);
        MyThread2 b= new MyThread2(data);

        // now run both on different thread and they will create there seperate control flow 
        // System.out.println("active threads : "+Thread.activeCount());
        // active threads : 1

        a.start();
        b.start();

        // we can have multiple and different outputs here :
        // hello_worldwelcome
        // hewelcomello_world 
        // helwelcomelo_world

        // so we are not using synchronisation here 
        // with synchronisation we can get expected outputs


        // System.out.println("\nactive threads : "+Thread.activeCount()); 
        // active threads : 3

        // after creating function synchronized
        // hello_worldwelcome each time

    }
}