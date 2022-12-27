// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// in this code we are going to see the use of this keyword 
class  This{
    int a; 
    int b;

    public This(int a,int b){
        this.a=a;
        this.b=b;
    }

    public void func(int a,int b){
        this.a=a;
        this.b=b;
    }
}

// the main class
public class thisKeyword {

    // main function of our java code
    public static void main(String args[]){
        This a=new This(10,16);
        System.out.println(a.a);
        System.out.println(a.b);
        //10
        //16
    }   
}