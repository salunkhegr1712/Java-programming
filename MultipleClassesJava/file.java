// as we are doing out job in main directory of project then we will get error like wrong package 
// so if youre workin under the subfolder you have to use 
// package folderName

// the access specifier should be there to point only one class
// every function cant be start with access specifier 
// file is main class here
public class file {
    public static void main(String[] args) {
        System.out.println("Hello world from Ghansham Rajaram salunkhe");
    }
};

// // declaring another class but it is not the main class among classes 
// class ghansham{
//     void ptt(){
//         System.out.println("Hello world from ghansham");
//     }
        
    
// }

// // declaring another class but it is not the main class among classes 
// class grs{
//     void ptt(){
//         System.out.println("Hello world from GRS");
//     }
    

// }

// it is not a good idea to do this we will do comeback on it when we are more familiar with java 
// untill then just chill chill just chill

// it will lead so much error and conflicts 

// here file is main class so we added the access specifier called public before it 
// grs and ghansham are another two classes lets see how it is going to compile and how it is going to work 

                                                                                                                                                                 
// ┌──(ghansham㉿terminal)-[~/Java-programming/MultipleClassesJava]
// └─$ javac file.java            
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
                                                                                                                                                                 
// ┌──(ghansham㉿terminal)-[~/Java-programming/MultipleClassesJava]
// └─$ java file            
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
// Error: Could not find or load main class file
// Caused by: java.lang.NoClassDefFoundError: MultipleClassesJava/file (wrong name: file)
                                                                                                                                                                 
// ┌──(ghansham㉿terminal)-[~/Java-programming/MultipleClassesJava]
// └─$ javac file.java
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
                                                                                                                                                                 
// ┌──(ghansham㉿terminal)-[~/Java-programming/MultipleClassesJava]
// └─$ java file      
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
// Error: Could not find or load main class file
// Caused by: java.lang.NoClassDefFoundError: MultipleClassesJava/file (wrong name: file)
                                                                                                                                                                 
// ┌──(ghansham㉿terminal)-[~/Java-programming/MultipleClassesJava]
// └─$ javajava ghansham  
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
// Error: Could not find or load main class ghansham
// Caused by: java.lang.NoClassDefFoundError: MultipleClassesJava/ghansham (wrong name: ghansham)
                                                                                                                                                                 
// ┌──(ghansham㉿terminal)-[~/Java-programming/MultipleClassesJava]
// └─$ java ghansham
// Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
// Error: Could not find or load main class ghansham
// Caused by: java.lang.NoClassDefFoundError: MultipleClassesJava/ghansham (wrong name: ghansham)