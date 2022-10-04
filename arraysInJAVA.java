import java.lang.*;
import java.util.*;

public class arraysInJAVA {
    public static void main(String args[]){
        // System.out.println("hello world");
        Scanner input=new Scanner(System.in);
        
        // below i will show some of the ways to use initialise the array 
        // in java we are going to use the java array and array is object 

        // initialising array as object
        
        // with the use of the initialising the array with use of the new 
        int arr[]=new int[3];

        // initialise the array like below and you dont have to specify the size of array and java is smart enough to 
        // recognize the size of array and we can able to print the size of array with arrayName.length 
        int a[]={18,12,4,5,1,3,1,3,1};

        // remember it 
        // also int aa[]==int[]aa=int []aa;
        // but we are going to follow convrections so we always use int z[] in order to generate an array 

        System.out.println("size of array is : "+a.length);

        // we have one method in which arrayName.length will give you size of an array 
        // System.out.println("size of array is : "+arr.length);

        // note for loop is only there for the reading through the array and it is not that good for
        // modifying value in array with the use of foreach loop 


        for(int x=0;x<arr.length;x++){
            // System.out.print("Enter element : ");
            arr[x]=input.nextInt();  
        }

        System.out.println();
        // System.out.println("element inside the array are : ");
        for(int z:arr){
            System.out.println(z);
        }


    }
}