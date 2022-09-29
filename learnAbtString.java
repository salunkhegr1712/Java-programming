// importing basic libraries from the java 
import java.lang.*;
import java.util.*;

// declaring basic class
public class learnAbtString {

    public static void main(String args[]){
        // cheking that the main function is working or not 
        // pool is only created for storing the string literal which are 
        // when you create a object in the java with use of literal so it will be get created inside the pool memory 
        // if you create the string or any object with literal 
        // the string creaated by using direct literal 

        // here String is an class which is predefined inside the java 
    
        String str1="hello";
        String str2="hello";

        // as we can see the value of the both str1 and str2 is same so two different blocks of memory will not
        //  get created in memory so only one literal i created and two variables will point at them 

        System.out.println(str1);
        System.out.println(str2);
        // hello
        // hello


        // now check that is there address is same or not 
        if(str1==str2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        // now see heap and pool obj is they have same or not 
        String z=new String("hello");
        if(z==str2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        // no 
        // if you keyword called new while creating new data at that time only  we are able to create a object which is created in heap memory 
        // so lets create a object woth constructor and learn different ways to initialise strings in java 
        String str=new String("hello");
        // System.out.println(str);
        // now str str will reference a string and the string value will be present inside the heap 
        // create a string with array of characters 
        char c[]={'A','B','C','D'};
        String cc=new String(c);
        // System.out.println(cc);// ABCD
        
        //  as we know that we use the character by fetching there ascii code so we are also able to create a
        // string with the help of byte literal 
        // range of  byte => -128 to 127 
        // ascii range => 0 to 127
        byte arr[]={65,66,67,68} ;// "ABCD" 
        String ar=new String(arr);
    

        System.out.println(ar);
        //ABCD
        // IF WE WANT SPECIFIC FROM THE BYTE ARRAY AND THE character ARRAY  
        String ccc=new String(c,2,2);// CD
        // it will get ccc="CD" (c is character array,2=> starting index,2=>length of buffer )
        String c1=new String(arr,2,2); //CD
        // it will get ccc="CD" (arr is byte array,2=> starting index,2=>length of buffer )
        // System.out.println(ccc +" "+c1);
            // CD CD

    }
}

// java memory statck
// ++++++++++++++++++++++ ++
// |                       |
// |          Heap         |
// |    ++++++++++++++     |
// |    |            |     |
// |    |            |     |
// |    |   pool     |     |
// |    |   memory   |     |
// |    |            |     |
// |    |            |     |
// |    ++++++++++++++     |
// |                       |
// |                       |
// ++++++++++++++++++++++ ++