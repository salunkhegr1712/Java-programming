// this is a application of the atm where single ATM object will get used by multiple 
// multiple thread and each thread has name 

// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// Customer will be multithreading class as there can be multiple thread should be there which are related to the 
// Customer class
class Customer extends Thread{

    int balance;
    ATM atm;
    // also we need a constructor which can take name and initial balance 
    
    public Customer(ATM a,String name,int initialBalance){
        
        this.setName(name);
        this.balance=initialBalance;
        atm=a;

    }

    // now we are going to write run function where we can see balance and decide how much we have to withdraw or deposit 

    @Override
    public void run(){
        synchronized(this){
            atm.checkBalance(this);
            atm.withdraw(this,1000);
        }
        
        // int m=0,money=0;
        
        // Scanner input= new Scanner(System.in);
        // do{

        //     System.out.println("\n1) Check Balance \n2) Withdraw \n3) Deposit \n4) Exit");
        //     System.out.print("what you want to do : ");
        //     m=input.nextInt();
            
        //     switch(m){
        //         case 1:
        //             atm.checkBalance(this);
        //             break;

        //         case 2:
        //             System.out.print("enter amount to Withdraw : ");
        //             money=input.nextInt();
        //             atm.withdraw(this,money);
        //             break;
        //         case 3:
        //             System.out.print("enter amount to Deposit: ");
        //             money=input.nextInt();
        //             atm.deposit(this,money);
        //             break;
                
        //         case 4:
        //             break;
        //     }
            
        // }while(m!=4);
        // input.close();
        
        
    }
}

// the main class
public class ATM {

    // now first declare function 
    synchronized public void checkBalance(Customer c){

        System.out.println("\nhello "+c.getName());
        System.out.println("Your balance is : "+c.balance+"$");

    }

    // another atm function like withdraw and deposit 
    synchronized public void withdraw(Customer c,int amount){

        if(amount >0 && amount <c.balance){
            c.balance=c.balance-amount;
            System.out.println("");
            System.out.println(c.getName()+" withdrawed "+amount+"$ \nremaining balance is : "+c.balance+"$");
        }
    }
    synchronized public void deposit(Customer c,int amount){

        if(amount >0){
            System.out.println("");
            c.balance=c.balance+amount;
            System.out.println(c.getName()+" deposited "+amount+"$ \ncurrent balance is : "+c.balance+"$");
        }
    }
    // main function of our java code
    public static void main(String args[]){

        ATM atm =new ATM();
        Customer m= new Customer(atm,"ghansham",2000);
        Customer n= new Customer(atm,"anway",2000);
        m.start();
        n.start();

    }
}