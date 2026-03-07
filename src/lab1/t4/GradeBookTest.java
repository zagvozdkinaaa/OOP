package lab1.t4;

import pr2.Student;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course myCourse = new Course("CS101 Object-Oriented Programming and Design",
                "Intro to Java", 3, "Programming Principles II");
        GradeBook gb = new GradeBook(myCourse);

        Student[] list = {
                new Student("Student A", 4),
                new Student("Student B", 12),
                new Student("Student C", 44)
        };

        gb.displayMessage();
        System.out.println("Please, input grades for students:");

        for (Student s : list) {
            System.out.print(s.getName() + ": ");
            int g = sc.nextInt();
            gb.addGrade(s, g);
        }

        System.out.println("\n" + gb.toString());
        gb.displayGradeReport();
    }
}