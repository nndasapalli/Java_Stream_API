package medium;

import java.util.Arrays;
import java.util.List;

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
                new Employee("Alice", "Engineering", 55000),
                new Employee("Bob", "Sales", 42000),
                new Employee("Charlie", "Engineering", 68000),
                new Employee("David", "Sales", 51000)
        );
        System.out.println("employees : " + employees);

        // Write your code here
        List<Employee> result = null;
        System.out.println("result : " + result);
    }
}
