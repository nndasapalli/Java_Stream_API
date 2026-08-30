package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Advanced 2. Partition Numbers Into Even and Odd
 * Use Collectors.partitioningBy() to split numbers into even and odd groups.
 **/


public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("numbers : " + numbers);

        // Write your code here
        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(
                        Collectors.partitioningBy(
                                number -> number % 2 == 0
                        )
                );

        System.out.println("result : " + result);
    }
}
