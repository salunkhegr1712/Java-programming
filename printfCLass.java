import java.lang.*;
import java.util.*;
public class printfCLass {
    // here we declare the main function 
    public static void main(String args[]){
        System.out.printf("%d %o %x \n",1000,1000,1000,1000); 
        // print is just function like print and at the end of line it will not push the cursor to next line 

        //1000 1750 3e8  values of 1000 in decimal octal and hexadecimal
        // this is printf function which is used to show the output on the monitor so lets see 
        System.out.printf("%f %e %g \n",10.56,10.56,10.56); // %e andd %g is scientific way to display float values 
        // o/p 10.560000 1.056000e+01 10.5600 
        // here in printf the function anatomy is looks like 
        // System.out.printf(String,arguments comma seperated)
        // in string you can add values with the help of access specifier and each one is independent on there type
        // integer : %d %o %x
        // char : %c
        // string: %s
        // float/Double: %f %e %g
        // boolean : %b

        char c='a'; //you must have to write character in single quotes
        String s="hello world";
        System.out.printf("%s %c \n",s,c);
        // by using operatos like %number$AccessSpecifier we can use the same argument multiple time in any of the order 
        // case 1: using same argument multiple number of times 
        System.out.printf("%1$s %1$s %1$s %1$s\n",s);
        // O/P
        // hello world hello world hello world hello world

        // case 2: manipulating the arrangement of the values at which argument are passed 
        System.out.printf("%2$c %4$d  %1$f  %3$s ",10.65f,'d',"hello world\n",190);
        // if you not add \n at end in printf then you will get % at end so remember to add \n in string at the end 
        // d 190  10.650000  hello world
    }
}

