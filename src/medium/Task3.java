package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Medium 3. Find Max and Min
 * Given a list of integers, find the maximum and minimum using streams.
 **/


public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 7, 45, 12, 89, 34, 5);
        System.out.println("numbers : " + numbers);

        // Write your code here
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);

        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
