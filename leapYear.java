import java.lang.*;
import java.util.Scanner;

// we are going to write the code for the finding out that is the given number is leapYear or not 
public class leapYear {
 
    public static void main(String args[]){
        int z;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the year : ");
        z=input.nextInt();
        if(z%400==0){
            System.out.println("The year "+z+ " is Leap Year");
        }
        else if(z%100==0){
            System.out.println("the year "+z + " is not a Leap Year");
        }
        else if(z%4==0){
            System.out.println("The year "+z+ " is Leap Year");
        }
        else{
            System.out.println("The year "+z+ " is not a Leap Year");
        }
    }
}