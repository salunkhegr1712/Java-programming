// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// print the prime numbers from a range of the numbers    
 
// the main class
public class javaRevision{

    // public class circle{
    //     double radius;
    // }
 
    // in java all the function are written inside the same 

    
    // we are going to write the code such that it will return that a given number is prime or not

    // in java we if we have to acces the the a function from the main static function so you have to define the function
    // with the static keyword 

    // else you have to create class object and then you have to access the function from it 
    int isPrime1(int num){
        if(num==1 || num <=0){
            return -1;
        }
        else if(num==2){
            return 1;
        }
        
        // declaring a variable which we are going to divide and check that is the modulo is equal to 0 or not 
        int k=2;

        while(k!=num/2){
            if(num%k==0){
                return -1;
            }
            k+=1;
        }
        return 1;
    }
    // declaring a global variable 
    static int abc=10;

    static int isPrime2(int num){
        if(num==1 || num <=0){
            return -1;
        }
        else if(num==2){
            return 1;
        }
        
        // declaring a variable which we are going to divide and check that is the modulo is equal to 0 or not 
        int k=2;

        while(k!=num/2){
            if(num%k==0){
                return -1;
            }
            k+=1;
        }
        return 1;
    }
    // main function of our java code
    public static void main(String args[]){

        // create object of class javaRevision and then use isPrime1 function 

        // in java we create the object using new keyword 
        javaRevision hello=new javaRevision();
        // System.out.println(hello.isPrime1(10));

        // or just add the keyword called static with function and then you just have to use the function directly 
        // System.out.println(""+isPrime2(10));

        // so now as we have both of them so we have to select one of the option from them and then we will print 
        // prime number among list 
        Scanner input=new Scanner(System.in);

        // System.out.print("Enter the number : ");
        // int n=input.nextInt();
        
        // int k=0;
        // System.out.println("the prime number among 0 to "+n +" are : ");
        // for(int i=1;i<n;i++){
        //     if(isPrime2(i)==1){
        //         System.out.println(""+i);
        //         k++;
        //     }
        // }
        // System.out.println("total number of prime number from 1 to "+n+" is : "+k);
        
        // just like the function inside the class we are written the code for the
        // member of class
        System.out.println(abc);

        // circle c1=new circle();

        // c1.radius=10;
    

    }
}
