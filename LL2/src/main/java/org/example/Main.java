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

    public void insertAtEnd(int data){
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

    public void insertAtPos(int pos, int data){
        if(pos<=1){
            insertAtBeginning(data);
            return;
        }
        Node temp=head;
        for(int i=1 ; i<pos-1 && temp!=null; i++ ){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            insertAtEnd(data);
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
        if(head==null || pos<=1){
            DeleteFromBegin();
            return;
        }
        Node temp=head;
        for(int i=1 ; i<pos && temp!=null ;i++){
            temp=temp.next;
        }
        if(temp==null) return;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
    }

    //print forward
    public void printForward(){
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //print backward
    public void PrintBackward(){
        if (head == null) return;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    }

public class Main{
    public static void main(String[] args) {
Operations dll=new Operations();
dll.insertAtBeginning(5);
dll.insertAtEnd(4);
dll.insertAtPos(3,16);

dll.printForward();
dll.PrintBackward();

dll.DeleteFromBegin();
dll.DeleteFromEnd();
dll.DeleteFromPos(2);

dll.printForward();
dll.PrintBackward();

    }
}