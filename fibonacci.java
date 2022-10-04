import java.lang.*;

// following code will print the fibonacci series for the number of value you give using loop 
public class fibonacci {
    public static void main(String args[]){
        int n=10;
        System.out.println("the fibonacci series is : ");
        int k=0;int l=1,g;
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.println(k);
            }
            else {
                g=k;
                k=k+l;
                l=g;
                System.out.println(k);

            }

        }
    }
}