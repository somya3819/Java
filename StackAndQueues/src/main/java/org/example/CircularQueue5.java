package org.example;

public class CircularQueue5 {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    // Constructors
    public CircularQueue5(int size) {
        this.data = new int[size];
    }
    public CircularQueue5() {
        this(DEFAULT_SIZE);
    }

    // Check if full
    public boolean isFull() {
        return size == data.length;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Insert element
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end = (end + 1) % data.length;
        size++;
        return true;
    }

    // Remove element
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    // Peek front element
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    // Display queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int count = 0;
        int i = front;
        while (count < size) {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
            count++;
        }
        System.out.println("end");
    }
}


// Main class
class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue5 queue = new CircularQueue5(5);

        queue.insert(9);
        queue.insert(6);
        queue.insert(3);
        queue.insert(7);
        queue.insert(8);

        queue.displayQueue();                                                         // 9 6 3 7 8 end

        queue.remove();                                                               // Should remove 9
        queue.displayQueue();                                                         // 6 3 7 8 end

        System.out.println("Front element is: " + queue.peek());                      // Should print 6
    }
}