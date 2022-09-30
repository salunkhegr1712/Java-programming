public class sizeOfDataTypes {
    // for each of the primitive datatype we have own class defined to it 

    public static void main(String[] args) {
        // int a;
        // Integer it is class created in java for primitive datatype of integer  
    
        System.out.println("maximum possible value of integer is "+Integer.MAX_VALUE);
        System.out.println("minimum possible value of integer is "+Integer.MIN_VALUE);
        System.out.println("size of integer is "+Integer.BYTES);
        // Output
        // maximum possible value of integer is 2147483647
        // minimum possible value of integer is -2147483648
        // size of integer is 4

        // for float 
        System.out.println("maximum possible value of float is "+Float.MAX_VALUE);
        System.out.println("minimum possible value of float is "+Float.MIN_VALUE);
        System.out.println("size of float is "+Float.BYTES);
        // Output
        // maximum possible value of float is 3.4028235E38
        // minimum possible value of float is 1.4E-45
        // size of float is 4

        // for Double
        System.out.println("maximum possible value of Double is "+Double.MAX_VALUE);
        System.out.println("minimum possible value of Double is "+Double.MIN_VALUE);
        System.out.println("size of Double is "+Double.BYTES);
        // Output
        // maximum possible value of Double is 1.7976931348623157E308
        // minimum possible value of Double is 4.9E-324
        // size of Double is 8

        // for Char
        System.out.println("maximum possible value of Character is "+Character.MAX_VALUE);
        System.out.println("minimum possible value of Character is "+Character.MIN_VALUE);
        System.out.println("size of Character is "+Character.BYTES);
        // Output
        // maximum possible value of Character is ?
        // minimum possible value of Character is 
        // size of Character is 2

        // for Bytes
        System.out.println("maximum possible value of Byte is "+Byte.MAX_VALUE);
        System.out.println("minimum possible value of Byte is "+Byte.MIN_VALUE);
        System.out.println("size of Byte is "+Byte.BYTES);
        // Output
        // maximum possible value of Byte is 127
        // minimum possible value of Byte is -128
        // size of Byte is 1
                             
    }
}
