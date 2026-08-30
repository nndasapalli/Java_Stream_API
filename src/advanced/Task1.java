package advanced;

import java.util.Arrays;
import java.util.List;

/**
 * Advanced 1. FlatMap Nested Lists
 * Given a list of lists of integers, flatten into a single list.
 **/


public class Task1 {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        System.out.println("numbers : " + numbers);

        // Write your code here
        List<Integer> result = null;
        System.out.println("result : " + result);
    }
}
