package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Easy 1. Square Each Number
 * Use Stream API to square each number in the list and collect the result into a new list.
 **/


public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("numbers : " + numbers);
        // Write your code here
        List<Integer> result = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println("result : " + result);
    }
}
