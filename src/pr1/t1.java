package pr1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int length = name.length();
        System.out.println("+" + "-".repeat(length) + "+");
        System.out.println("|" + name + "|");
        System.out.println("+" + "-".repeat(length) + "+");
    }
}
