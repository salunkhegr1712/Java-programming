public class operators {

    public static void main(String argv[]){

        int in=100;
        short s=50;
        byte by=10;
        char ch='a';
        double dou=10.98;
        float fl=72;

        // if you add two datatypes having size m and n such that m > n so output data has datatype of size m
        // in java you are able to perform operation between two different datatype
        // so output of the datatype which has more size
        // this process is done automatically with the help of the system of yoi want to make changes in the type of output which you get then
        // you can use type casting
        // System.out.println("int + short : " +(in+s));
        // System.out.println("int + byte : "+(in+by));
        // System.out.println("int + float : "+(in+fl));
        // System.out.println("double + float : "+(fl+dou));
        // System.out.println("byte + float : "+(fl+by));
        // System.out.println("char + int : "+(in+ch));
        // System.out.println("double + int : "+(in+dou));
        // System.out.println("char + double: "+(dou+ch));
        // System.out.println("float + char : "+(fl+ch));
        // lets use the object and see that what is the type of the returned values after performing intra datatype functions
        // System.out.println(((Object)(in+s)).getClass().getSimpleName());
        // System.out.println(((Object)(in+fl)).getClass().getSimpleName());
        // // here in every time typecasting is done on each datatype so that we can get appropiate result
        // System.out.println(((Object)(in+dou)).getClass().getSimpleName());
        // System.out.println(((Object)(in+ch)).getClass().getSimpleName());
        // System.out.println(((Object)(dou+fl)).getClass().getSimpleName());
        // System.out.println(((Object)(by+s)).getClass().getSimpleName());
        // System.out.println(((Object)(dou+ch)).getClass().getSimpleName());
        // // output
        // Integer
        // Float
        // Double
        // Integer
        // Double
        // Integer
        // Double

        // lets try to use the typecasting and see how can we bend the rules in our term

        // (datatypeWhichYouWantToTypeCast)Value it is basic syntax for type cast

        char c=(char)(10+87);
        System.out.println(c);
        // output
        // a
        int i=(int)(67.90+100.9773); //168 which is an integer
        System.out.println(i);

        // such how you can use the operators and bend the output if you want according to which type do you want to the result
        // with the use of the type casting
    }
}
