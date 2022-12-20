// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class try1{
 
    // basic code so that i can save my time as im so lazy to write System.out.print()
    static void print(String s){

        System.out.print(s);
    }

    static void println(String s){

        System.out.println(s);
    }

    static int fibonacci(int a){
        if(a==1){
            return 1;
        }
        else if(a==0){
            return 0;
        }
        return fibonacci(a-1)+fibonacci(a-2);
    }

    static long factorial(long a){
        if(a==1 || a==0){
            return 1;
        }
        return a*factorial(a-1);
    }

    // double size of array 
    // static int arraydouble(int z[]){
    //     return z;
    // }

    // main function of our java code
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);
        // print("enter your name : ");
        // String n=input.nextLine();
        // println("hello "+n);

        String a="20831128";
        // for(int i=0;i<25;i++){
        //     System.out.printf("element %d : %d\n",i+1,factorial(i));
        // }
        println(""+a.matches("[2][0][0-9][0-9][0-1][0-9][0-3][0-9]"));
    }
}

// output for the fibonacci series 
// ✘ ghansham@an5  ~/Java-Programming   master  cd "/home/ghansham/Java-Programming/" && javac try1.java && java try1
// enter your name : element 1 : 0
// element 2 : 1
// element 3 : 1
// element 4 : 2
// element 5 : 3
// element 6 : 5
// element 7 : 8
// element 8 : 13
// element 9 : 21
// element 10 : 34
// element 11 : 55
// element 12 : 89
// element 13 : 144
// element 14 : 233
// element 15 : 377
// element 16 : 610
// element 17 : 987
// element 18 : 1597
// element 19 : 2584
// element 20 : 4181
// element 21 : 6765
// element 22 : 10946
// element 23 : 17711
// element 24 : 28657
// element 25 : 46368
// element 26 : 75025
// element 27 : 121393
// element 28 : 196418
// element 29 : 317811
// element 30 : 514229
// element 31 : 832040
// element 32 : 1346269
// element 33 : 2178309
// element 34 : 3524578
// element 35 : 5702887
// element 36 : 9227465
// element 37 : 14930352
// element 38 : 24157817
// element 39 : 39088169
// element 40 : 63245986