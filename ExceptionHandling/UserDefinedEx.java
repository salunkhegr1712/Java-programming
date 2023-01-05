// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// lets create a class which extends Class Exception
class GhanshamException extends Exception{

    // now lets override function inside predefined exception class
    public String getMessage(){
        return "getMessage function from GhanshamException";
    }

    public String toString(){
        return "toString function from GhanshamException";
    }

    public void printStackTrace(){
        System.out.println("printStackTrace function from GhanshamException");
    }

    // so now we are ready with our new type of exception and it is class
}

// the main class
public class UserDefinedEx {

    // main function of our java code
    public static void main(String args[]){

        GhanshamException z= new GhanshamException();
        System.out.println(z.getMessage());
        System.out.println(z);
        z.printStackTrace();
        // getMessage function from GhanshamException
        // toString function from GhanshamException
        // printStackTree function from GhanshamException
    }
}