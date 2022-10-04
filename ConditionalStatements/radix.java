import java.lang.*;
import java.util.Scanner;

// so first of all we have to discuss that what is the redix so radix is a number system and we have to find 
// out in which redix a number is there 
// so we have to find out that is the number system of string and for that we are going to use the regular expressions 

// radix is number of unique bits in 
// 0-1 ==> numberSystem is binary and redix is 2
// 0-7 numberSystem is Octal and radix is 8
// 0-F numberSystem is hexadecimal and radix is 16

public class radix {
    public static void main(String args[]){
        String z;
        Scanner input =new Scanner(System.in);


        // wew are just taking only one word so we are going to use next only 
        z=input.next();

        // following is the code in which have to find out the redix of the number which you are going to work with 

        if(z.matches("[01]+")){
            System.out.println("the redix is 2 and number system is Binary");
        }

        else if(z.matches("[0-7]+")){
            System.out.println("the redix is 8 and number system is Octal");
        }

        else if(z.matches("[^A-Za-z]+")){
            System.out.println("the redix is 10 and number system is Decimal");
        }

        else if(z.matches("[0-9A-Fa-f]+")){
            System.out.println("the redix is 16 and number system is HexaDecimal");
        }
        
        else{
            System.out.println("error 404");
        }
    }
}