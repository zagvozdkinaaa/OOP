package lab1.t2;

public class Employee {
    public enum Position {
        JUNIOR,
        MIDDLE,
        SENIOR
    }
    private static int employeeCounter = 0;
    public static final String COMPANY_NAME = "Arasaka";
    private final int id;
    private final String name;
    private double salary;
    private Position position;

    {
        employeeCounter++;
    }

    public Employee(String name, double salary, Position position) {
        this.id = employeeCounter;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public void raiseSalary(double percent) {
        this.salary += this.salary * percent / 100;
    }
    public void raiseSalary(double percent, double bonus) {
        this.raiseSalary(percent);
        this.salary += bonus;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public static int getEmployeeCounter() {
        return employeeCounter;
    }
    public void getInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Position: " + position);
        System.out.println("Company: " + COMPANY_NAME);
    }
}
