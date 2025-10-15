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

    //DSA Question-Sort Stack ( ** Interview Question)
    public static void sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        int length= stack.size();
        for (int i = 0; i <length ; i++) {
            Integer temp = stack.pop();
            if (tempStack.isEmpty()) {
                //temp = stack.pop();
//                System.out.println(stack.pop());
                tempStack.push(temp);
            } else if (temp>tempStack.peek()) {
                tempStack.push(temp);
            } else if (temp<tempStack.peek()) {
                stack.push(tempStack.pop());
                tempStack.push(temp);
            }
//            }else {
//                tempStack.push(temp);
//            }

        }
        stack.printStack();
    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        System.out.println(stack.getStackList());

//        stack.pop();

//        System.out.println("Reversed String : " + reverseString("Prad")); //DSA Question-Reverse String ( ** Interview Question)

//        System.out.println(isBalancedParentheses("[()"));//DSA Question-Parentheses Balanced ( ** Interview Question)

        sortStack(stack);

//        System.out.println("Size of the stack is : " + stack.size());
//
//        System.out.println("Printing all the items from the stack : ");
//        stack.printStack();

    }

}
