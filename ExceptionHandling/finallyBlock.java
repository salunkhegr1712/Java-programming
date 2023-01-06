// the finally block will exccute even Exception is there or not 
import java.lang.Exception;
public class finallyBlock 
{

    static void meth1()throws Exception
    {
        // if you want to run some code after throw you can use try finally block

        try
        {
            
        throw new Exception();
        }
        finally
        {
           //this message willdefinitly execute 
        System.out.println("Final Message");
        }
        
    }
    
    public static void main(String[] args){ 
        try{
            // meth1();
            int a=100;
        }
        catch(Exception z){
            System.out.println(z);
        }
        finally{
            System.out.println("bye");
            //bye
        }
        // java.lang.Exception
        // bye
    }   
}
