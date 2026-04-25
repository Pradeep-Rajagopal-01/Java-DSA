package algorithms.dynamicprogramming.tabulation;

//Tabulation follows the (Bottom-Up) approach and is done iteratively.

public class Fibonacci_Sequence_With_Tabulation {

    static int counter = 0;
    public static int fibonacciSequence(int n){
        int[] fibList = new int[n+1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int index = 2; index <= n; index++) {
            counter++;
            fibList[index] = fibList[index-1] + fibList[index-2];
        }
        return fibList[n];
    }


    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fib of " +n+ " = " + fibonacciSequence(n));
        System.out.println("Counter = " + counter);    }
}
