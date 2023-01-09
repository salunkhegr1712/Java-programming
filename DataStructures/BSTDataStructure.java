// importing basic functionalities from the java library
import java.lang.*;

// lets declare a class for node of a binary search tree 
class BSTnode{
    
    public int data;
    public BSTnode leftChild;
    public BSTnode rightChild;

    // now write the constructor
    public BSTnode(int val){
        this.data=val;
        this.leftChild=null;
        this.rightChild=null;
    }
}
// the main class
public class BSTDataStructure{

    // a) inorderTraversal
    static void inOrderTraversal(BSTnode n){
        if(n==null){
            return;
        }
        inOrderTraversal(n.leftChild);
        System.out.print(n.data+" ");
        inOrderTraversal(n.rightChild);
    }

    // b) preorderTraversal 
    static void preOrderTraversal (BSTnode n){
        if(n==null){
            return;
        }
        System.out.print(n.data+" ");
        preOrderTraversal(n.leftChild);
        
        preOrderTraversal(n.rightChild);
    }

    static void postOrderTraversal(BSTnode l){
        if(l==null){
            return;
        }
        postOrderTraversal(l.leftChild);
        postOrderTraversal(l.rightChild);
        System.out.print(l.data+" ");
    }

    // now function to add node inside a tree 
    // this is simple iterative insertion method 
    static void insertion(BSTnode root,int val){
        BSTnode l=root;

        while(root!=null){
            l=root;
            if(root.data==val){
                return;
            }
            else if(val> root.data){
                root=root.rightChild;
                // System.out.println("right");
            }
            else{
                root=root.leftChild;
                // System.out.println("left");
            }
        }
        BSTnode m= new BSTnode(val);
        if(l.data>val){
            l.leftChild=m;
            // System.out.println(val+" insetion done ");
            return;
        }
        l.rightChild=m;
        // System.out.println(val+" insetion done ");

    }

    static void searchInBST(BSTnode root,int val){

        while(root!=null){
            
            if(root.data==val){
                System.out.println("value "+val+ " found !!");
                return;
            }
            else if(val> root.data){

                root=root.rightChild;
                // System.out.println("right");
            }
            else{

                root=root.leftChild;
                // System.out.println("left");
            }
        }
        System.out.println("value "+val+"not found");
    }

    // main function of our java code
    public static void main(String args[]){

        BSTnode root=new BSTnode(45);
        insertion(root,15);
        insertion(root,25);
        insertion(root,5);
        insertion(root,35);
        insertion(root,55);
        insertion(root,50);

        // System.out.println("preorder is : ");
        // preOrderTraversal(root);
        // System.out.println("\ninorder is : ");
        // inOrderTraversal(root);
        // System.out.println("\npostorder is : ");
        // postOrderTraversal(root);
        searchInBST(root,50);
    }
}
