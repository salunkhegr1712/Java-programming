import java.lang.*;
import java.util.*;

public class problemsMethods {
    // two small function which will save our efforts to write println and print codes 
    static void print(String a){
        System.out.print(a);
    }

    static void println(String a){
        System.out.println(a);
    }

    
    // problem 1 write a method such that it will give that a number is prime or not 
    static boolean isPrime(int m){
        if(m<=1)
            return false;
        if(m==2){
            return true;
        }
        else{
            int a=2;
            while(a<=m/2){
                if(m%a==0){
                    return false;
                }
                a=a+1;
            }
            return true;
        }   
    }

    // problem 2 : find out the gcd of two numbers 

    // in order to use gcd we two function so that we can get smaller and larger number between numbers 
    static int max(int a,int b){
        if(a>b)
            return a;
        else 
            return b;
    }

    static int min(int a,int b){
        if(a<b)
            return a;
        else 
            return b;
    }

    // here we go for our main function where we are going to find out the gcd of two numbers 

    static int gretestCommonDivisor(int a,int b){
        int m=max(a,b);
        int n=min(a,b);
        int gcd=0;
        int i=1;
        while(i<=n){
            if(m%i==0 && n%i==0)
                gcd=i;
            
            i++;
        }
        return gcd;
    }

    //problem 3 : find out the max element from the list 

    static int maxAmongArray(int z[]){
        // a simple way to find out the max among the array by sorting array and giving the last element
        //  as return but it will change the array and we dont want that to happen 
        // Arrays.sort(z);
        // return z[z.length-1];
        int big=0;
        for(int i=0;i<z.length;i++){
            if(z[i]>big)
                big=z[i];
        }
        return big;
    }

    // main function 
    public static void main(String args[]){
        int n,m;
        Scanner input=new Scanner(System.in);
        // print("enter number1 : ");
        // m=input.nextInt();
        // print("enter number2 : ");
        // n=input.nextInt();

        // code to check is prime function is working or not 
        // if(isPrime(n))
        //     println("number is prime");
        // else
        //     println("number is not prime");


        // code to check that is gcd function is working or not  

        // println("gcd of " +m+" & "+n+" is : "+gretestCommonDivisor(m,n));

        int z[]={4,71,825,2,3,93,77};
        // for(int x:z){
        //     println(""+x);
        // }
        println("maximum element :"+maxAmongArray(z));
        

    }
}