package BT3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private final List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    private static void displayInfo(Student student) {
        System.out.println(STR."\nName: \{student.getName()}.");
        System.out.println(STR."Average Score: \{student.getAverageScore()}.");
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                displayInfo(student);
            }
        }
    }

    public void sortAndDisplayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            students.stream()
                    .sorted(Comparator.comparingDouble(Student::getAverageScore))
                    .forEach(StudentManager::displayInfo);
        }
    }

    public void searchStudentByName(String name) {
        if (students.isEmpty()) {
            System.out.println("No students to search.");
        } else {
            boolean found = false;
            for (Student student : students) {
                if (student.getName().equalsIgnoreCase(name)) {
                    System.out.println("\nStudent found:");
                    displayInfo(student);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(STR."\nStudent with name '\{name}' not found.");
            }
        }
    }

    public void displayStudentsWithLastNameLe() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                if (student.getName().toUpperCase().startsWith("LE")) {
                    displayInfo(student);
                }
                else {
                    System.out.println("\nNo students with last name 'Le' to display.");
                }
            }
        }
    }

}
