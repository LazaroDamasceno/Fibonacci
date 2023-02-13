import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Recursive Fibonacci");
        System.out.println(recursiveFibonacci(4));
        System.out.println(recursiveFibonacci(5));
        System.out.println(recursiveFibonacci(6));
        System.out.println("Fibonacci With Reduce");
        System.out.println(fibonacciWithReduce(4));
        System.out.println(fibonacciWithReduce(5));
        System.out.println(fibonacciWithReduce(6));
    }

    public static int recursiveFibonacci(int number) {
        if (number == 1) return 1;
        return number * recursiveFibonacci(number-1);
    }

    public static int fibonacciWithReduce(int number) {
        return Arrays
                .stream(IntStream.rangeClosed(1,number).toArray())
                .reduce(1, (accumulator, product) -> accumulator*product);
    }
}

