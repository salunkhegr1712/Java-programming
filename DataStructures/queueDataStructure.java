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
        System.out.println("\nQueue Created Successfulley!");
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
        if(front==-1 && rear==-1){
            front++;
            rear++;
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
        System.out.println("\nDequeued "+queueArray[front]);
        front++;
    }

    public void peekFront(){
        System.out.println("\nfront is : "+queueArray[front]);

    }
    public void peekRear(){
        System.out.println("\nrear is : "+queueArray[rear]);

    }
    public void Display(){

        if(front==-1){
            System.out.println("Can't Display! Enqueue first");
            return;
        }
        System.out.println("\nQueue is : ");
        for(int i=front;i<=rear;i++){
            System.out.print(queueArray[i]+" ");
        }
        System.out.println();
    }

    public int CountElementsInQueue(){
        if(front==-1){
            return 0;
        }
        return rear-front+1;
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
            System.out.println("\n1)Enqueue \n2)Dequeue \n3)peekFront\n4)peekRear\n5)Display\n6)Count Of Elements\n0)Exit");
            System.out.print("\nEnter your choice : ");
            k=input.nextInt();
            if(k==0)
                break;

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
                case 5:
                    h.Display();
                    break;
                case 6:
                    System.out.println("no of element in queue : "+h.CountElementsInQueue());
                    break;
                default:
                    System.out.println("\ninvalid input !!");
                    break;
            }
        }
        
            input.close();
        }
        
}


// output example 
/*
        enter size of stack : 10

        Queue Created Successfulley!

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 6
        no of element in queue : 0

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 1

        enter value : 20

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 1

        enter value : 65

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 1

        enter value : 42

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 5

        Queue is : 
        20 65 42 

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 3

        front is : 20

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 4

        rear is : 42

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 5

        Queue is : 
        20 65 42 

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 6
        no of element in queue : 3

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 2

        Dequeued 20

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 5

        Queue is : 
        65 42 

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 6
        no of element in queue : 2

        1)Enqueue 
        2)Dequeue 
        3)peekFront
        4)peekRear
        5)Display
        6)Count Of Elements
        0)Exit

        Enter your choice : 0
*/