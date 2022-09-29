// import the basic libraries which we ar going to use 
import java.lang.*;
import java.util.*;

// declaring main class 
public class regexQuantisation {
    // declaring basic main class where we can write main piece of our code 
    public static void main(String args[]){
        // we are going to write a piece of code for checking that is inserted email is valid or not
        // we are also going to print the type of email is of

        // .com => Commercial
        // .org => Organisation
        // .net => Network 
        // .co => Corporation

        String email="salunkhegr19.comp@coep.ac.in";

        boolean a=email.matches("[\\w.]*@[a-z.]*");
        // boolean c=email.matches(".*.com");
        // "\\w*@[a-z.]*" this means before @ any alphanumeric character may be there 
            // then after @ [] a to z and . may be available and and last we will check for suffix in next piece of code 
        // System.out.println(c);

        // so from the website we will give the domain of website 
        

        // this following code will provide info of domain of the email 
        if(email.matches(".*.com") && a){
            System.out.println("Commercial Email");
        }
        else if(email.matches(".*.net") && a){
            System.out.println("Network Email");
        }
        else if(email.matches(".*.co")  && a){
            System.out.println("Corporation Email");
        }
        else if(email.matches(".*.org")  && a){
            System.out.println("Network Email");
        }
        else if(email.matches(".*.in")  && a){
            System.out.println("Indian Email");
        }
        else if(a){
            System.out.println("Email exist but unknown");
        }
        else{
            System.out.println("Invalid email");
        }
        
        
        // lets see is email corrosponds to gmail or not 
        email="salunkhegr1712@gmail.com";
        boolean c=email.matches("[\\w.]*@gmail[a-z.]*");
        if (c)
            System.out.println(email+ " is a gmail Email");
        else
            System.out.println(email+ " is not a gmail Email");
        // if c==true email corrosponds to gmail
    }   
}