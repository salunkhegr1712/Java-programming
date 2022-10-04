import java.lang.*;
import java.util.Scanner;

// armstrongNumber are one which is like belows 
// 371= 3**3 +7**3+1**3
//  so a perticular number is equal to the sum of cubes of all digits in that number 

public class armstrongNumber {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        // taking number as the input 
        System.out.print("enter the number : ");
        int a=input.nextInt();
        int m=a,k=0,s;
        while(a!=0){
            s=a%10;
            k=k+(s*s*s);
            a=a/10;
        }   

        if(m==k){
            System.out.println("the number "+ m +" is an Armstrong Number");
            return;
        }
        System.out.println("the number "+ m +" is not an Armstrong Number");
        
    }
}