package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Easy 2. Filter Even Numbers
 * Given a list of integers, use streams to return only even numbers.
 **/


public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("numbers : " + numbers);

        // Write your code here
        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("result : " + result);
    }
}
