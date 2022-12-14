// in this code i will write down the code for the inner class

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// now lets declare a nested Class
// this is a inner class
class Outer{
    private int a=10;
    public int z=11;

    // lets declare some function 
    public void func1(){
        System.out.println("public func1 from Outer class");
    }
    private void func2(){
        System.out.println("private func2 from Outer class");
    }
    // this is a inner class 
    class Inner {

        private int m=10;
        public int x=111;
        

        public void function1(){
            // inner class able to access the private members also from outer class
            func1();
            func2();

            a=11;
            z=1111;
        }
        // invalid method declaration; return type required
    }

    // you also can able to create object of inner class and in body of outer class
    Inner ai=new Inner();
    // this function is used in order to access the inner class
    public void accessInnerClass(){
        
        // if you want to create inner class so you have to create a object for it 
        Inner zz=new Inner();
        zz.function1();
        System.out.println("value of m is : "+zz.m);
        System.out.println("value of m is : "+zz.x);
    }
    
}

// the main class
public class nestedClass {

    // main function of our java code
    public static void main(String args[]){
        // Outer s=new Outer();
        // s.accessInnerClass();

        // output:
        // public func1 from Outer class
        // private func2 from Outer class
        // value of m is : 10
        // value of m is : 111

        // now we try to create object for inner class
        Outer.Inner  aa= new Outer().new Inner();
        // this you have search each time 
        aa.function1();

        // output:
        // public func1 from Outer class
        // private func2 from Outer class
    }
}

