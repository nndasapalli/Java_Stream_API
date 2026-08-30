package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Easy 3. Convert Strings to Uppercase
 * Given a list of strings, convert all to uppercase using map().
 **/


public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("words : " + words);

        // Write your code here
        List<String> result = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("result : " + result);
    }
}
