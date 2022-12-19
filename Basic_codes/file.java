//in this code we are going to write the skelton of a java code

//importing basis functions and keywords from java and lang 

import java.lang.*;
import java.util.*;

//after importing then do crate a class such that it have same name that of this file 

public class file{

//all the function and thing declared will can be seen inside the function only and all kind of function are declared inside the java class itself 

	//main function with which we can do activity whatever we want
	public static void main(String args[]){
		
	//	simple code in java to print a hello world 
		
		Scanner input=new Scanner(System.in);

		// boolean a=input.hasNextInt();

		// System.out.println(((Object)a).getClass().getSimpleName());

		// int a=1;
		// this is how we do the typecasting in java
		char g='a';

		// in java the material inside the double quotes is strictly string 
		// and you can only write the character inside the single 	quotes

		char h='a';
		// double h=998.43;
		// System.out.println(a);

		char hh[]={'h','e','l','l'};
		// String aa="hello";
		String bb="hello";
		String gg=new String("hello");
		// if(aa==bb)
			// System.out.println(true);
		// if(aa==gg)
		// 	System.out.println(false);
	
		
		// if you are doing aa==bb this will check reference same if you check for the string matching use string function matches 

		// int f=11;
		// Integer ah=11;
		// if(f==ah)
		// 	System.out.println(false);
		// else 
		// 	System.out.println(true);

		// the function charAt is used to fetch character at perticular index inside the string 
		// wrong indexing will lead you to error 
		// System.out.println(bb.charAt(-1));


		// the function indexOf this will return index of substring or character from main string
		// if that string or value is not there inside the string then return -1 
		// System.out.println(bb.indexOf("gg"));

		// substring function is used to create a small string from big string 
		// System.out.println(bb.substring(0,4));
		
		// 2d array without using the constructor 

		int[][] ab={{1,2,3,45,6},{2,34,5},{3,4,63,53,2}};
		
		// such like that we can be able to create 2d array in java using constructor
		// int bc[][]=new int[5][5];
		// bc[0]=new int[5];
		// int z[]={2,3,4,5};
		// System.out.println("OG array is : ");
		// for (int x : z) {
		// 	System.out.print(x+" ");
		// }
		// int[] zz=new int[2*z.length];

		// for(int i=0;i<z.length;i++){

		// 	zz[i]=z[i];
		// }
		// z=zz;
		// System.out.println("\nDP array is : ");
		// for (int x : z) {
		// 	// System.out.print(x+" ");
		// }
		
		// lets see 3d array 
		int threeDArray[][][]=new int[3][2][4];

		// printing the 3d array using foreach loop
		// for (int x[][] : threeDArray) {
		// 	for (int y[] : x){
		// 		for (int zz : y){
		// 			System.out.print(zz+" ");
		// 		}
		// 		System.out.println();
		// 	}
		// 	System.out.println();
			
		// }
		// jagged array 

		int a[][]=new int[3][];
		a[0]=new int[5];
		a[1]=new int[2];
		a[2]=new int[4];

	}

	//to run the java code we have to first compile it with javac and then we have to run .class file with the keyword java
}
