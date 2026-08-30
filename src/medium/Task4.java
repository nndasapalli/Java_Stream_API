package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Medium 4. Group Students by Grade
 * Given a list of students with name and grade fields, group them by grade.
 **/


public class Task4 {

    static class Student {
        String name;
        String grade;

        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", "A"),
                new Student("Bob", "B"),
                new Student("Charlie", "A"),
                new Student("David", "C"),
                new Student("Eve", "B")
        );
        System.out.println("students : " + students);

        // Write your code here
        Map<String, List<Student>> result = null;
        System.out.println("result : " + result);
    }
}
