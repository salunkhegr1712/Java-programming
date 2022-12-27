// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// in this code im going to explain the use of super keyword

class A{
    int x;
    
    public A(int a){
        x=a;
    }
}

class B extends A{
    int x;

    public B(int a, int b){

        // first pass value to the parent class
        super(a);
        x=b;
    }
    public void function(){
        System.out.println(x);
        System.out.println(super.x);

    }
}
// the main class
public class superKeyword {

    // main function of our java code
    public static void main(String args[]){
        B aa=new B(10,20);
        aa.function();
        //
    }
}