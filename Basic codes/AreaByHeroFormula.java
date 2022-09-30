import java.util.*;
// import java

public class AreaByHeroFormula{

    public static void main(String argv[]){
        System.out.println("Enter the sides of triangle");
        try (//
        Scanner input = new Scanner(System.in)) {
            // we are going to use the formula
            // area =(s*(s-a)*(s-b)*(s-c))**0.5
            // we cant use ** as the power inside the java  so we have to use the maths inside the java source code file
            double a=input.nextDouble();
            double b=input.nextDouble();
            double c=input.nextDouble();

            double s=(Double)(a+b+c)/2;
            // System.out.println("the inputed value is : "+ a);
            // as math is already included inside the starting file
            // just type Math.sqrt(number)
            // m=Math.pow(number,raiseTO)

            float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("a : "+a+"\nb : "+b+"\nc : "+c+"\nArea : "+area);
            // System.out.println("%.4f",area);
        }

    }
}
