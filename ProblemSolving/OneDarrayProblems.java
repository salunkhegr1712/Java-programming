// in this code i will answer questions with a function so each function is itself a solution 
import java.lang.*;
import java.util.*;
// main class
public class OneDarrayProblems {
    
    // Java Program to Search an Element in an Array
    static boolean linerSearch(int a[],int val){

        for(int i=0;i<a.length;i++){
            if(a[i]==val)
                return true;
        }
        return false;
    }

    static boolean binarySearch(int a[],int val){
        // for binarySearch we need a sorted array 

        Arrays.sort(a);
        System.out.println(a[0]);
        int start=0,end=a.length-1,mid=0;
        while(){
            mid=(start+end)/2;
            if(a[mid]==val){
                return true;
            }
            else if(a[mid]>val){
                start= mid;
            }
            else{
                end=mid;
            }
        }
        return false;
    }
    // Java Program to Find the Largest Element in an Array
    // Java Program to Sort an Array
    // Java Program to Sort the Elements of an Array in Descending Order
    // Java Program to Sort the Elements of an Array in Ascending Order
    // Java Program to Remove Duplicate Elements From an Array
    // Java Program to Merge Two Arrays
    // Java Program to Check if Two Arrays Are Equal or Not
    // Java Program to Remove All Occurrences of an Element in an Array
    // Java Program to Find Common Array Elements
    // Java Program to Copy All the Elements of One Array to Another Array
    // Java Program For Array Rotation

    // main function
    public static void main(String args[]){

        int z[]={11,1,8,21,38,1,81,8,51,8,2,72,7};
        System.out.println(binarySearch(z,72));
    }   
}