import java.lang.*;
import java.util.*;

public class weekdays {
    public static void main(String args[]){

        System.out.print("Enter the day : ");
        Scanner input=new Scanner(System.in);
        int z=input.nextInt();

        if(z==1){
            System.out.println("Day is Monday");
        }
        else if(z==2){
            System.out.println("Day is Tuesday");
        }
        else if(z==3){
            System.out.println("Day is Wednesday");
        }
        else if(z==4){
            System.out.println("Day is Thursday");
        }
        else if(z==5){
            System.out.println("Day is Friday");
        }
        else if(z==6){
            System.out.println("Day is Saturday");
        }
        else if(z==7){
            System.out.println("Day is Sunday");
        }
        else{
            System.out.println("Wrong entry");
        }
    }
}