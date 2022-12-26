// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

class parent{
    int aaaa=100;

    void printxyz(){
        System.out.println("dbhkkfds");
    }
}

class child extends parent{
    
    public void printchild(){
        System.out.println("value of aaaa is : "+super.aaaa);
        super.aaaa=1111;
        // super.printxyz();
    }
}
// the main class
public class superkeyword {

    // main function of our java code
    public static void main(String args[]){
        child a=new child();

        a.printchild();
        a.printchild();
        // value of aaaa is : 100
        

    }
}