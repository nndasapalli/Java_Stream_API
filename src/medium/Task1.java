package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Medium 1. Find Duplicate Elements
 * Given a list of integers, return all duplicate values using streams.
 **/


public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 3);
        System.out.println("numbers : " + numbers);

        // Write your code here
        Set<Integer> duplicate = new HashSet<Integer>();
        Set<Integer> result = numbers.stream()
                .filter(number -> !duplicate.add(number))
                .collect(Collectors.toSet());
        System.out.println("result : " + result);
    }
}
