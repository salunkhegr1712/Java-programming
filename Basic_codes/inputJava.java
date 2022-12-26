import java.util.Scanner;

public class inputJava {
    public static void main(String args[]){

        // lets create a object from the scanner class 
        // the system.in is passed as the argument so that we can use the object abc in next steps 
        Scanner abc=new Scanner(System.in);

        // declare three integer 
        // java is close to both c and cpp 
        int a,b,c;
        // scanner object abc has multiple number of functionalities and we can use them 
        // according to input which we want 
        a=abc.nextInt();
        b=abc.nextInt();

        c=a+b;

        System.out.println("the sum is : " + c);
         
        // $ java inputJava
        //     10
        //     20
        //     the sum is : 30
        // if you want to see for the type of a variable then we first have to use typeCasting and then apply
        // getClass and getSimpleName
        System.out.println(((Object)c).getClass().getSimpleName());
        //integer
        // after using the input so you always have to close the object w
        abc.close();

    }
}

// methods under the scanner object 

// Method	            Description
// nextBoolean()	    Reads a boolean value from the user
// nextByte()	        Reads a byte value from the user
// nextDouble()	    Reads a double value from the user
// nextFloat()	        Reads a float value from the user
// nextInt()	        Reads a int value from the user
// nextLine()	        Reads a String value from the user
// nextLong()	        Reads a long value from the user
// nextShort()	        Reads a short value from the user