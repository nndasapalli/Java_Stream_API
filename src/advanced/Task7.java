package advanced;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

/**
 * Advanced 7. IntSummaryStatistics
 * Given a list of order amounts (as ints), compute count, sum, min, max and
 * average in a single pass using summaryStatistics().
 **/


public class Task7 {
    public static void main(String[] args) {
        List<Integer> orderAmounts = Arrays.asList(250, 890, 45, 1200, 375, 60, 999);
        System.out.println("orderAmounts : " + orderAmounts);

        // Write your code here
        IntSummaryStatistics stats = null;
        System.out.println("stats : " + stats);
    }
}
