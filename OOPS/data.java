// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// here we are going to declare class for the student class
class Student{
    public int roll_number;
    // in class you can use both primitive datatype and also predefined class like String
    public String name;
    public int m1,m2,m3;
    public String branch;

    // function which will return the information of a student 
    public String studenInfo(){
        String a="Name : "+name+"\n Roll number : "+roll_number+"\n Branch : "+branch;
        return a;
    }

    // this function will return the total of mark by student
    public int totalMarks(){
        return m1+m2+m3;
    }
    // function which will return average of mark of a student 
    public int averageMarks(){
        return (m1+m2+m3)/3;
    }

    // function which give relative pointer to student 
    public int CGPA(){
        int a=averageMarks();
        
        if(a>90)
            return 10;
        else if(a>80)
            return 9;
        else if(a>70)
            return 8;
        else if(a>60)
            return 7;
        else if(a>50)
            return 6;
        else if(a>40)
            return 5;
        else if(a>=35)        
            return 4;
        else
            return 0;
    }

}
// the main class
public class data{

    // main function of our java code
    public static void main(String args[]){
        Student s=new Student();

        s.name="Ghansham Rajaram Salunkhe";
        s.roll_number=111903033;
        s.branch="Computer Engineering";
        s.m1=89;
        s.m2=83;
        s.m3=91;

        System.out.println(" Student Information : \n "+s.studenInfo());
        System.out.println(" Total Marks : "+s.totalMarks()+" / 300 ");
        System.out.println(" Average Marks : "+s.averageMarks());
        System.out.println(" Grade : "+s.CGPA());
    }
}