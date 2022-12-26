// in this code i will solve the problem on the inheritance of java

// importing basic functionalities from the java library
import java.lang.*;

// we are going to create a banking system and it depends on the system
class Account{

    // properties 
    protected int accountNo; // read only
    protected String holderName; // read and write
    protected String address; // read 
    protected int phoneNo; // read and write
    protected double balance; // read and write

    // now we are going to define the methods which we are going to use further 
    // writing get and set functions and then use 
    public int getAccountNo(){
        return accountNo;
    }
    public String getHoldername(){
        return holderName;
    }
    public String getAddress(){
        return address;
    }
    public int getPhoneNo(){
        return phoneNo;
    }
    public double getBalance(){
        return balance;
    }
    
    public void setAddress(String a){
        address=a;
    }
    public void setPhoneNo(int p){
        phoneNo=p;
    }
    public void setBalance(double amount){
        balance=amount;
    }
    
    // so now we are ready with base code now we will write the constructor code 

    // this will act like default constructor 

    public Account(){
        holderName="a b c";
        accountNo=12345;
        balance=0.0;
        address="xyz";
        phoneNo=1234567890;
    }

    // we should declare read only properties on initilisation
    public Account(int an, String addr,String name,int p){
        accountNo=an;
        address=addr;
        holderName=name;
        balance=0;
        phoneNo=p;
    }
    // so we are done with code for accountNo and now we will going to write the 
    // code for the saving account and the loan account with inheritance
}

class SavingAccount extends Account{

    public double fixedDepositAmount;

    public double getFixedDepositAmount(){
        return fixedDepositAmount;
    }
    // function to deposit the money 
    public void deposit(int amount){
        if (amount>0)
            balance=balance+amount;
    }

    // function to deposit withdraw money
    public void withdraw(int money){
        if(money<balance && money>0)
            balance=balance-money;
    }

    // function to create fixed deposit from account 

    public void createFixedDeposit(int money){
        if (money>0)
        fixedDepositAmount=fixedDepositAmount+money;
    }
    // so we have properties already inherited now we will write the methods
}

class LoanAccount extends Account{
    // property to store emi value
    public double EMIAmount;
    
    // function to pay emi 
    public void payEMI(){
        balance=balance-EMIAmount;
    }

    // function to repay whole loan 
    public void repayLoan(double amount){
        if(balance==amount)
            balance=0; 
    }

    // function to get more money over loan account 
    public void topUpLoan(double money){
        if(money>0){
            balance+=money;
        }
    }

    // function to get the emi acount 
    public double getEmiAmount(){
        return EMIAmount;
    }
}   
// the main class
public class challenge {

    // main function of our java code
    public static void main(String args[]){

        SavingAccount a= new SavingAccount();
        LoanAccount g=new LoanAccount();

        System.out.println(a.accountNo);
        System.out.println(g.accountNo);

        System.out.println(a.holderName);
        System.out.println(g.holderName);
    }
}