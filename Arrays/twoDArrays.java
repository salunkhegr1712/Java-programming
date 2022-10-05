import java.lang.*;
import java.util.*;

public class twoDArrays {
    public static void main(String args[]){
        // so we have to create 2 d array with two ways 

        // array in java is always created inside the heap 

        // initialising using the constructor method 
        int arr[][]=new int[3][3];

        // using normal declaration using curly braces and direct value declaration 
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        // using the foreach loop to print the 2D array 

        // as you are dealing woth 2 d array in first iteration you have send the array reference 
        for(int x[]:arr){
            for(int s:x){
                // System.out.print(" "+ s+" ");
            }
            // System.out.println();
        }   

        // for loop to print the 2D array 

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                // System.out.print(" "+a[i][j] +" ");
            }
            // System.out.println();
        }


        // so now we are going to see jagget array so these are 2d array but dont have same inner size every time

        // ex: 

        // a----> |  | --> | 1 | 2 | 3 | 4 |
            //    |  | --> | 1 | 2 |
            //    |  | --> | 1 | 2 | 3 |

        // SO these are not 3*3 or 3*4 matrix so if you want to create them 

        // below are some method to create such Array 
        
        int z[][]={{1,2,3,4},{1,2},{1,2,3}};

        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[i].length;j++){
                // System.out.print(" "+z[i][j] +" ");
            }
            // System.out.println();
        }

        // create jagget arrays with constructor 

        int xxx[][]=new int[3][];
        xxx[0]=new int[4];
        xxx[1]=new int[2];
        xxx[2]=new int[3];

        for(int i=0;i<xxx.length;i++){
            for(int j=0;j<xxx[i].length;j++){
                System.out.print(" "+xxx[i][j] +" ");
            }
            System.out.println();
        }
    }
}