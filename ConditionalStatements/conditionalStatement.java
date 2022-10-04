import java.lang.*;
import java.util.Scanner;

public class conditionalStatement {
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);

        // System.out.println("Enter the number : ");
        int s=10;

        // this following code is code which can be used in order to find the number is odd or even 

        // this is basic way to write the if else statement 
        if(s%2==0){

            // System.out.println(s+" is a Even number");
        }
        // this is else if and it is used when you have multiple conditions to deal with 
        // it will get activated when the condition inside the first else is returned as false 
        else if(s==0){
            // System.out.println(s+" is Zero");
        }
        // if both of if and the else if are fiund false then we will get final result as false 
        else{
            // System.out.println(s+" is Odd number");
        
        }

        // so we are going to write the code for printing the biggest number among 4 
        int a=10,b=11,c=12,d=13;
        // System.out.print("enter a : ");// a=input.nextInt();
        // System.out.print("enter b : ");// b=input.nextInt();
        // System.out.print("enter c : ");// c=input.nextInt();
        // System.out.print("enter d : ");// d=input.nextInt();

        if(a>b && a>d && a>c){
            // System.out.println(a + " is biggest number among "+ " "+a+ " "+b +" "+ c+" "+d);
        }
        else if(b>c && b>d){
            // System.out.println(b+ " is biggest number among "+ " "+a+ " "+b +" "+ c+" "+d);
        
        }
        else if(c>d){
            // System.out.println(c + " is biggest number among "+ " "+a+ " "+b +" "+ c+" "+d);
        }
        else{
            // System.out.println(d + " is biggest number among "+ " "+a+ " "+b +" "+ c+" "+d);
        }
        
        // we are going to write that person is young or not if 14-25 young else not 

        // int z=input.nextInt();

        // if(z>=14 && z<=25){
        //     System.out.println("the person with age "+z + " is young");
        // }
        // else{
        //     System.out.println("the person with age "+z + " is not young");
        // }

        // following is code which is used in order to find out the grade of student on the basis of marks
        // he or she got in perticular exam


        System.out.print("enter your marks : ");
        int marks=input.nextInt();

        // conditions and it is also called as the if else if ladder as it consist of a large number of consecutive if else if system 

        if(marks>=91){
            System.out.println("student is passed with A+ grade");
        }

        else if(marks>=81){
            System.out.println("student is passed with A grade");
        }

        else if(marks>=71){
            System.out.println("student is passed with B grade");
        }

        else if(marks>=61){
            System.out.println("student is passed with  grade");
        }

        else if(marks>=51){
            System.out.println("student is passed with D grade");
        }

        else if(marks>=35){
            System.out.println("student is passed with E grade");
        }
        
        else{
            System.out.println("student is failed with F grade");
        }
    }   
}