/**
 * Class for implementing a Queue Data Structure.
 *
 * @author: Finbarr Shiels (116765721)
 * */

import java.util.*;

public class Queue {
    // Initial variables for queue implementation
    int[] arr;
    int front;
    int rear;
    int cap;
    int n1;


    /**
     * Construct a @Queue@ instance with the given variables.
     *
     *  @param n The max size of the queue.
     *
     */
    Queue(int n){
        arr = new int[n];
        cap = n;
        front = 0;
        rear = -1;
    }
    /**
     * Method to return size of queue.
     * @return n1 length of queue
     */
    public int size() {
        return n1;
    }
    /**
     * Method to return Boolean for empty.
     * @return Length of queue equals zero.
     */
    public Boolean isEmpty() {
        return (size() == 0);
    }
    /**
     * Method to remove head of queue or throw error if empty
     */
    public void remove() {
        front = (front + 1) % cap;
        n1--;
    }
    /**
     * Method to remove head of queue or Null if empty.
     */
    public void poll() {
        if (isEmpty()) {
            return;
        }
        System.out.println("Deleting: " + arr[front]);
        front = (front + 1) % cap;
        n1--;
    }
    /**
     * Method to add element to queue. Unless cap is reached, then error thrown.
     * @param val The element to add.
     */
    public void add(int val) {
        if (n1 >= cap){
            throw new IllegalStateException();
        }
        rear = (rear + 1) % cap;
        arr[rear] = val;
        n1++;
    }
    /**
     * Method to return the element at the head of the queue or null if empty.
     * @return Element at head or null.
     */
    public Object peek(){
        if (isEmpty()){
            return null;
        }
        return arr[front];
    }
    /**
     * Method to return the element at the head of the queue or throw error.
     * @return Element at head or error.
     */
    public int element(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        return arr[front];
    }

    public static void main (String[] args)
    {
        Queue tits = new Queue(5);

        tits.add(20);
        tits.add(50);
        tits.add(17);
        tits.add(99);
        tits.add(44);
        System.out.println((tits.peek()));
        System.out.println((tits.element()));
        tits.poll();
        System.out.println((tits.peek()));

    }
}
