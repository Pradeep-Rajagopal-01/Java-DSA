package datastructures.queue.implimentation.linkedlistqueue;

public class Main {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(7);
        myQueue.enQueue(8);
        myQueue.enQueue(9);

        myQueue.deQueue();

        System.out.println("Length of the Queue is : " + myQueue.getLength());

        System.out.println("Printing all the items in the queue : ");
        myQueue.printQueue();
    }
}
