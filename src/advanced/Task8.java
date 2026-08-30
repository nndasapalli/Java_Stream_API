package advanced;

import java.util.Arrays;
import java.util.List;

/**
 * Advanced 8. Distinct by a Custom Key
 * Stream's distinct() uses equals()/hashCode(), which doesn't help when you
 * want uniqueness by only one field. Given a List<Employee>, return one
 * employee per department (the first one encountered), without overriding
 * equals()/hashCode() on Employee. Hint: use a thread-unsafe trick with a
 * Set inside filter(), or collect via toMap() keyed by department.
 **/


public class Task8 {

    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return name + "(" + department + ")";
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering"),
                new Employee("Bob", "Sales"),
                new Employee("Charlie", "Engineering"),
                new Employee("David", "Marketing"),
                new Employee("Eve", "Sales")
        );
        System.out.println("employees : " + employees);

        // Write your code here
        List<Employee> result = null;
        System.out.println("result : " + result);
    }
}
