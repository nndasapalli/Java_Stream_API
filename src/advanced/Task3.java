package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Advanced 3. Find Second Highest Number
 * Use stream operations to get the second highest integer from a list.
 **/


public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 7, 45, 12, 89, 34, 5, 89);
        System.out.println("numbers : " + numbers);

        // Write your code here
        Optional<Integer> result = null;
        System.out.println("result : " + result);
    }
}
