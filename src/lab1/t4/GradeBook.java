package lab1.t4;
import java.util.*;

import pr2.Student;

public class GradeBook {
    private Course course;
    private Map<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        grades = new HashMap<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void addGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public void displayGradeReport() {
        System.out.printf("Class average is %.2f. ", determineClassAverage());
        findExtremes();
        outputBarChart();
    }

    private double determineClassAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (int g : grades.values()) sum += g;
        return sum / grades.size();
    }

    private void findExtremes() {
        Student lowS = null, highS = null;
        int low = 101, high = -1;

        for (var entry : grades.entrySet()) {
            if (entry.getValue() < low) {
                low = entry.getValue();
                lowS = entry.getKey();
            }
            if (entry.getValue() > high) {
                high = entry.getValue();
                highS = entry.getKey();
            }
        }
        System.out.printf("Lowest grade is %d (%s, id: %d).\n", low, lowS.getName(), lowS.getId());
        System.out.printf("Highest grade is %d (%s, id: %d).\n", high, highS.getName(), highS.getId());
    }

    private void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] freq = new int[11];
        for (int g : grades.values()) {
            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (i == 10) System.out.print("  100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            for (int j = 0; j < freq[i]; j++) System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.getName();
    }
}
