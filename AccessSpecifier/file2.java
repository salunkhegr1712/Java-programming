// in this code we are going to test :
// same package non subclass

package ghansham;

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// the main class
public class file2 {

    file1 z= new file1();
    int m=z.a+z.b+z.c+z.d;
    // file2.java:14: error: <identifier> expected
    // file2.java:14: error: b has private access in file1
    // int m=z.a+z.b+z.c+z.d;
            //    ^
    // 1 error

}