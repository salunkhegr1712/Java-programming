import java.lang.*;
import java.util.*;

public class regexTypeMatching {
    public static void main(String args[]){
        // String s="1007";
        // System.out.println("hello World");
        // always try to go for + instead of * as * also containt 0 and + start with atleast single element 
        // the regular expressions are quite handy when you try to use it for string pattern and
        // finding substring and now also usefull in finding type of number string
        // boolean a=s.matches("[0-1]*");
        // boolean b=s.matches("[0-7]*");
        // boolean c=s.matches("[0-9a-fA-F]*");
        // if (a)
        //     System.out.println("This is a binary");
        // if (b)
        //     System.out.println("This is a Octal");
        // if (c)
        //     System.out.println("This is a HexaDecimal");


        // now we will write the code which check that is date is in format dd/mm/yyyy format or not 

        boolean date="17/12/2002".matches("[0-3][0-9]/[0-1][0-9]/[0-9][0-9][0-9][0-9]");
        System.out.println(date);
    }    

}