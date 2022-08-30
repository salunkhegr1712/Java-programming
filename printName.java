import java.util.Scanner;

public class printName {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        // declaring variable 
        int c;
        float f;
        String g,gg;


        c=input.nextInt();
        // if you provide float input to integer input it will not show any error 
            //  7.8
            // Exception in thread "main" java.util.InputMismatchException
            //         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
            //         at java.base/java.util.Scanner.next(Scanner.java:1594)
            //         at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
            //         at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            //         at printName.main(printName.java:13)
        f=input.nextFloat();


        g=input.next();
        // bkhfdb sdkbksdg
        // the input is : 
        // bkhfdb

        gg=input.nextLine();
        // bkhfdb sdkbksdg
        // the input is : 
        // bkhfdb sdkbksdg

        System.out.println("the input is : \n"+gg);

        // closing the input after we done with use of it 
        input.close();

    }
}
