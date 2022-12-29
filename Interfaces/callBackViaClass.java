// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// in this code we have two class one is customer and shop  
// shop will have list of its premium members eith all info in array of members
// the customer will members by providing its information 
// customer class will take name of customer and it has a interface and has function callBack
// if shop want to store provide information of sell so he will callBack to shop 

// declare interface

// declare customer class
class Customer1{
    // lets it has info name 
    public String name;
    // create a constructor which has data member name
    public Customer1(String cust_name){
        this.name=cust_name;
    }
    // this will be called when shop try to connect to customer
    public void callBack(){
        System.out.println("yes i got info");
    }
}

// now we will declare class for Shop

class Shop1 {
    // you cant able to create object for interface but you can create array for interface just like class
    Customer1 a[]=new Customer1[10];
    int Count=0;
    // a function to add new member
    public void addMember(Customer1 i){
        a[Count]=i;
        Count++;
    }

    // a function to inform customer about offer 
    public void informCustomer(){
        for(int i=0;i<Count;i++){
            System.out.print(a[i].name+" : ");
            a[i].callBack();
        }
    }
}
// the main class
public class callBackViaClass {

    // main function of our java code
    public static void main(String args[]){

        Shop1 m=new Shop1();

        // create new Customer object
        Customer1 a=new Customer1("ghansham");
        Customer1 b=new Customer1("aditi");
        Customer1 c=new Customer1("banty");
        Customer1 d=new Customer1("anway");

        // now add Customers in member of shop 
        m.addMember(a);
        m.addMember(b);
        m.addMember(c);
        m.addMember(d);

        // now we have to inform customer about sell 
        m.informCustomer();
        // output :
        // yes i got info
        // yes i got info
        // yes i got info
        // yes i got info
    }   
}