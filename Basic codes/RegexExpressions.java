import java.lang.*;
import java.util.*;

public class RegexExpressions{
    public static void main(String args[]){
        // System.out.println("hello world");
        String a="jf&((B^*P)&)_^";

    // following code is used for deleting special character from your String  
        a=a.replaceAll("[^a-zA-Z0-9]","");
        // [a-zA-Z0-9] => Any alphanumeric character 
        // [^a-zA-Z0-9] =? any character but not from alphanumeric one 
        System.out.println(a);

        String aa[]={"aa","aa"};
        // code to remove spaces from character
        String c=a.replaceAll(" ","");
        // System.out.println(c);
        // length keyword 
        System.out.println(aa.length); //2



    }
}