import java.lang.*;
import java.util.*;

public class cuboid{
    public static void main(String argv[]){
        float length,breadth,height;
        Scanner input=new Scanner(System.in);
        System.out.println("enter length breadth and height respectively");
        length=input.nextFloat();
        breadth=input.nextFloat();
        height=input.nextFloat();
        float volume,paint;
        paint=length*breadth+2*length*height+2*height*breadth;
        volume=length*breadth*height;

        System.out.println("length : "+length+" m"+"\nbreadth : "+breadth+" m"+"\nheight : "+" m"+height );
        System.out.println("volume : "+volume+" m^3");
        System.out.println("paint required : "+paint+" m^2");
    }
}

// enter length breadth and height respectively
// 10
// 8
// 7
// length : 10.0 m
// breadth : 8.0 m
// height :  m7.0
// volume : 560.0 m^3
// paint required : 332.0 m^2
