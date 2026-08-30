package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Medium 5. Word Frequency Count
 * Given a list of words, produce a map showing the frequency of each word.
 **/


public class Task5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "java", "api", "stream", "java");
        System.out.println("words : " + words);

        // Write your code here
        Map<String, Long> result = words.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        ;
        System.out.println("result : " + result);
    }
}
