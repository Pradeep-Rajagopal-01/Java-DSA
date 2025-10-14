package datastructures.stack.implimentation.arrayliststack;

public class Main {


    //DSA Question-Reverse String ( ** Interview Question)
    public static String reverseString(String string) {

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
    public static boolean isBalancedParentheses(String string) {

        Stack<Character> characterStack = new Stack<>();
        for (Character c : string.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                characterStack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (characterStack.isEmpty()) return false;
                char checker = characterStack.pop();
                if ((checker == '[' && c == ']') || (checker == '{' && c == '}') || (checker == '(' && c == ')')) {
                    // matched pair, continue
                } else {
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push(7);
//        stack.push(8);
//        stack.push(9);
//        stack.push(10);

//        System.out.println(stack.getStackList());

        stack.pop();

//        System.out.println("Reversed String : " + reverseString("Prad")); //DSA Question-Reverse String ( ** Interview Question)

//        System.out.println(isBalancedParentheses("[()"));//DSA Question-Parentheses Balanced ( ** Interview Question)

        System.out.println("Size of the stack is : " + stack.size());

        System.out.println("Printing all the items from the stack : ");
        stack.printStack();

    }

}
