import java.lang.*;
import java.util.*;

// following code will give word representation of numbers 

public class numberInWords {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number : ");
        int z=input.nextInt();
        int g=z;
        int m;
        String s="";
    

        while(z!=0){
            m=z%10;
            z=z/10;
            switch(m){
                case(0):
                    s="zero "+ s;
                    break;
                case(1):
                    s="one "+ s;
                    break;
                case(2):
                    s="two "+ s;
                    break;
                case(3):
                    s="three "+ s;
                    break;
                case(4):
                    s="four "+ s;
                    break;
                case(5):
                    s="five "+ s;
                    break;
                case(6):
                    s="six "+ s;
                    break;
                case(7):
                    s="seven "+ s;
                    break;
                case(8):
                    s="eight "+ s;
                    break;
                case(9):
                    s="nine "+ s;
                    break;
            }
        }
        // printing the final output of the code 
        System.out.println("number in words : "+ s);
    }
}