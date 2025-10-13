package datastructures.stack.implimentation.arrayliststack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//        stack.push(10);

//        System.out.println(stack.getStackList());

        stack.pop();

        System.out.println("Reversed String : " + stack.reverseString("Prad"));


        System.out.println("Size of the stack is : " + stack.size());

        System.out.println("Printing all the items from the stack : ");
        stack.printStack();


    }




}
