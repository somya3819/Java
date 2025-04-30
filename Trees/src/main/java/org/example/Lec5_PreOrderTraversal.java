package org.example;

public class Lec5_PreOrderTraversal {
    void Preorder(Node2 node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        Preorder(node.left);
        Preorder(node.right);
    }
    public static void main(String[] args) {
        Node2 node=new Node2(1);
        node.left=new Node2(2);
        node.right=new Node2(3);

        Lec5_PreOrderTraversal tree= new Lec5_PreOrderTraversal();
        tree.Preorder(node);
    }
}
class Node2 {
    int data;
    Node2 left;
    Node2 right;

    public Node2(int key){
        data=key;
    }
}