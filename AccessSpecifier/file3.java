// we will test different package subclass
package grs;

// importing basic functionalities from the java library
import ghansham.file1;

// the main class
public class file3 extends file1{

    file3 z=new file3();
    int m= z.a+z.b+z.c+z.d;

    // file3.java:18: error: a is not public in file1; cannot be accessed from outside package
    // int m= z.a+z.b+z.c+z.d;
            
    // file3.java:18: error: b has private access in file1
        // int m= z.a+z.b+z.c+z.d;

    // 2 errors
    
}