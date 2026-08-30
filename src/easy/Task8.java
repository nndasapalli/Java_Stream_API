package easy;

import java.util.Arrays;
import java.util.List;

/**
 * Easy 8. allMatch / anyMatch / noneMatch
 * Given a list of integers, check:
 *  - are all numbers positive? (allMatch)
 *  - is there any number greater than 100? (anyMatch)
 *  - are there no negative numbers? (noneMatch)
 **/


public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 15, 23, 42, 8, 16);
        System.out.println("numbers : " + numbers);

        // Write your code here
        boolean allPositive = false;
        boolean anyGreaterThan100 = false;
        boolean noneNegative = false;
        System.out.println("allPositive : " + allPositive);
        System.out.println("anyGreaterThan100 : " + anyGreaterThan100);
        System.out.println("noneNegative : " + noneNegative);
    }
}
