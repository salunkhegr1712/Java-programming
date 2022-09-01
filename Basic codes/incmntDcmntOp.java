import java.util.*;
import java.lang.*;
import java.net.SocketPermission;

public class incmntDcmntOp {
    // we can perform the increment and decrement operations on any other datatype than the boolean 
    public static void main(String argv[]){

        // lets see post increment examples
        int a=10;char g='a';float f=90.75f;double d=43.3323;byte z=22;short s=13;
        // System.out.println(a++);
        // System.out.println(g++);
        // System.out.println(f++);
        // System.out.println(d++);
        // System.out.println(z++);
        // System.out.println(s++);
        // as you can see post-increment operations are perform action and then increment that kind of the operations 
        // output :
        // 10
        // a
        // 90.0
        // 43.3323
        // 22
        // 13
    
        // now see pre increment
        // System.out.println(++a);
        // System.out.println(++g);
        // System.out.println(++f);
        // System.out.println(++d);
        // System.out.println(++z);
        // System.out.println(++s);
        // see all are changed at once  as we used the pre increment which runs like first increment and then
        //  perform the operation on them 
        // o/p 
        // 11
        // b
        // 91.0
        // 44.3323
        // 23
        // 14

        // lets see post decrement 
        // System.out.println(a--);
        // System.out.println(g--);
        // System.out.println(f--);
        // System.out.println(d--);
        // System.out.println(z--);
        // System.out.println(s--);


        // o/p 
        // 10
        // a
        // 90.0
        // 43.3323
        // 22
        // 13
        // System.out.println(--a);
        // System.out.println(--g);
        // System.out.println(--f);
        // System.out.println(--d);
        // System.out.println(--z);
        // System.out.println(--s);
        // o/p 
        // 9
        // `
        // 89.0
        // 42.3323
        // 21
        // 12

        // modulo operation on the java datatype 

        // System.out.println('a'%10);
        //7
        System.out.println(a%10);
        System.out.println(g%10);
        System.out.println(f%10);
        System.out.println(d%10);
        System.out.println(z%10);
        System.out.println(s%10);
        // you also can perform
        // 0
        // 7
        // 0.75
        // 3.3322999999999965
        // 2
        // 3

    }
    
}
