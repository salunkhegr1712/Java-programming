import java.lang.*;
import java.util.*;

public class stringsMethods {
    // declaring main function inside the class 
    public static void main(String args[]){

        // we are creating 2 strings which are created inside the pool 
        String s1="Hello World";
        String s2="www.google.com";
        // String s3="Ghansham Salunkhe";
        // // now we will create string with help of constructor 
        // String obj=new String("Ghansham Salunkhe");
        // now we will learn about the methods inside the String 
        
        // to toLowerCase this function will convert all the characters inside the string into lower case alphabets of them 
        // lower casing will not get applied on numbers 
        // System.out.println("GhanshamSalunkhe1712".toLowerCase());
        // OUTPUT : ghanshamsalunkhe1712

        // toUpperCase function which convert all letters in string to the uppercase alphabets and not affect numbers
        // System.out.println("GhanshamSalunkhe1712".toUpperCase());
        // Output: GHANSHAMSALUNKHE1712

        String z="  Welcome Back  ";
        // you can see that here above there are blank spaces are there so if you want to remove them 
        // we have to use one of the string function called trim() 

        // System.out.println(z.trim());
        // output : Welcome Back

        // substring function 
        // str.substring(startingPoint,EndingPoint)
        // where startingPoint is inclusive and the EndingPoint is exclusive 
        // System.out.println(s2.substring(2)); //this will print all elements after index 2 including that 2nd index element 
        // output : w.google.com
        // System.out.println(s2.substring(2,6)); //this will print element from 2 to 5 
        // output : w.go

        // now we will fetch the function of thestring called replace 
        String java="Java";
        // System.out.println(java.replace('a','o'));
        // output : Jovo

        // now we will see startwith and endwith function and thus how then we see for the is string start with provided string or not
        // both function will return there value as the boolean 

        // System.out.println("hello world".startsWith("hello"));
        // System.out.println("hello world".startsWith("helo"));
        // System.out.println("hello world".startsWith("h"));
        // System.out.println("hello world".endsWith("d"));
        // System.out.println("hello world".endsWith("ld"));
        // System.out.println("hello world".endsWith("world"));
        // you can give a character or whole stringas argument to these two function 
        // output : 
        // true
        // false
        // true
        // true
        // true
        // true

        // charAt() function 
        // here you provide index and you will get the character which is present at that index in that string 
        // System.out.println("hello world".charAt(4)); // output: o


        // both indexOf and lastIndexOf will provide index of perticualar character or pertivular string 
        // indexOf(character/string,start from) function 
        // it search from start point to end of string 
        // System.out.println(java.indexOf("va")); // output : 2 in this index of v is returned 
        // System.out.println(java.indexOf("vaa")); // -1 as vaa is not there in java 

        // System.out.println("abcdefghi".indexOf("i",6)); // 8 seacrh from starting point  to right side of string

        // this will search from end of string to start to string 
        // System.out.println("abcdefghi".lastIndexOf("a",6)); // 6 search from starting point  to left side of string

        // equals this will strictly check that is string are same or not 
        // this will print there result in boolean and it does not have any condition to have same refernce it will just check the
        // character one by one 
        // System.out.println("abcd".equals("abcd")); //true as characters are same 
        // System.out.println("abcd".equals("Abcd")); //false as case of characters are not same 

        // so you want to compare two strings but not want to use the case restrivtion you can use equalsIgnoreCase function in string 

        // System.out.println("abcd".equalsIgnoreCase("Abcd")); // true

        // now check the refernce and equals for two strings 

        // a string created inside the pool 
        // String s3="Ghansham Salunkhe";
        // // now we will create string with help of constructor 
        // String obj=new String("Ghansham Salunkhe");
        // System.out.println(s3.equalsIgnoreCase(obj)); //true

        // if(s3==obj)
        //     System.out.println("true");
        // else
        //     System.out.println("false");
        // // false

        //  a method to convert any datatype in string 
        int a=10120023;
        String c=String.valueOf(a);
        System.out.println(((Object)c).getClass().getSimpleName());
        System.out.println(c);
        String mm="hkbhdk";
        System.out.println(mm.charAt(4));
        // String
        // 10120023

    }       
}
