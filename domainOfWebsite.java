import java.lang.*;
import java.util.*;

public class domainOfWebsite {
    public static void main(String args[]){
        

        String s;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the website : ");
        s=input.next();

        if(s.startsWith("https")){
            System.out.println("Protocol of website is : Secure http");
        }
        else if(s.startsWith("http")){
            System.out.println("Protocol of website is : http");
        }
        else if(s.startsWith("file")){
            
            System.out.println("Protocol of website is : file");
        }

        if(s.endsWith(".com")){
            System.out.println("Type of website is : Commercial");
        }
        else if(s.endsWith(".net")){
            System.out.println("Type of website is : Network");
        }

        else if(s.endsWith(".org")){
            System.out.println("Type of website is : Organisation");
        }
        else if(s.endsWith(".gov")){
            System.out.println("Type of website is : Goverment");
        }
    }
}