import java.lang.*;
import java.util.Scanner;

// here in this code we are going to write code so that we are able to create pattern with the nested loop
public class nestedLoops{
    public static void main(String args[]){

        // System.out.println("hello world");
        // creating a Scanner so that we can able to take input from the user 
        int m=0;
        Scanner input=new Scanner(System.in);

        // pattern 1

        //  | 2 |  | 3 |  | 4 |  | 5 |  | 6  | 
        //  | 3 |  | 4 |  | 5 |  | 6 |  | 7  | 
        //  | 4 |  | 5 |  | 6 |  | 7 |  | 8  | 
        //  | 5 |  | 6 |  | 7 |  | 8 |  | 9  | 
        //  | 6 |  | 7 |  | 8 |  | 9 |  | 10 | 
    

        // System.out.println("++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){
        //     // System.out.println("_");
            
        //     for (int j=1;j<=5;j++){
        //         System.out.print( " | "+(i+j)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("++++++++++++++++++++++++++++++++++");

        // pattern 2

        //  | 00 |  | 01 |  | 02 |  | 03 |  | 04 | 
        //  | 05 |  | 06 |  | 07 |  | 08 |  | 09 | 
        //  | 10 |  | 11 |  | 12 |  | 13 |  | 14 | 
        //  | 15 |  | 16 |  | 17 |  | 18 |  | 19 | 
        //  | 20 |  | 21 |  | 22 |  | 23 |  | 24 | 

        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // for(int i=1;i<=5;i++){

        //     // System.out.println("_");
            
        //     for (int j=1;j<=5;j++){
        //         System.out.format(" | %02d | ",m++);
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // pattern 3

        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5

        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // for(int i=1;i<=5;i++){

        //     // System.out.println("_");
            
        //     for (int j=1;j<=5;j++){
        //         System.out.format(" | %d | ",j);
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
            
        // pattern 4 pyramid 

        //  | 1 | 
        //  | 1 |  | 2 | 
        //  | 1 |  | 2 |  | 3 | 
        //  | 1 |  | 2 |  | 3 |  | 4 | 
        //  | 1 |  | 2 |  | 3 |  | 4 |  | 5 | 

        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=i;j++){
        //         System.out.format(" | %d | ",j);
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // pattern 5 


        //  | 01 | 
        //  | 02 |  | 03 | 
        //  | 04 |  | 05 |  | 06 | 
        //  | 07 |  | 08 |  | 09 |  | 10 | 
        //  | 11 |  | 12 |  | 13 |  | 14 |  | 15 | 

        
        // m=1;
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=i;j++){
        //         System.out.format(" | %02d | ",m++);
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // pattern 6 
        
        //  * 
        //  *  * 
        //  *  *  * 
        //  *  *  *  * 
        //  *  *  *  *  * 

        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=i;j++){
        //         System.out.format(" * ");
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // pattern 7


        //  *  *  *  *  * 
        //  *  *  *  * 
        //  *  *  * 
        //  *  * 
        //  * 

        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=5-i+1;j++){
        //         System.out.format(" * ");
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");


        // pattern 8

        //  01  02  03  04  05 
        //  06  07  08  09 
        //  10  11  12 
        //  13  14 
        //  15 

        // m=1;
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=5-i+1;j++){
        //         System.out.format(" %02d ",m++);
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // pattern 9


        //  *  *  *  *  * 
        //     *  *  *  * 
        //        *  *  * 
        //           *  * 
        //              * 
        
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=5;j++){
        //         if(j<i)
        //             System.out.format("   ");
        //         else
        //             System.out.format(" * ");
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        // pattern 10 


        //  -  -  -  -  - 
        //  *  -  -  -  - 
        //  *  *  -  -  - 
        //  *  *  *  -  - 
        //  *  *  *  *  - 

        // System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // for(int i=1;i<=5;i++){

        //     for (int j=1;j<=5;j++){
        //         if(j<i)
        //             System.out.format(" - ");
        //         else
        //             System.out.format(" * ");
        //         // System.out.print( " | "+(m++)+ " | ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("+++++++++++++++++++++++++++++++++++++++");

        // pattern 11

        // -  -  -  -  * 
        // -  -  -  *  * 
        // -  -  *  *  * 
        // -  *  *  *  * 
        // *  *  *  *  * 

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        for(int i=1;i<=5;i++){

            for (int j=1;j<=5;j++){
                if(j<5-i+1)
                    System.out.format(" - ");
                else
                    System.out.format(" * ");
                // System.out.print( " | "+(m++)+ " | ");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++");

    }
}