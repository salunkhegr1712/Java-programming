import java.lang.*;
import java.util.Scanner;

public class reverseNumberLoops {
    public static void main(String args[]){
        // System.out.println("Hello World");

        // create a input with the Scanner 
        Scanner input=new Scanner(System.in);

        // the following code will give you the reverse number to which you entered 

        System.out.print("enter the number : ");
        int z= input.nextInt();
        int m,k=0;
        // so we are going to write code in order to write the reverse of integer with while loop 
        int g=z;
        // while(z!=0){
        //     m=z%10;
        //     z=z/10;
        //     k=k*10+m;
        // }
        // System.out.println("the reverse of the number "+g + " is : "+k);

        // lets create same code using the do while loop 
        // we can do anything with the do while loop which we can able to do it with the while loop 

        // do{
        //     m=z%10;
        //     z=z/10;
        //     k=k*10+m;
        // }while(z!=0);

        // System.out.println("the reverse of the number "+g + " is : "+k);
        // z=g;
        // use the for loop 
        // the loops in java are exactly same that of the we can do with the c and cpp 
        int jj=0;
        // System.out.println("digits in number are : ");
        for(;z!=0;z=z/10){
            m=z%10;
            // System.out.println(m);
            k=k*10+m;
            jj++;
        }
        System.out.println("the reverse of the number "+g + " is : "+k);
        // System.out.println("count of digits in "+ g +" is : "+jj);
        if(k==g)
            System.out.println("numbers "+g +" and "+k + " are palindrome");
        else
            System.out.println("numbers "+g +" and "+k + " are not palindrome");  

        
    }
}

