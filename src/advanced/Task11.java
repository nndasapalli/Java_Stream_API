package advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Advanced 11. Capstone - CSV Pipeline
 * Given raw CSV-style lines "name,department,salary", build a single stream
 * pipeline that:
 *  1. Parses each line into an Employee (map)
 *  2. Filters out employees with salary < 45000
 *  3. Groups the remainder by department
 *  4. Sums the salary per department (summingDouble downstream collector)
 * All in one chain from the raw lines to the final Map<String, Double>.
 **/


public class Task11 {

    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + "(" + department + ", " + salary + ")";
        }
    }

    public static void main(String[] args) {
        List<String> csvLines = Arrays.asList(
                "Alice,Engineering,55000",
                "Bob,Sales,42000",
                "Charlie,Engineering,68000",
                "David,Sales,51000",
                "Eve,Engineering,40000",
                "Frank,Marketing,47000"
        );
        System.out.println("csvLines : " + csvLines);

        // Write your code here
        Map<String, Double> result = null;
        System.out.println("result : " + result);
    }
}
