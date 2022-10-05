import java.lang.*;
import java.util.Scanner;

public class arrayProblems {
    public static void main(String args[]){
        // System.out.println("hello world");

        // int arr=new int[10];
        int arr[]={9,5,7,6,3,4,2,17,19,22,5};

        // so we are going to write the sum of array elements

        // problem 1 : which will going find out the sum of the all elements inside the array 

        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println("sum of all elements of array is : "+sum);



        // problem 2 : search an element inside the array and print is element is there or not 
        
        // int findingNumber=190;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==findingNumber){
        //         System.out.println("element is found in array");
        //         return;
        //     }

        // }
        // System.out.println("element is not found in array");


        // problem 3 : find maximum number from thea array

        // int max=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max)
        //         max=arr[i];
            
        // }
        // System.out.println("maximum element inside the array is : "+max);


        // problem 4 find out second maximum element from array 

        // int max=0;
        // int secondMax=max;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max){
        //         secondMax=max;
        //         max=arr[i];
        //     }
        // }
        // System.out.println("the second largest element from array is : "+secondMax);

        // problem 5 : rotate array towards right side 
        

        // for visualization of rotation we are going to write for each loops 
        // System.out.println("elements inside the array : ");
        // for( int x:arr){
        //     System.out.print(" " + x+" " );
        // }
        // System.out.println();

        // rotation code left rotation of array 
        // int z=0;
        // int c=arr[0];
        // for(int i=0;i<arr.length-1;i++){
        //     arr[i]=arr[i+1];
        // }
        // arr[arr.length-1]=c;

        // code for right rotation
        // int z=0;
        // int c=arr[arr.length-1];
        // for(int i=0;i<arr.length;i++){
        //     z=arr[i];
        //     arr[i]=c;
        //     c=z;
        // }
        // arr[0]=c;

        // // for eachLoop 
        // System.out.println("elements inside the array after rotation : ");
        // for( int x:arr){
        //     System.out.print(" " + x+" " );
        // }
        // System.out.println();

        // problem : Deletion in array 
        

        // problem 6 : insertion in  the array 

        // printing elements before insertion 
        // System.out.println("array representation before insertion : ");
        // for( int x:arr){
        //     System.out.print(" " + x+" " );
        // }
        // System.out.println();

        // // main code which do the insertion part inside the array 

        // int index=3;
        // int z=0;
        // int val=10;
        // z=arr[index];
        // arr[index]=val;
        // int k=0;
        // for(int i=index+1;i<arr.length;i++){
        //     k=arr[i];
        //     arr[i]=z;
        //     z=k;
        // }

        // // printing elements after insertion 
        // System.out.println("array representation after insertion : ");
        // for( int x:arr){
        //     System.out.print(" " + x+" " );
        // }
        // System.out.println();



        // problem 7 : deleting the element inside the array 

        // printing elements before insertion 
        // System.out.println("array representation before insertion : ");
        // for( int x:arr){
        //     System.out.print(" " + x+" " );
        // }
        // System.out.println();

        // // main code which do the Deletion part inside the array 

        // int index=3;
        // int z=0;
        // int val=10;
        
        // int k=index;

        // for(int i=index;i<arr.length-1;i++){
        //     arr[i]=arr[i+1];
        //     k++;
        // }

        // arr[k]=0;
        

        // // printing elements after insertion 
        // System.out.println("array representation after insertion : ");
        // for( int x:arr){
        //     System.out.print(" " + x+" " );
        // }
        // System.out.println();

        
        // problem 8 : copy two arrays 
        
        // code to copy the array 
        // int b[]=new int[arr.length];
        // for(int i=0;i<arr.length;i++){
        //     b[i]=arr[i];
        // }

        // for(int x: b){
        //     System.out.print(" "+ x+" ");
        // }
        // System.out.println();
        

        // problem 9 : reverse copying the array 
        
        // int b[]=new int[arr.length];
        // int k=0;
        // for(int i=arr.length-1;i>=0;i--){
        //     b[k]=arr[i];
        //     k++;
        // }

        // System.out.println("Array arr : ");
        // for(int x: arr){
        //     System.out.print(" "+ x+" ");
        // }
        // System.out.println();

        // System.out.println("Array b : ");
        // for(int x: b){
        //     System.out.print(" "+ x+" ");
        // }
        // System.out.println();

        // problem 10 : increasing the size of the arrray 

        int b[]={1,2,3,4,6};

        // so we have to increase the size of the array 
        // array b before increasing the size of array b
        System.out.println("Array b : ");
        for(int x: b){
            System.out.print(" "+ x+" ");
        }
        System.out.println();

        int c[]=new int[2*b.length];

        for(int i=0;i<b.length;i++){
            c[i]=b[i];
        }

        b=c;

        // array b after increase in size of array  

        System.out.println("Array b : ");
        for(int x: b){
            System.out.print(" "+ x+" ");
        }
        System.out.println();

        


    }

}