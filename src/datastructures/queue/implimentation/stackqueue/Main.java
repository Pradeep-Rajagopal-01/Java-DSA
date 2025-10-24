package datastructures.queue.implimentation.stackqueue;

public class Main {

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();


        stackQueue.enqueue(7); //DSA Question-Queue Using Stacks: Enqueue
        stackQueue.enqueue(8);
        stackQueue.enqueue(9);

        stackQueue.dequeue();//DSA Question-Queue Using Stacks: Dequeue

        stackQueue.printStack();


    }

}
