// in this code i will do coding for the queue data structure 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// here inside this class we are going to write the function for the queue class

// we will write exceptions for empty queue and full queue
class EmptyQueueException extends java.lang.Exception{
    
    public String toString(){
        return "EmptyQueueException found : Queue is Empty!";
    } 
}
// a exception class for queue is full
class FullQueueException extends java.lang.Exception{
    
    public String toString(){
        return "FullQueueException found : Queue is Full!";
    } 
}
class Queue{

    // it is a FIFO data structure and it will help us to understand 
    // queue is array 
    private int queueArray[];
    private int size;
    // two interger which will acts like front pointer and rear pointer
    private int front;
    private int rear;

    // first lets write constructor for queue 
    public Queue(int s){
        size=s;
        queueArray =new int[s];
        // at start front and rear are equal to -1;
        rear=front=-1;
    }
    // a function which throw error if queue is empty 
    private int isEmpty() throws EmptyQueueException{
        if(front==-1 && rear==-1){
            throw new EmptyQueueException();
        }
        return -1;
    }
    // a function which throw error if queue is full 
    private int isFull() throws FullQueueException{
        if(rear== size-1){
            throw new FullQueueException();
        }
        return -1;
    }
    // now we are going to write the function for the queue 
    public void Enqueue(int x){
        
        try{
            isFull();
        }
        catch(FullQueueException z){
            System.out.println(z);
        }
        if(front==-1){
            front++;rear++;
            queueArray[front]=x;
            // return keyword will end this code as soon as it is called
            return; // void function is there so no return value to give
        }  

        rear++;
        queueArray[rear]=x;
        
    }
    // now we are going to write the function for the queue 
    public void Dequeue(){
        
        try{
            isEmpty();
            
        }
        catch(EmptyQueueException z){
            System.out.println(z);
        }
        System.out.println("Dequeued "+queueArray[front]);
        front++;
    }

    public void peekFront(){
        System.out.println("front is : "+queueArray[front]);

    }
    public void peekRear(){
        System.out.println("front is : "+queueArray[rear]);

    }
}

// the main class
public class queueDataStructure {

    // main function of our java code
    public static void main(String args[]){
        int k;boolean mm=1==1;
        Scanner input= new Scanner(System.in);
        System.out.print("enter size of stack : ");
        Queue h=new Queue(input.nextInt());

        while(mm){
            System.out.println("\n1)Enqueue \n2)Dequeue \n3)peekFront\n4)peekRear\n5)Exit");
            System.out.print("\nEnter your choice : ");
            k=input.nextInt();
            if(k==5)
                mm=false;

            switch(k){

                case 1:
                System.out.print("\nenter value : ");
                    h.Enqueue(input.nextInt());
                    break;

                case 2:
                    h.Dequeue();
                    break;
                case 3:
                    h.peekFront();
                    break;
                case 4:
                    h.peekRear();
                    break;
                default:
                    System.out.println("\ninvalid input !!");
                    break;
            }
        }
        
            input.close();
        }
        
}
