// importing basic functionalities from the java library
import java.lang.*;
import java.util.*;

// inside this code i will write the code for the binary tree 
class TreeNode{
    
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    // now write constructor for the binaryTree TreeNode

    public TreeNode(int val){

        this.data=val;
        leftChild=null;
        rightChild=null;
    }
}

// the main class
public class binaryTreeDataStructure{

    // now we are going to write the function for the binary tree for binary tree we are not going to write any kind of function 
    // we are just going to write the traversal functions 

    // a) inorderTraversal
    static void inOrderTraversal(TreeNode n){
        if(n==null){
            return;
        }
        inOrderTraversal(n.leftChild);
        System.out.print(n.data+" ");
        inOrderTraversal(n.rightChild);
    }

    // b) preorderTraversal 
    static void preOrderTraversal (TreeNode n){
        if(n==null){
            return;
        }
        System.out.print(n.data+" ");
        preOrderTraversal(n.leftChild);
        
        preOrderTraversal(n.rightChild);
    }

    static void postOrderTraversal(TreeNode l){
        if(l==null){
            return;
        }
        postOrderTraversal(l.leftChild);
        postOrderTraversal(l.rightChild);
        System.out.print(l.data+" ");
    }
    // postOrderTraversal
    // main function of our java code
    public static void main(String args[]){

        TreeNode root= new TreeNode(11);
        TreeNode x= new TreeNode(10);
        TreeNode y= new TreeNode(12);
        root.leftChild=x;
        root.rightChild=y;
        System.out.println("tree is : \n");
        postOrderTraversal(root);
        System.out.println("");

    }
}

