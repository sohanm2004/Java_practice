class Node{
    int data;
    Node left;
    Node right;
    
        
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    
    }
}

public class BinaryTree{
    
    Node root;
    
    public int FindHeight(Node node){
        if(node==null){
            return -1; // height of a empty tree 
        }
        
         int leftheight = FindHeight(node.left);
         int rightheight = FindHeight(node.right);
         
         return Math.max(leftheight,rightheight)+1;
         
    }

    
    public static void main(String[] args){
         BinaryTree tree = new BinaryTree();
         tree.root = new Node(1);
         tree.root.left = new Node(2);
         tree.root.right = new Node(3);
         tree.root.left.left = new Node(4);
         tree.root.right.right = new Node(5);
         tree.root.left.right = new Node(6);
         
         
         System.out.println("Height of a tree :" + tree.FindHeight(tree.root));
    }
}