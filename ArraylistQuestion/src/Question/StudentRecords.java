package Question;

import java.util.Arrays;
import java.util.Scanner;

class Student {
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name, age, and grade of student " + (i+1) + ": ");
            String name = scanner.next();
            int age = scanner.nextInt();
            int grade = scanner.nextInt();
            students[i] = new Student(name, age, grade);
        }

        displayStudents(students);
        System.out.println();
        sortByName(students);
        System.out.println("Students sorted by name:");
        displayStudents(students);
        System.out.println();
        sortByAge(students);
        System.out.println("Students sorted by age:");
        displayStudents(students);
        System.out.println();
        sortByGrade(students);
        System.out.println("Students sorted by grade:");
        displayStudents(students);
    }

    public static void displayStudents(Student[] students) {
        System.out.println("Name\tAge\tGrade");
        for (Student student : students) {
            System.out.println(student.name + "\t" + student.age + "\t" + student.grade);
        }
    }

    public static void sortByName(Student[] students) {
        Arrays.sort(students, (a, b) -> a.name.compareToIgnoreCase(b.name));
    }

    public static void sortByAge(Student[] students) {
        Arrays.sort(students, (a, b) -> Integer.compare(a.age, b.age));
    }

    public static void sortByGrade(Student[] students) {
        Arrays.sort(students, (a, b) -> Integer.compare(a.grade, b.grade));
    }
   
}