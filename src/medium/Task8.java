package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Medium 8. Total and Average Salary per Department
 * Given a List<Employee>, compute:
 *  - total salary per department (groupingBy + summingDouble)
 *  - average salary per department (groupingBy + averagingDouble)
 **/


public class Task8 {

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
                new Employee("Alice",   "Engineering",  55000),
                new Employee("Bob",     "Sales",        42000),
                new Employee("Charlie", "Engineering",  68000),
                new Employee("David",   "Sales",        51000),
                new Employee("Eve",     "Engineering",  60000)
        );
        System.out.println("employees : " + employees);

        // Write your code here
        Map<String, Double> totalSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.department,
                        Collectors.summingDouble(
                                employee -> employee.salary
                        )
                ));

        Map<String, Double> averageSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        employee -> employee.department,
                        Collectors.averagingDouble(
                                employee -> employee.salary
                        )
                ));
        System.out.println("totalSalaryByDept : " + totalSalaryByDept);
        System.out.println("averageSalaryByDept : " + averageSalaryByDept);
    }
}
