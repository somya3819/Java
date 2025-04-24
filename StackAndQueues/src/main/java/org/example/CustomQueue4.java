package org.example;


//---------------------help class-----------------//
public class CustomQueue4 {
    private int[] data;
    private static final int DEFAULT_SIZE=10;


    //waise toh queue k case mein we can use 2 ptrs because front se remove hota hai and last se insert hota hai , but keeping in mind the interviews we are going to use only 1 ptr
    int end=0;
    int front=0;


    //Constructors
    public CustomQueue4(int size){
        this.data=new int[size];
    }
    public CustomQueue4(){    //when no argument is passed
        this(DEFAULT_SIZE);
    }




    //customized methods for
    public boolean isFull(){
        return end==data.length-1;
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean insert(int item){                 //complexity of adding the elements will be O(1) cuz 1 element last mein add ho rha hai bs
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{                            //but complexity of removing the element will be o(n) cuz sare elements 1-1 krke left mein shift ho rhe hai
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];

        //directly return kr denge element jo remove krna hoga but usse pehle we'll shift the elements to the left as well , which is very imp
        //shift the elements to left
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void display(){
        for(int i=0 ; i<end;i++){
            System.out.print(data[i]+" ");
        }
    }
}






//-----------------main class--------------------//
class QueueMain{
    public static void main(String[] args) throws Exception{
        CustomQueue4 queue = new CustomQueue4(5);
        queue.insert(9);
        queue.insert(6);
        queue.insert(3);
        queue.insert(7);

        queue.display();
        System.out.println();

        queue.remove();
        queue.insert(89);
        queue.display();
    }
}