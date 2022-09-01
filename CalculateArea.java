// if you want to use the java scanner to take user input so you have to import it first
import java.util.Scanner;

public class CalculateArea{

    public static void main(String Argv[]){

        // we will now calculate the area of the triangle wil study how it is working
        // we will use formula
        // area=(1/2)*b*h
        double b;
        double h;
        // we will take the input with scanner

        // Scanner input= new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        b=input.nextDouble();
        h=input.nextDouble();

        System.out.println("hello world and this piece of code is working");
        System.out.println("the value of height is : "+h);
        System.out.println("the value of base is : "+b);

        double area=0.5*b*h;
        System.out.println("the area of triangle is :"+area);

    }
};
