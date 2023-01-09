// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// first function class to create a Node 
class Node{

    // a linked list is block and it contains a data and a reference to the next Node 

    public int data;
    public Node next;

    // here we first going to write the a constructor for initalise
    public Node(int data){
        this.data=data;
        // at initalisation Node dont have any kind of point to reference
        this.next=null;
    }

}

// now we are going to write the function for the linked list 

// the main class
public class LinkedListDataStructure {

    // three function for in insertion inside the linked list 
    // a function to add the elements at the last of the linked list 
    static void insertAtLast(Node head,int d){
        Node m=head;
        while(m.next!=null){
            m=m.next;
        }
        Node p=new Node(d);
        m.next=p;
        System.out.println("added Node : "+p.data);
    }

    // a function to add the elements at head
    static Node insertAtTop(Node head,int val){
        // we will use returntype function only when we are doing anything with head node 
        Node n=new Node(val);
        n.next=head;
        head=n;
        return head;
    }

    // now im going to write a function which is able to add new node a perticular index 
    static void insertAtIndex(Node head,int index,int val){

        int z=0;

        Node h=head;
        while(z!=index){
            h=head;
            // System.out.println("");
            head=head.next;
            z++;
        }
        Node p=new Node(val);
        h.next=p;
        p.next=head;
    }
    // now we are going to write the function
    static void deleteLastNode(Node head){
        
        while(head.next.next!=null){
            head=head.next;
        }
        Node p=head.next;
        p=null;
        head.next=null;
    }

    // a function to delete head
    static Node deleteHead(Node head){
        Node m=head;
        head=head.next;
        // free up old head 
        m=null;
        return head;
    }
    // function to delete at index 
    static void deleteAtIndex(Node head,int index){
        int z=0;
        Node prev=head;
        while(z!=index){
            prev=head;
            head=head.next;
            z++;
        }   
        prev.next=head.next;
        head=null;
    }
    // a basic function which can be used to print the linked list 
    static void display(Node head){

        Node m=head;
        System.out.println("\nlinked list : ");

        while(m!=null){
            System.out.print(m.data+" ");
            m=m.next;  
        }
        System.out.println();
    }

    static int countNodes(Node head){
        int z=0;
        while(head!=null){
            head=head.next;
            z++;
        }
        return z;
    }
    // main function of our java code
    public static void main(String args[]){
        
        Node head= new Node(11);
        head=insertAtTop(head,10);
        head=insertAtTop(head,9);
        head=insertAtTop(head,7);
        head=insertAtTop(head,6);
        head=insertAtTop(head,5);
        insertAtIndex(head,3,8);
        display(head);

        // deleting tail 
        // deleteLastNode(head);
        // deleteLastNode(head);
        // deleteLastNode(head);

        // deleting head
        // head=deleteHead(head);
        // head=deleteHead(head);
        // head=deleteHead(head);
        // deleteAtIndex(head,2);
        insertAtIndex(head,2,7);
        display(head);
        // System.out.println("count of nodes : "+countNodes(head));
    }   
}