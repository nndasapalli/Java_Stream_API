package easy;

import java.util.Arrays;
import java.util.List;

/**
 * Easy 7. Join With Prefix and Suffix
 * Given a list of strings, join them into a single string separated by ", " and
 * wrapped with "[" as prefix and "]" as suffix, using Collectors.joining().
 * Example input: ["Java", "Spring", "Streams"] -> output: "[Java, Spring, Streams]"
 **/


public class Task7 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Streams");
        System.out.println("words : " + words);

        // Write your code here
        String result = null;
        System.out.println("result : " + result);
    }
}
