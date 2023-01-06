// importing basic functionalities from the java library
import java.lang.*;

// the main class
public class exceptionPropagation{
    
    // lets create some function 
    static void meth1(){
        System.out.println("function from meth1");
    
        // lets try to handle Exception inside the meth1 
        // try{
        //     double z=meth2(10,0);
        //     System.out.println("solution from meth2 is : "+z);
        // }
        // catch(Exception z){
        //     System.out.println(z);
        // }
        
        double z=meth2(10,0);
        System.out.println("solution from meth2 is : "+z);
        
    }
    
    static double meth2(int a,int b){
        System.out.println("function from meth2");
        // try{
        //     double c=a/b;
        //     return c;
        // }
        // catch(Exception m){
        // System.out.println(m);
        // }
        
        // if any problem arises then return -1 
        // return -1;
        double c=a/b;
        return c;
    }
    // main function of our java code
    public static void main(String args[]){
        try{
            meth1();
        }
        catch(Exception x){
            System.out.println(x);
        }
       
        System.out.println("controll is back at main()");
        // function call occuring is :
        // main()==> meth1()==>meth2 ()

        // a) we are not going handle Exception at any level

        // output :
        // function from meth1
        // function from meth2
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
            // at exceptionPropagation.meth2(exceptionPropagation.java:17)
            // at exceptionPropagation.meth1(exceptionPropagation.java:11)
            // at exceptionPropagation.main(exceptionPropagation.java:24)

        // so see propagation of Exception :
        // line 17 : meth2() --> line 11 : meth1() --> line 24 main()
        // so we can handle Exception in meth2 else it will propates to meth1() and then to main
        // if we dont handle it in that function it will throw error 

        // so now we are going

        // b) lets try to handle Exception in meth2()

        // function from meth1
        // function from meth2
        // java.lang.ArithmeticException: / by zero
        // solution from meth2 is : -1.0
        // controll is back at main()

        // c) lets try to handle Exception inside the meth1()
        // function from meth1
        // function from meth2
        // java.lang.ArithmeticException: / by zero
        // controll is back at main()

        //d) handle Exception at main()
        // function from meth1
        // function from meth2
        // java.lang.ArithmeticException: / by zero
        // controll is back at main()

        // SO WITH Exception handling we can easily able to manage 
        // this also proves that Exception propagation takes place in reverse order that of method propagation
    }
}