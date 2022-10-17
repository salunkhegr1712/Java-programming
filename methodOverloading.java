// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class methodOverloading {
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    // we will first declare some function which has same name and will get triggered according to the input 
    static int max(int a,int b){
        // we are going to use the ternary operation in order to print the result 
        return a>b?a:b;
    }

    static float max(float a,float b){
        return a>b?a:b;
    }

    static char max(char a,char b){
        return a>b?a:b;
    }

    static double max(double a,double b){
        return a>b?a:b;
    }

    // so lets write some code for area of rectangle but the function are overloded with each other

    static int area(int a,int b){
        return a*b;
    }

    static float area(float a,float b){
        return a*b;
    }

    static double area(double a,double b){
        return a*b;
    }

    // follow we will write some function so that we can print reverse of inputed data 

    static int reverse(int z){
        int k=0;
        int m=0;
        while(z!=0){
            k=z%10;
            m=m*10+k;
            z=z/10;
        }
        return m;
    }

    static String reverse(String z){
        String k="";
        for(int i=z.length()-1;i!=-1;i--){
            k=k+z.charAt(i);
        }
        return k;
    }
    // main function of our java code
    public static void main(String args[]){

        // so we are done with the function or method writing part so lets see how it will work
        // println("max between 10 and 20 : "+max(10,20));
        // // float are always need to implement as the literal 
        // println("max between 10.4f and 16.2f : "+max(10.4f,16.2f));
        // println("max between 10.4 and 16.2 : "+max(10.4,16.2));
        // println("max between 'a' and 'b' : "+max('a','b'));

        // output :
   
        // max between 10 and 20 : 20
        // max between 10.4f and 16.2f : 16.2
        // max between 10.4 and 16.2 : 16.2
        // max between 'a' and 'b' : b


        // lets see code which will give you area of rectangle

        // println("area of rectangle with l : 10 & b: 8 is :: "+area(10,8));
        // println("area of rectangle with l : 10.2f & b: 7.8f is :: "+area(10.2f,7.8f));
        // println("area of rectangle with l : 10.2 & b: 7.8 is :: "+area(10.2,7.8));

        // output :

        // area of rectangle with l : 10 & b: 8 is :: 80
        // area of rectangle with l : 10.2f & b: 7.8f is :: 79.56
        // area of rectangle with l : 10.2 & b: 7.8 is :: 79.55999999999999

        // also if you dont know the double or float are enough to calculate int so sometime you may skip writing 
        // overloded method with int 


        // lets check the output for the reverse
        println("reverse of 18377 is : "+reverse(18377));
        println("reverse of 'hakuma vatata' is : "+reverse("hakuma vatata"));

        // output :

        // reverse of 18377 is : 77381
        // reverse of 'hakuma vatata' is : atatav amukah
    }
}