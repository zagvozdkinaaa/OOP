package pr1;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Error: Discriminant is negative, no real roots.");
        } else {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}

