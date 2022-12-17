// here i will write search algo in java functions
import java.lang.*;
import java.util.*;

public class searchAlgos {
    
    // here i will write code for the binary and the bubble sort 

    static int linearSearch(int s[],int val){
        int l=s.length;

        for(int i=0;i<l;i++){
            if(s[i]==val){
                return 1;
            }
        }
        return -1;
    }

    // bubble sort it is an efficient algo to find out that is number is there inside the array or not 

    // for bubbleSearch we need a sorted array 
    static int binarySearch(int j[],int val,int start,int end){
        int mid=(start+end)/2;
        if(end>=start){

            if(j[mid]==val){
                return 1;
            }
            else if(j[mid]<val){
                return binarySearch(j,val,mid+1,end);
            }
            else{
                return binarySearch(j,val,start,mid-1);
            }
               
        }
        else{
            return -1;
        } 
    }   

    // main function 
    public static void main(String args[]){
        // System.out.println("hello");
        // lets create a array 

        int j[]={11,56,89,2,72,863,18,1,8,483,5,18,521,111,6488,22,5,48,52,4};


        
        // for each loop to print the array 
        // for(int x:j){
        //     System.out.print(" " +x );
        // }
        // System.out.println(binarySearch(j,5221));

        // library function to sort the java array 
        Arrays.sort(j);
        // for(int x:j){
        //     System.out.print(" " +x );
        // }

        System.out.print(binarySearch(j,89,0,j.length));
    }   

}