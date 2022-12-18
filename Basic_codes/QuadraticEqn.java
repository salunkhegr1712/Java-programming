import java.lang.*;
import java.util.*;

public class QuadraticEqn{
    public static void main(String argv[]){
        float a,b,c;
        Scanner input=new Scanner(System.in);

        // take three values as the input and apply the shridharacharya's formula on them
        // and then after that you will get the roots for that equations

        float s1,root1,root2;

        System.out.println("print the values of a b and c respectievely");
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        s1=(float)Math.pow(b,2)-4*a*c;
        root1= (s1-b)/(2*a);
        root2=((s1+b)/(2*a))*-1;

        System.out.println("roots are : \n"+root1+"\n"+root2);

    }
}
