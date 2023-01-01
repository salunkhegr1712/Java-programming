// importing basic functionalities from the java library
import java.lang.*;


// now we will write the code for static inner class
class Outer{

    static public int a=10;
    int z=101;

    // also along with that we can add large number of functions inside the static inner class 
    static class Inner{
        
        public int  m=10;

        // now declare a function inside the inner class to see what 
        // values we can access and which we cant access 
        public void hero(){

            // so inside the static inner class you are unable to access non static datamembers from outer class 
            a=11;
            // z=100;error : non-static variable z cannot be referenced from a static context

            System.out.println("static class innner ");
        }
        public void method1(){
            System.out.println("method1 from static class innner ");
        }
        public void method2(){
            System.out.println("method2 from static class innner ");
        }
        public void method3(){
            System.out.println("method3 from static class innner ");
        }
        
    }
}

// the main class
public class staticInnerClass {

    // main function of our java code
    public static void main(String args[]){

        // now lets try to access static inner class 
        Outer.Inner k=new Outer.Inner(); 
        k.hero();

        
    }
    
}