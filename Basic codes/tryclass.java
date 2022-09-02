// importing basic packages which are needed in main  function 
import java.lang.*;
import java.util.*;
// main class 
public class tryclass{
    public static void main(String argv[]){
        // the word System.out is system output which can shown on the monitor when programme is executed 
        
        System.out.println("hello world");
        String z="hello";
        int zz=100;
        z=z+zz; //adding the string and a interger in java and lets see how the output will look like
        // it will give error if we try to grab the output in form of the of int here 
        // as we can see here that if one is string so automatically java compiler will use the concatanation 
        System.out.println(z);
    
        System.out.println(10+12+54.78+" hello" +10);
        System.out.println("hello"+10+12+54.78);
        // o/p : 
        // 76.78 hello10
        // hello101254.78

        // you can also able to paranthesis such that it will acts like dyanamic
        System.out.println("the sum of 10 and 20 is " +(10+20));
        // the sum of 10 and 20 is 30
        // here we performef to types of addition firstt is the number addition and second is concatanation
        // operations are taken place from left to right in any programming language
    }   
 
    // it is very good thing about java that you are able to perform any operations on the any types of datatypes 
    // it is very dyanamic as you have to make fstring to make such output in python and at the same type you have to do the
    // multiple no of %d and %f or multiple cout so it is very efficient than them 
}
