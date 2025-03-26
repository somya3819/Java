package org.example;

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

class Operations{
    Node head;

    //insertion
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }

    public void insertAtEnd(){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
    }

    public void InsertAtPos(int pos, int data){
        if(pos<=1){
            insertAtBeginning(data);
            return;
        }
        Node temp=head;
        for(int i=1 ; i<pos-1 && temp!=null; i++ ){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            insertAtEnd();
            return;
        }
        Node newNode=new Node(data);
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
    }

    //deletion
    public void DeleteFromBegin(){
        if(head==null) return;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
    }
    public void DeleteFromEnd(){
        if(head==null) return;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
    }
    public void DeleteFromPos(int pos){


    }

    //print forward
    public void printForward(){

    }

    //print backward
    public void PrintBackward(){

    }
}
public class Main{
    public static void main(String[] args) {

    }
}