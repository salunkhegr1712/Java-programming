// here in this file i will detailfulley decribe the access specifiers inside tha java

// file1 and file2 are inside the same package and
// file3 and file4 are inside the same package

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;
import ghansham.file1;

// the main class
public class mainClass {

    // main function of our java code
    public static void main(String args[]){

        // so file1 and mainClass are in different package lets check can we access it or not 
        file1 m=new file1();
        System.out.println(m.sumOfVariables());//100

        // System.out.println("sum of all variables is : "+(m.a+m.b+m.c+m.d));
        // mainClass.java:21: error: a is not public in file1; cannot be accessed from outside package
        // System.out.println("sum of all variables is : "+(m.a+m.b+m.c+m.d));
        // mainClass.java:21: error: b has private access in file1
        // System.out.println("sum of all variables is : "+(m.a+m.b+m.c+m.d));                                                       
        // mainClass.java:21: error: c has protected access in file1
        // System.out.println("sum of all variables is : "+(m.a+m.b+m.c+m.d));
                                                                    
        // 3 errors
    }
}
