package lab3.t4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addToTeam(Employee e) { team.add(e); }
    public double getBonus() { return bonus; }

    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other);
        if (res == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return res;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus + ", Team Size: " + team.size();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) this.team.clone();
        return cloned;
    }
}
