// as we are doing out job in main directory of project then we will get error like wrong package 
// so if youre workin under the subfolder you have to use 
// package folderName


// the access specifier should be there to point only one class
// every function cant be start with access specifier 
// file is main class here
public class file {
    public static void main(String[] args) {
        // the string args are the extra command line arguments which you can pass after  writing java className x y z a b 
    // x y z a b all are arguments which are stored inside the args array 
    // lets try it here 
        // System.out.println("Hello world from Ghansham Rajaram salunkhe");

        // if you not pass the command line arguments and if you not pass it and still try to access then it will 
        // throw a error  like below 
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 at file.main(file.java:18)

        System.out.println(args[0]);
        System.out.println(args[1]);

        // you have to pass the arguments after the java className args[0] args[1] args[2] ...... 
        // $ javac file.java
        // $ java file ghansham Salunkhe

        //  ghansham
        //  Salunkhe
                    
    }
};   
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
// Hello world from Ghansham Rajaram salunkhe