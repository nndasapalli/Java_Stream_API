package advanced;

import java.util.Arrays;
import java.util.List;

/**
 * Advanced 4. Custom Collector
 * Write a custom collector to concatenate strings with a separator.
 * Hint: implement it using Collector.of(...), not Collectors.joining().
 **/


public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api", "collector");
        System.out.println("words : " + words);

        // Write your code here
        String result = null;
        System.out.println("result : " + result);
    }
}
