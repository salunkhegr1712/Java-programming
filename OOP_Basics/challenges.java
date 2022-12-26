// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

class Cylinder{
    
    // property of cylinder and we are using data hiding
    private double radius;
    private double height;

    // writing get and set methods
    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double h){
        height=h;    
    }
    
    public void setRadius(double r){
        radius=r;
    }

    public void setDimensions(double h,double r){
        radius=r;height=h;
    }

    // now write some constructor to set property

    // a non parametric constructor
    public Cylinder(){
        height=10;
        radius=7;
    }

    public Cylinder(double r,double h){
        height=h;
        radius=r;
    }

}

// class for the Product
class Product{
    
    private String itemNO; // only readable
    private String name; // only readable
    private double price; //read and writable
    private int quantity; // read and writable

    // we have to see which are read and writable or readable or writable

    // writing get function 
    public String getProductItemNO(){
        return itemNO;
    }

    public String getProductName(){
        return name;
    }
    
    public double getProductPrice(){
        return price;
    }

    public int getProductQuantity(){
        return quantity;
    }

    public void setProductPrice(int p){
        price=p;
    }

    public void setProductQuantity(int q){
        quantity=q;
    }

    // so the readable property must have constructor to fetch initial values 
    public Product(){
        itemNO="xyz";
        name="abcd";
        quantity=0;
        price=0;
    }
    
    public Product(String i,String n){
        name=n;itemNO=i;
    }
}

// class for Customer
class Customer{

    private String customerId; // only readable
    private String name; // only readable
    private String address; // only readable and writable
    private int phoneNumber; // only readable and writable

    // declaring get and set function 
    public String getCustomerid(){
        return customerId;
    }
    
    public String getCustomerName(){
        return name;
    }
    public String getCustomerAddress(){
        return address;
    }
    public int getCustomerPhoneNumber(){
        return phoneNumber;
    }

    // set function
    public void setCustomerAddress(String a){
        address=a;
    }
    public void setCustomerPhoneNumber(int p){
        phoneNumber=p;
    }
    
    // now declaring the constructor 
    public Customer(){
        customerId="xyz";
        name="a b c";
        address="blah blah blah ";
        phoneNumber=123456;
    }

    public Customer(String c, String n){
        name=n;customerId=c;
    }
}   


// the main class
public class challenges{

    // main function of our java code
    public static void main(String args[]){

    }
}