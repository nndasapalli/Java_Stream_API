package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Easy 5. Remove Empty Strings
 * Given a list of strings, remove empty or null strings using filter().
 **/


public class Task5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "", "stream", null, "api", "");
        System.out.println("words : " + words);

        // Write your code here
        List<String> result = null;
        System.out.println("result : " + result);
    }
}
