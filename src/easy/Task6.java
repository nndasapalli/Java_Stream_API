package easy;

import java.util.Arrays;
import java.util.List;

/**
 * Easy 6. Count Strings That Start With "A"
 * Use streams to count how many strings begin with the letter "A".
 **/


public class Task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Ant");
        System.out.println("words : " + words);

        // Write your code here
        long result = words.stream()
                .filter(s->s.startsWith("A"))
                .count() ;       
                System.out.println("result : " + result);
    }
}
