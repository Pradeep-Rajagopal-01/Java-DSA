package datastructures.stack.implimentation.arrayliststack;
import java.util.ArrayList;

//Stack follows LIFO.
//This is a Stack implementation using ArrayList. It is the recommended approach.
public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size()-1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    //DSA Question-Push for a Stack That Uses an ArrayList ( ** Interview Question)
    public void push(T value){
        stackList.add(value);
    }

    //DSA Question-Pop for a Stack That Uses an ArrayList ( ** Interview Question)
    public T pop(){
        if (isEmpty()) return null;
        return stackList.remove(size()-1);
    }

    //DSA Question-Reverse String ( ** Interview Question)
    public String reverseString(String string) {

        Stack<Character> stack = new Stack<>();
        String reversedString = "";

        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        return reversedString;
    }

}
