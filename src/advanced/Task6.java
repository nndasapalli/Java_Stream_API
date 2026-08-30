package advanced;

import java.util.Arrays;
import java.util.List;

/**
 * Advanced 6. Teeing Collector (Java 12+)
 * Given a list of employee salaries, use Collectors.teeing() to compute the
 * count and the average salary in a single pass, combining them into one
 * result object (e.g. a String summary or a small holder class).
 **/


public class Task6 {
    public static void main(String[] args) {
        List<Double> salaries = Arrays.asList(55000.0, 42000.0, 68000.0, 51000.0, 60000.0);
        System.out.println("salaries : " + salaries);

        // Write your code here
        String result = null;
        System.out.println("result : " + result);
    }
}
