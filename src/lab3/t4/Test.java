package lab3.t4;

import java.util.*;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Anastasia", 500000, new Date(123, 0, 1), "ID1");
        Employee e2 = new Employee("Ivan", 450000, new Date(124, 5, 12), "ID2");
        Manager m1 = new Manager("Kseniya", 800000, new Date(120, 1, 1), "ID0", 50000);
        Manager m2 = new Manager("Boris", 830000, new Date(125, 4, 23), "ID3", 40000);

        Employee[] staff = {e1, e2, m1, m2};

        Arrays.sort(staff);
        System.out.println("Sorted by salary/bonus:");
        for (Employee e : staff) System.out.println(e);

        Arrays.sort(staff, new NameComparator());
        System.out.println("\nSorted by name:");
        for (Employee e : staff) System.out.println(e);

        Arrays.sort(staff, new HireDateComparator());
        System.out.println("\nSorted by hire date:");
        for (Employee e : staff) System.out.println(e);

        Employee e1Clone = (Employee) e1.clone();
        System.out.println("\nClone test (e1 == e1Clone): " + (e1 == e1Clone));
        System.out.println("Clone test (e1.equals(e1Clone)): " + e1.equals(e1Clone));
    }
}
