import java.util.Scanner;

public class printName {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String g,gg;


        input.nextInt();
        input.nextFloat();


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
