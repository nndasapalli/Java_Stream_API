package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Medium 6. List of Objects to Map (with duplicate key handling)
 * Given a List<Employee>, convert it to a Map<String, Double> of name -> salary
 * using Collectors.toMap(). Two employees share the name "Alice" with different
 * salaries, so you must supply a merge function (e.g. keep the higher salary)
 * to avoid an IllegalStateException.
 **/


public class Task6 {

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + "=" + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice",   55000),
                new Employee("Bob",     42000),
                new Employee("Alice",   61000),
                new Employee("Charlie", 68000)
        );
        System.out.println("employees : " + employees);

        // Write your code here
        Map<String, Double> result = employees.stream()
                .collect(Collectors.toMap(
                        employee -> employee.name,
                        employee -> employee.salary,
                        Double::max
                ));
        System.out.println("result : " + result);
    }
}
