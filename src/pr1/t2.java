package pr1;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        float area = a * a;
        float perimeter = a * 4;
        double diagonal = a * Math.sqrt(2);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Diagonal is " + diagonal);
    }
}