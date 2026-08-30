package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Medium 7. Multi-Level Grouping
 * Given a List<Employee>, group them first by department, then by grade,
 * i.e. produce a Map<String, Map<String, List<Employee>>> using a nested
 * Collectors.groupingBy().
 **/


public class Task7 {

    static class Employee {
        String name;
        String department;
        String grade;

        Employee(String name, String department, String grade) {
            this.name = name;
            this.department = department;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering", "Senior"),
                new Employee("Bob", "Engineering", "Junior"),
                new Employee("Charlie", "Sales", "Senior"),
                new Employee("David", "Engineering", "Senior"),
                new Employee("Eve", "Sales", "Junior")
        );
        System.out.println("employees : " + employees);

        // Write your code here
        Map<String, Map<String, List<Employee>>> result = null;
        System.out.println("result : " + result);
    }
}
