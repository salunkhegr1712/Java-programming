import java.lang.*;


public class passObjects {
    static void println(String a){
        System.out.println(a);
    }

    static void print(String a){
        System.out.print(a);
    }

    static void arrayUpdate(int a[]){
        a[0]=90;

    } 
    // String are immutable if you want to change them you just have reassign the String 
    static void StringChange(String a){
        a="ghansham";

    }

    static void changeVal(int a){
        a=15;
    }
    public static void main(String args[]){
        int z[]={8,26,1,174,1,56,41,56};
        // System.out.println(z[0]);
        arrayUpdate(z);
        // System.out.println(z[0]);

        // String a="Grs";
        // System.out.println(a);
        // StringChange(a);
        // System.out.println(a);

        // String b=new String("Grs");
        // System.out.println(b);
        // StringChange(b);
        // System.out.println(b);

        // creating some integers with the help of the primitive characters
        int aa=10;
        // creating some integers using the classes
        // Integer m=new Integer(10);
        print(""+aa);
        changeVal(aa);
        print("\n"+aa);

        
        // as you can see string are immutable so when you pass the string as the parameter and it will not
        // affect any of the data inside the string
    }

}