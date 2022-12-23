// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// in this code we are going to do a simple task which is we want to create aray of  the objects and store 
// inforation in that array

class Student{

    private String fname;
    private String lname;
    private int rollNumber;
    private String branch;

    // declaring constructor so that we can take input 
    // this will replace default constructor

    public Student(){
        
        Scanner input=new Scanner(System.in);
        System.out.print("enter you First Name : ");
        fname=input.next();

        System.out.print("enter you Surname : ");
        lname=input.next();

        System.out.print("enter you Roll Number : ");
        rollNumber=input.nextInt();

        System.out.print("enter you Branch Name : ");
        branch=input.next();
        // for multi word input we have to take the nextLine function and it is to be used 
        // branch is multiword  so we have to use the multi word input here that is nextline 

        // it is good habbit to close the Scanner object
        input.close();
    }

    // declaring constructor so that we can take input 
    // following function will acts like the parametric constructor

    // java is unable to handle the default parameter values 
    public Student(String f,String l,int r,String b){

        fname=f;lname=l;
        rollNumber=r;
        branch=b;
    }

    public void information(){
        System.out.println("\nName : "+fname+" "+lname+"\n"+"Branch : "+branch+"\nRoll Number : "+rollNumber+"\n");
    }

}
// the main class
public class arrayOfObjects {

    // main function of our java code
    public static void main(String args[]){

        // lets check that our code is running or not 
        // System.out.println("hello world");

        // not we have to create the array of object
    
        // we have to initialise the object array dynamically just like below 
        Student array[]=new Student[5];
        // after that for each instance of object you can use function and property of class 
        array[0]=new Student();
        array[1]=new Student("Ghansham","Salunkhe",111903033,"Computer Engineering");

        array[0].information();
        array[1].information();


    }
}