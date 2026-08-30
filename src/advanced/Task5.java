package advanced;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Advanced 5. Parallel Stream Performance Test
 * Use parallelStream() to sum a large list and compare performance against a sequential stream.
 **/


public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 10_000_000)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("numbers size : " + numbers.size());

        // Write your code here
        // 1. Sum using numbers.stream() and time it
        // 2. Sum using numbers.parallelStream() and time it
        // 3. Print both sums and elapsed times for comparison
        long sequentialSum = 0;
        long parallelSum = 0;
        System.out.println("sequentialSum : " + sequentialSum);
        System.out.println("parallelSum : " + parallelSum);
    }
}
