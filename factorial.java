import java.lang.*;
import java.util.Scanner;

// here i will write the code for factorial using loop

public class factorial {
    public static void main(String args[]){
            Scanner input=new Scanner(System.in);
            System.out.print("enter the number to find factorial : ");
            
            // as we are getting much larger values so we are going to use long 
            // as it take more number that of int but it also 
            long m=1;
            
            long a=input.nextInt();
            if(a==0 || a==1){
                System.out.println("factorial of "+a +" is : "+ 1);
                return;
            }
            for(int i=1;i<=a;i++){
                m=m*i;
            }
            System.out.println("factorial of "+a +" is : "+ m);
    }
}