package advanced;

import java.util.HashMap;
import java.util.Map;

/**
 * Advanced 9. Merge Two Maps With Streams
 * Given two Map<String, Integer> representing product inventories from two
 * warehouses, merge them into a single map where quantities for the same
 * product key are summed. Do it using Stream.concat() on the two entry sets
 * plus Collectors.toMap() with a merge function (no manual for-loops).
 **/


public class Task9 {
    public static void main(String[] args) {
        Map<String, Integer> warehouseA = new HashMap<>();
        warehouseA.put("Laptop", 10);
        warehouseA.put("Mouse", 50);
        warehouseA.put("Keyboard", 20);

        Map<String, Integer> warehouseB = new HashMap<>();
        warehouseB.put("Laptop", 5);
        warehouseB.put("Mouse", 15);
        warehouseB.put("Monitor", 8);

        System.out.println("warehouseA : " + warehouseA);
        System.out.println("warehouseB : " + warehouseB);

        // Write your code here
        Map<String, Integer> result = null;
        System.out.println("result : " + result);
    }
}
