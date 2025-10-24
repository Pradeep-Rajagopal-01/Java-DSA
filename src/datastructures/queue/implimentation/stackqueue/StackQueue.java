package datastructures.queue.implimentation.stackqueue;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackQueue(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public void printStack() {
        for (int i = stack1.size()-1; i >= 0; i--) {
            System.out.println(stack1.get(i));
        }
    }

    //DSA Question-Queue Using Stacks: Enqueue ( ** Interview Question)
    public void enqueue(int value){

        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(value);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    //DSA Question-Queue Using Stacks: Dequeue ( ** Interview Question)
    public Integer dequeue(){

        if (stack1.isEmpty()){
            return null;
        }else {
            return stack1.pop();
        }

    }

}
