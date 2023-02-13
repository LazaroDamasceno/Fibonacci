import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
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

