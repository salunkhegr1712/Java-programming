import java.lang.*;
// import the arrays from the java 
import java.util.*;

public class utilArrays {
    
    static void print(String a){
        System.out.print(a);
    }

    static void println(String a){
        System.out.println(a);
    }

    // main function 
    public static void main(String args[]){

        // in this file we will learn more about arrays in utils and how can we use it and
        // use that function in our code to make it more goregeous in look 
        int l[]={5,7,3,2,9,3,8,11};
        int k[]={5,7,3,2,9,3,8};
        print("Array is : ");
        for(int x:l){
            print(" "+x);
        }
        println("");
        // to sort array 
        // Arrays.sort(l);
        // output : Array is :  5 7 3 2 9 3 8 11
                //  Array is :  2 3 3 5 7 8 9 11
        // it is used to compare two array 
        println(""+Arrays.compare(k,l));
        // return 0 if both array are same and -1 if not 
    }
}