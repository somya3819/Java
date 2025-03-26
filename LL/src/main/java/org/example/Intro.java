package org.example;
import java.util.*;
class Node{
    int data ;
    Node next;
    Node prev;

    Node(int data , Node next , Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class Intro{
    public static Node convertToDLL(int[] arr){
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1 ; i<arr.length ;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            newNode.prev=temp;
            temp=newNode;
        }
        return head;
    }
    public static void printListForward(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printListBack(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 9, 52, 47, 4, 5};
        Node head =convertToDLL(arr);
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }

        printListForward(head);
        printListBack(tail);
    }
}
