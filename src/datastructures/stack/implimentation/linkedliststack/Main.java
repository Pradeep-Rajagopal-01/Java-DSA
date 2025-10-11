package datastructures.stack.implimentation.linkedliststack;

public class Main {

    public static void main(String[] args) {

        MyStack myStack = new MyStack(7);
        myStack.push(2);
        myStack.push(4);

        myStack.pop();



        System.out.println("Height of the stack is : " + myStack.getHeight());

        System.out.println("Printing all the items in the stack : ");
        myStack.printStack();
    }
}
