package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Medium 10. Sort by Multiple Fields
 * Given a List<Employee>, sort by department ascending, then by salary
 * descending within each department, using chained Comparator.comparing()
 * / thenComparing() calls.
 **/


public class Task10 {

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
        List<Employee> employees = Arrays.asList(
                new Employee("Alice",   "Engineering",  55000),
                new Employee("Bob",     "Sales",        42000),
                new Employee("Charlie", "Engineering",  68000),
                new Employee("David",   "Sales",        51000),
                new Employee("Eve",     "Engineering",  60000)
        );
        System.out.println("employees : " + employees);

        // Write your code here
        List<Employee> result = employees.stream()
                .sorted(
                        Comparator.comparing(
                                (Employee employee) -> employee.department
                        ).thenComparing(
                                Comparator.comparingDouble(
                                        (Employee employee) -> employee.salary)
                                        .reversed()
                        )
                )
                .collect(Collectors.toList());
        System.out.println("result : " + result);
    }
}
