package algorithms.dynamicprogramming.memoization;

public class Fibonacci_Sequence_With_Memoization {

    static Integer[] memo = new Integer[30];
    //We are using the counter variable to track method calls.
    static int counter=0;

    public static Integer fibonacciSequence(int n){
        counter++;
        if (memo[n] != null){
            return memo[n];
        }

        if (n == 0 || n == 1){
            return n;
        }

        memo[n]=fibonacciSequence(n-1) + fibonacciSequence(n-2);
        return memo[n];
    }

    public static void main(String[] args) {

        int n = 8;
        System.out.println("Fib of " +n+ " = " + fibonacciSequence(n));
        System.out.println("Method calls = " + counter);
    }
}
