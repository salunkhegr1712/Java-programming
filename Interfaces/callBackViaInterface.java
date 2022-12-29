// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// in this code we have two class one is customer and shop  
// shop will have list of its premium members eith all info in array of members
// the customer will members by providing its information 
// customer class will take name of customer and it has a interface and has function callBack
// if shop want to store provide information of sell so he will callBack to shop 

// declare interface
interface member{
    void callBack();
}

// declare customer class
class Customer implements member{
    // lets it has info name 
    String name;
    // create a constructor which has data member name
    public Customer(String cust_name){
        this.name=cust_name;
    }
    // this will be called when shop try to connect to customer
    public void callBack(){
        System.out.println("yes i got info");
    }
}

// now we will declare class for Shop

class Shop {
    // you cant able to create object for interface but you can create array for interface just like class
    member a[]=new member[10];
    int Count=0;
    // a function to add new member
    public void addMember(member i){
        a[Count]=i;
        Count++;
    }

    // a function to inform customer about offer 
    public void informCustomer(){
        for(int i=0;i<Count;i++){
            System.out.print("Customer "+ (i+1)+" : ");
            a[i].callBack();
        }
    }
}
// the main class
public class callBackViaInterface {

    // main function of our java code
    public static void main(String args[]){

        Shop m=new Shop();

        // create new Customer object
        member a=new Customer("ghansham");
        member b=new Customer("aditi");
        member c=new Customer("banty");
        member d=new Customer("anway");

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



