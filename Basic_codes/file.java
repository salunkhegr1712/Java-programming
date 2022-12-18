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

		boolean a=input.hasNextInt();

		System.out.println(((Object)a).getClass().getSimpleName());

	}

	//to run the java code we have to first compile it with javac and then we have to run .class file with the keyword java
}
