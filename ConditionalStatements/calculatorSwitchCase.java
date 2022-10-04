import java.lang.*;
import java.util.Scanner;

public class calculatorSwitchCase {
    public static void main(String args[]){
        System.out.println("Choose between => \nAdd \nSub \nMul \nDiv \nYour Choice : ");
        String s;

        Scanner input=new Scanner(System.in);

        // using next as we just want to get only one word as the input
        s=input.next();
        s=s.toLowerCase();
        System.out.println(s);

        int a,b;

        switch(s){
            case "add":
                System.out.print("Enter a : ");a=input.nextInt();
                System.out.print("Enter b : ");b=input.nextInt();
                System.out.println("Addition of "+a+ " & "+b +" is : " +(a+b));
                break;
            case "sub":
                System.out.print("Enter a : ");a=input.nextInt();
                System.out.print("Enter b : ");b=input.nextInt();
                System.out.println("Substraction of "+a+ " & "+b +" is : " +(a-b));
                break;
            case "mul":
                System.out.print("Enter a : ");a=input.nextInt();
                System.out.print("Enter b : ");b=input.nextInt();
                System.out.println("Multiplication of "+a+ " & "+b +" is : " +(a*b));
                break;
            case "div":
                System.out.print("Enter a : ");a=input.nextInt();
                System.out.print("Enter b : ");b=input.nextInt();
                System.out.println("Substraction of "+a+ " & "+b +" is : " +((float)a/(float)b));
                break;
            
        }

    }
}