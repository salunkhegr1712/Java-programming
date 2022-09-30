// while imporing the data you have to be the keen that * is important 
import java.lang.*;
import java.util.*;

public class javaCode {
    public static void main(String args[]){
        // try to run the printf function which will print the data inside " "
        // System.out.printf("hello world \n");

        // create a scanner which is going to used as the input and we can use many function
        // like input.nextInt() input.nextFloat and many more you can take the input of the any type
        // you just have to use the proper function after the input.
        // creating new scanner from constructor and scanner will take the System.in as the input  
        // Scanner input=new Scanner(System.in);
        // int z= input.nextInt();

        // in java it is very easy to add any datatype with other as java give us free hand 
        // System.out.printf("inputed number is : "+z+ "\n");

        // the input.next only will incure single word and stop as soon as it gets a space 
        // System.out.println("string is" +(char)32+ input.next());
        // (char)32 is ascii code for the word 32 
        
        // byte s=12;
        // float s=9.56f;
        // int ss=0x7823;
        

        // if you want to take multiword input 
        // System.out.println("string is"+ (char)32+input.nextLine());
        // System.out.println(ss);

        // java will automatically detect the hex and binary and will give output in decimal form 
        int sss=0b01101101;
        // System.out.println(sss);
        // ((Object)s).getClass().getSimpleName() it is a way to find the type of the variable
        // steps first type cast variable into and object and then find the object is related to the which class 

        // String s="hello im ghansham ";
        double m=89.3839477;

        // System.out.format("%s\n",s);
        // format will play very good role when you are dealing with the float values 
        System.out.format("%.9f\n",m);
        // it is always good habbit to close the object which is declared with the use of the Scanner

        // input.close();
    }
}
