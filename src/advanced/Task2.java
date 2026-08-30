package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Advanced 2. Partition Numbers Into Even and Odd
 * Use Collectors.partitioningBy() to split numbers into even and odd groups.
 **/


public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("numbers : " + numbers);

        // Write your code here
        Map<Boolean, List<Integer>> result = null;
        System.out.println("result : " + result);
    }
}
