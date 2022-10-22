// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class primeNoFunction {
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // function for to find the prime number from given input

    static int prime(int z){
        int p=0;
        int k=2;
        if(z==2 ){
            return 1;
        }
        if(z==0 || z==1){
            return -1;
        }
        while(k<=z/2){
            if(z%k==0)
                return -1;
            k=k+1;
        }
        return 1;
    }

    // main function of our java code
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        print("enter the number : ");
        int z=input.nextInt();
        if(prime(z)==1){
            println("the number "+z+" is a prime number");
        }
        else{
            println("the number "+z+" is not a prime number");
        }
    }
}