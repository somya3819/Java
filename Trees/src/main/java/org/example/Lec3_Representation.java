package org.example;
class Node{
    int data;
    Node2 left;
    Node2 right;

    public Node(int key){
        data=key;
    }
}
public class Lec3_Representation {
    public static void main(String[] args) {
        Node2 node=new Node2(1);
        node.left=new Node2(2);
        node.right=new Node2(3);
        node.right.left=new Node2(4);
    }
}
