import java.lang.*;

public class matrixOperations {
    public static void main(String args[]){
        int sum[][]=new int[3][3];

        // declaring two arrays 
        int b[][]={{4,5,6},{6,5,4},{4,6,5}};
        int a[][]={{1,2,3},{3,2,1},{1,2,3}};

        //problem 1: using loops, do matrix addition 

        // System.out.println("sum of arrays are : ");
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         sum[i][j]=a[i][j]+b[i][j];
        //     }

        //     for(int k=0;k<sum[0].length;k++){
        //         System.out.format(" %02d ",sum[i][k]);
        //     }
        //     System.out.println();
        // }


        // problem 2: using loop to find out the substraction of 2 matrix
        // int sub[][]=new int[3][3];

        // System.out.println("substraction of arrays are : ");
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         sub[i][j]=a[i][j]-b[i][j];
        //     }

        //     for(int k=0;k<sub[0].length;k++){
        //         System.out.format(" %02d ",sub[i][k]);
        //     }
        //     System.out.println();
        // }


        // problem 3 : find matrix multiplication 

        // code to perform matrix multiplication 
        int mul[][]=new int[3][3];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<a.length;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        // code to print output 
        System.out.println("multiplication of matrix is : ");
        for(int i=0;i<mul.length;i++){
            for(int j=0;j<mul[i].length;j++){
                System.out.print(" "+mul[i][j] +" ");
            }
            System.out.println();
        }

        
    }

}