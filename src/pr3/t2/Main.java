package pr3.t2;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Person> users = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Person");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. Print all info");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 5) {
                break;
            }
            if (choice == 4) {
                if (users.isEmpty()) {
                    System.out.println("\n[!] No user has been added yet.");
                } else{
                    System.out.println("\nAll added people:");
                    for (Person p : users) {
                        System.out.println(p.toString());
                    }
                }
                continue;
            }

            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter address: ");
            String address = sc.nextLine();

            switch (choice) {
                case 1:
                    users.add(new Person(name,address));
                    break;
                case 2:
                    System.out.println("Enter program: ");
                    String program = sc.nextLine();
                    System.out.println("Enter year: ");
                    int year = sc.nextInt();
                    System.out.println("Enter fee: ");
                    double fee = sc.nextDouble();
                    users.add(new Student(name, address, program, year, fee));
                    break;
                case 3:
                    System.out.println("Enter school: ");
                    String school = sc.nextLine();
                    System.out.println("Enter pay: ");
                    double pay = sc.nextDouble();
                    users.add(new Staff(name, address, school, pay));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
