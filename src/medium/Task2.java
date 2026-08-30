package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Medium 2. Sort a List of Objects
 * Given a List<Employee>, sort by salary using streams.
 **/


public class Task2 {

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
            return name + "=" + salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice",   "Engineering", 55000),
                new Employee("Bob",     "Sales",       42000),
                new Employee("Charlie", "Engineering", 68000),
                new Employee("David",   "Sales",       51000)
        );
        System.out.println("employees : " + employees);

        // Write your code here
        List<Employee> result = employees.stream()
                .sorted(Comparator.comparing(employee -> employee.salary))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("result : " + result);
    }
}
