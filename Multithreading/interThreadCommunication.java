// in this code im going to implements the interthread communication 
// java is not responcible for the inter thread communication so programmer have to write the code
// on his oown 

// importing basic functionalities from the java library
import java.lang.*;

// declare a producer class 
class Producer extends Thread{

    interThreadCommunication m;

    // get shared object via help of the constructor 
    public Producer(interThreadCommunication a){
        this.m=a;
    }

    // now lets write code run function 
    @Override
    public void run(){
        int j=0;
        // producer will set value 
        while(true){
            if(m.count==0){
                m.setValue(j);
                System.out.println("value set : "+(j++));
            }

        }
    }

}

// now also write function for consumer 
class Consumer extends Thread{

    // a shared object 
    interThreadCommunication m;

    // get shared object via help of the constructor 
    public Consumer(interThreadCommunication a){
        this.m=a;
    }

    // now lets write code run function 
    @Override
    public void run(){
        
        // consumer will read value
        // int j=0;
        while(true){
            if(m.count==1){
                
                System.out.println("got value : "+m.getValue());
            }
            
        }
    }

}

// the main class
public class interThreadCommunication {

    // it has a value 
    public int value;
    public int count=0;

    // now get and set function for these value 
    synchronized public void setValue(int v){
        count=1;
        value=v;
    }

    synchronized public int getValue(){
        count=0;
        return value;
    }

    // main function of our java code
    public static void main(String args[]){

        // create object which acts like shared object
        interThreadCommunication n=new interThreadCommunication();

        // now create object of producer and the consumer and then go for running threads 
        Producer m=new Producer(n); 
        Consumer p=new Consumer(n);

        m.start();
        p.start();

    }
}
// sample output :
/*value set : 0
got value : 0
value set : 1
got value : 1
value set : 2
got value : 2
value set : 3
got value : 3
value set : 4
got value : 4
value set : 5
got value : 5
value set : 6
got value : 6
value set : 7
got value : 7
value set : 8
got value : 8
value set : 9
got value : 9*/