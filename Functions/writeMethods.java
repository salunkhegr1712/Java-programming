// importing all the basis things which i going to need in next time 
import java.lang.*;
import java.util.*;

// declaring the main class

public class writeMethods {
    
    // here we will write the user defined functions 
    // we will write a code which take two number and print bigg number among them 

    // declaration of function /Methods are quite similar with that of the c and CPP

    // writeMethods.java:28: error: non-static method max(int,int) cannot be referenced from a static context
    // so as our main function is static function so a static function can call only static function so we have to make
    // user defined function static else you will get above error

    // a static interger function 
    static int max(int a,int b){
        if(a>b)
            return a;
        return b;
    }

    // we will write the function for float 
    static float division(int a,int b){

        return ((float)a)/((float) b);
    }

    // a division function with double
    static double doubleDivision(int a,int b){

        return ((double)a)/((double) b);
    }

    // a function to return the startletter of String
    static char firstLetter(String name){
        return name.charAt(0);
    }

    // a function of String return type
    // it is not mandatory to take parameter each time 
    static String inputName(Scanner input){
        
        System.out.print("enter your first name : ");
        String fname=input.next();
        System.out.print("enter your last name : ");
        String lname=input.next(); // using next as we just want one word as input 
        return fname+" "+lname;
    }

    // also now test the last few types 
    // void is function which used for not returning anything from method body
    // lets create a print like python with java and it will save our time to write system.out.println and print each time 
    static void println(String a){
        System.out.println(a);
    }

    static void print(String a){
        System.out.print(a);
    }


    // so if you want to write function without using keyword static so it is also not a big deal 
    // so you just have declare normal function and in main function we have to create object of main class
    // and then with help of that object you will be able to fetch the function without static 

    int sum(int a,int b){

        // you cant return multiple values inside the java Methods
        return a+b;
    }

    // so we can write the function of any return type and it can be depends on user 
    // you can also return the data using pointers 
    // first write the code for the main function
    public static void main(String args[]){
        int a=10;
        int b=15;

        // so now we are going to call the a function which will check the big number among two 

        // System.out.println("the big number among "+a+ " & "+b+" is : "+ max(a,b));
        // o/p : the big number among 10 & 15 is : 15

        // System.out.println("the division of "+a +" & "+b+" is "+division(b,a));
        // System.out.println("the division using doubleDivision of "+a +" & "+b+" is "+division(b,a));
        // o/p : the division of 10 & 15 is 1.5
        // o/p : the division using doubleDivision of 10 & 15 is 1.5

        // passing object as the parameter 

        // System.out.println("the first letter in ghansham is : "+firstLetter("ghansham"));
        // o/p :the first letter in ghansham is : g

        Scanner input=new Scanner(System.in);
        // System.out.println("inputed name is : "+inputName(input));
        
        // OUTPUT :
        // enter your first name : Ghansham
        // enter your last name : Salunkhe
        // inputed name is : Ghansham Salunkhe

        // lets try does we can give Scanner as argument 
        // ok so you can pass a scanner object as parameter so we dont have TO declarationOF IT
        // multiple time and is good 

        // so now there is no need to write sop we can just use println and print which are void functions

        // print("hello world :: ");
        // println("hello world ");
        // hello world :: hello world 

        // so lets call a function without having static before its declaration

        writeMethods h1=new writeMethods();
        println("the sum of 10 and 20 is " +h1.sum(10,20)); // O/P : the sum of 10 and 20 is 30
    }


}
