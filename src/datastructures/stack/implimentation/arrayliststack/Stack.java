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

        Stack<Character> charStack = new Stack<>();

        for (char c : string.toCharArray()) {
            charStack.push(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!charStack.isEmpty()) {
            stringBuilder.append(charStack.pop());
        }

        return stringBuilder.toString();
    }

    //DSA Question-Parentheses Balanced ( ** Interview Question)
    public boolean isBalancedParentheses(String string){

        Stack<Character> characterStack = new Stack<>();
        for (Character c : string.toCharArray()){
            if (c=='[' || c=='{' || c=='('){
                characterStack.push(c);
            } else if (c==']' || c=='}' || c==')') {
                if (characterStack.isEmpty()) return false;
                char checker=characterStack.pop();
                if ((checker=='[' && c==']') || (checker=='{' && c=='}') || (checker=='(' && c==')')){
                    // matched pair, continue
                }else {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }

}
