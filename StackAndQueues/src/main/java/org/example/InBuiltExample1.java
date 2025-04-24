package org.example;

import java.util.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class InBuiltExample1 {


        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(98);
            stack.push(12);
            stack.push(56);

            System.out.println(stack.pop()); // on printing, you'll notice that the sequence instead of 98,12,56 will be 56,12,98
            System.out.println(stack.pop());
            System.out.println(stack.pop());

            //if we try to print the element from the empty place i.e another sout(stack.pop());
            //System.out.println(stack.pop());
            //we'll get "EmptyStackException" exception

            //stack is a class . queue ia an interface.




            //--------------------------------//
            //Queue
            Queue<Integer> queue=new LinkedList<>(); //queue is treated as linkedlist
            queue.add(67);
            queue.add(12);
            queue.add(76);

            System.out.println();

            System.out.println(queue.peek());//do not remove/delete the elements but does displays them
            System.out.println(queue.peek());//if u look at the result you'll realise that it only displays 3 all three times that's cuz peek returns only the head of the queue
            System.out.println(queue.peek());

            System.out.println(queue.remove());//removes elements in the right sequence and displays them
            System.out.println(queue.remove());
            System.out.println(queue.remove());




            //-------------------------------//
            //Deque
            //comes under ArrayDeque
            System.out.println();
            Deque<Integer> deque=new ArrayDeque<>();
            deque.add(78);
            deque.addLast(67);
            deque.addFirst(90);

            System.out.println(deque.pop());
            System.out.println(deque.pop());
            System.out.println(deque.pop());

            deque.removeFirst();
        }
    }