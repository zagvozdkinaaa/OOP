package lab2.t5;

class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.jobTitle = job;
    }
    @Override public String getOccupation() { return "Employee: " + jobTitle; }
}
