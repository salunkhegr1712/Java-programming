// we will test same class subclass
package ghansham;

// importing basic functionalities from the java library
import ghansham.file1;

// the main class
public class file4 extends file1{

    file4 z=new file4();
    int m= z.a+z.b+z.c+z.d;

    // file4.java:11: error: b has private access in file1
    // int m= z.a+z.b+z.c+z.d;
    // 1 error
    
}