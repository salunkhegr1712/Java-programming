// almost all of the programming provide facility to call own inside self that phenomenon in the coding is called as the recursion 
// where a function call itself inside own 

// so recursion make to much easy in many coding scenerios 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class recursion {
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // so we are going to write some recursion codes to find the fibonacci series and the to find the factorial of the a number 
    static int fibonacciElement(int n){
        // two base conditions 
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }

        else{
            // in this step the recursion is happeing where function is calling itself 
            // the recursion forms a recursion tree always and fetch the answer
            return fibonacciElement(n-1)+fibonacciElement(n-2);
        }
    }

    // function to find out the factorial of a number 
    static int factorial(int z){
        if(z==0){
            return 1;
        }
        return factorial(z-1)*z;
    }   

    // function to write the sum of all number from 0 to z using the recursion technique 

    static int sumUptoN(int z){
        if(z==1){
            return 1;
        }
        return z+sumUptoN(z-1);
    }
    
    // main function of our java code
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);
        // print("enter number : ");
        // int z=input.nextInt();
        // println("the "+ z+" th element of fibonacci series is : "+fibonacciElement(z));

        // print("enter number : ");
        // int z=input.nextInt();
        // println("the factorial of "+z +" is : "+factorial(z));

        print("enter number : ");
        int z=input.nextInt();
        println("sum upto "+z+" from 0 is "+sumUptoN(z));
    }   
}

// some outputs :
// enter number : 3
// the 3 th element of fibonacci series is : 1

// enter number : 4
// the 4 th element of fibonacci series is : 2

// enter number : 5
// the 5 th element of fibonacci series is : 3

// enter number : 6
// the 6 th element of fibonacci series is : 5