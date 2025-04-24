package org.example;

public class CustomStack2 {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    public CustomStack2(){
        this(DEFAULT_SIZE);
    }
    public CustomStack2(int size){
        this.data=new int[size];
    }

    int ptr=-1;
    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("cannot pop from an emty stack!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    //we can create are own custom exception here as well  , for eg:
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }



    //------------------------//
    public static void main(String[] args)throws Exception{
        CustomStack2 stack=new CustomStack2(5);
        stack.push(78);

        System.out.println(stack.pop());
        //System.out.println(stack.pop());// if we run this , it'll throw exception
    }
}
class StackException extends Exception{
    public StackException(String message){
        super(message);
    }
}