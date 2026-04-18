package lab3.t5;

import lab3.t4.Employee;
import lab3.t4.Manager;

import java.util.Arrays;
import java.util.Date;

import pr2.Time;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anastasia", 500000, new Date(123, 0, 1), "ID1");
        Employee e2 = new Employee("Ivan", 450000, new Date(124, 5, 12), "ID2");
        Manager m1 = new Manager("Kseniya", 800000, new Date(120, 1, 1), "ID0", 50000);

        Employee[] staff = {e1, e2, m1};
        Sort.bubbleSort(staff);
        for (Employee e : staff) System.out.println(e);

        Chocolate[] chocos = {new Chocolate("Twix", 50), new Chocolate("Snickers", 60)};
        Sort.bubbleSort(chocos);
        System.out.println(Arrays.toString(chocos));
        Sort.swap(chocos, 0, 1);
        System.out.println(Arrays.toString(chocos));

        Time t1 = new Time(23, 5, 6);
        Time t2 = new Time(4, 24, 33);
        System.out.println (t1.toString());
        System.out.println (t2.toString());
        System.out.println("Time comparing: " + t1.compareTo(t2));
    }
}
