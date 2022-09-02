public class formatter {
    public static void main(String args[]) {
        // the type of format done in java is given below as the theory part 
        // %[argument_index$][flags][width][.precision][conversion/access_Specifier]
        // % is startin point of format data 
        // argument_index$ = 1$,2$,3$,..... it is basically index of arguments which are passed 
        // flags=> '',0,+,-,(
        // lets see working of each

        // // flag=+ width=5
        // System.out.printf("%1$+5d\n",-10);
        // System.out.printf("%1$+5d\n",10);

        // // flag = - width=5 
        // System.out.printf("%1$-5d\n",-10);
        // System.out.printf("%1$-5d\n",10);

        // // flag = ( width=5 
        // System.out.printf("%1$(5d\n",-10);
        // System.out.printf("%1$(5d\n",10);

        // // flag = '' width=5 
        // System.out.printf("%1$5d\n",-10);
        // System.out.printf("%1$5d\n",10);
        // width space should be reservered while printing the value

        //   -10
        //     +10
        //     -10  
        //     10   
        //     (10)
        //     10
        //     -10
        //     10

        // so we left with last and that is precision and it is came to play for the float number or values
        // flags will work same for float as they work for int 
        float f=123.4545f;
        // System.out.printf("%6f\n",f);
        // // width=> 6 conversion => float 
        // System.out.printf("%6.2f\n",f);
        // System.out.printf("%6.4f\n",f);
        // 123.454498
        // 123.45
        // 123.4545 and such how we can use the format in the printf 
        // width=> 6 precision=>3 conversion=>f;

        // both system.out.printf() and system.out.format works same  
        System.out.format("%6f\n",f);
        // width=> 6 conversion => float 
        System.out.format("%6.2f\n",f);
        System.out.format("%6.4f\n",f);
        // same output 
        // 123.454498
        // 123.45
        // 123.4545
    }
}
