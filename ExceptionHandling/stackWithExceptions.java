// inside this code i will write the code for stack data structure in java programming language 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

class Overflow extends java.lang.Exception{
    public String getMessage(){
        return "stack is full i.e. in overflow condition\n\t\t ~toMessage() from Overflow";
    }
    public String toString(){
        return "stack is full i.e. in overflow condition\n\t\t ~toString() from Overflow";
    }
}

class Underflow extends java.lang.Exception{
    
    public String getMessage(){
        return "stack is empty i.e. in Underflow condition\n\t\t ~toMessage() from Underflow";
    }
    public String toString(){
        return "stack is empty i.e. in Underflow condition\n\t\t ~toString() from Underflow";
    }
}
// declaring class here for java 
class Stack{
    
    // stack has size top and current position 
    // lets create stack with array 
    private int top;
    private int size;
    
    // stack is nothing but a array 
    private int stackArray[];

    // here inside constructor we take array size 
    public Stack(int s){
        stackArray=new int[s];
        this.size=s;
        top=-1;
    }

    // now we write the functions for stack 

    // we need isEmpty() and isFull() function in pop and push function
    // these function will throws exception if such case arrises 

    private int isEmpty() throws Underflow{
        // isEmpty() will throws underflow
        if(top==-1)
            throw new Underflow();
        
        // return -1 if stack is not empty 
        return -1;
    }
    private int isFull()throws Overflow{
        if(top==size-1){
            throw new Overflow();
        }
        return top==size?1:-1;
    }

    // a function to print the value at top of the STACK 
    public void peek(){
        if(top!=-1)
            System.out.println("\ntop of the stack is  : "+stackArray[top]); 
        System.out.println("\n Invalid function"); 
    }
    // now here came most important method 
    // here we use our userDefined exception for underflow and overflow of stack 
    public void push(int val){
        try{
            isFull();
            top++;
            stackArray[top]=val;
            
        }
        catch(Overflow z){
            // System.out.println(z.getMessage());
            System.out.print(z);
        }
    }

    // function to pop element from stack 
    public int pop(){
        int z=-111;

        try{
            isEmpty();
            z=stackArray[top];
            top--;
        }
        catch(Underflow m){
            // System.out.println(m.getMessage());
            System.out.print(m);
        }

        // z will return will return -111 if stack is empty
        return z;
    }

}


// the main class
public class stackWithExceptions {

    // main function of our java code
    public static void main(String args[]){

        Stack z=new Stack(5);
        // z.push(11);
        // z.push(99);
        // z.push(10);
        // z.push(99);
        // z.push(10);
        // z.push(111);
        // z.peek();
        // stack is full i.e. in overflow condition
                //  ~toMessage() from Overflow
        // stack is full i.e. in overflow condition
                        //  ~toString() from Overflow
        // top of the stack is  : 10

        // z.pop();
        // z.peek();
        // stack is empty i.e. in Underflow condition
                //  ~toMessage() from Underflow
        // stack is empty i.e. in Underflow condition
                        //  ~toString() from Underflow
        //  Invalid function

        // in such cases the exception handling will be super usefull 

        // lets create a menu driven code

        Scanner input= new Scanner(System.in);
        System.out.print("enter size of stack : ");
        int s=input.nextInt();
        Stack h=new Stack(s);

        Boolean mm=true;
        int k;
        while(mm){
            
            System.out.println("\n1)Push \n2)Pop \n3)Peek\n4)Exit");
            System.out.print("\nEnter your choice : ");
            k=input.nextInt();
            if(k==4)
                mm=false;

            switch(k){

                case 1:
                System.out.print("\nenter value : ");
                    h.push(input.nextInt());
                    break;

                case 2:
                    System.out.print("\nenter value : ");
                       System.out.println("\npopped "+h.pop()+" from stack");
                        break;
                case 3:
                    h.peek();
                    break;
            }

        }
        input.close();

    }
}

// output :
    // enter size of stack : 5
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 1
    
    // enter value : 10
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 3
    
    // top of the stack is  : 10
    
    // Invalid function
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 1
    
    // enter value : 22
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 1
    
    // enter value : 65
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 3
    
    // top of the stack is  : 65
    
    // Invalid function
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 2
    
    // enter value : 
    // popped 65 from stack
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 2
    
    // enter value : 
    // popped 22 from stack
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 2
    
    // enter value : 
    // popped 10 from stack
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 2
    
    // enter value : stack is empty i.e. in Underflow condition
    //                 ~toString() from Underflow
    // popped -111 from stack
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 2
    
    // enter value : stack is empty i.e. in Underflow condition
    //                 ~toString() from Underflow
    // popped -111 from stack
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 2
    
    // enter value : stack is empty i.e. in Underflow condition
    //                 ~toString() from Underflow
    // popped -111 from stack
    
    // 1)Push 
    // 2)Pop 
    // 3)Peek
    // 4)Exit
    
    // Enter your choice : 4