abstract class Emp {
    protected String name;
    protected double salary;
    public Emp(String name, double salary) { this.name = name; this.salary = salary; }
    abstract double calculateBonus();
}

class Manager extends Emp {
    public Manager(String name, double salary) { super(name, salary); }
    @Override double calculateBonus() { return salary * 0.20; }
}

class Developer extends Emp {
    public Developer(String name, double salary) { super(name, salary); }
    @Override double calculateBonus() { return salary * 0.10; }
}

public class Assignment14_EmployeeBonus {
    public static void main(String[] args) {
        Manager m = new Manager("Anita", 50000);
        Developer d = new Developer("Rohit", 40000);
        System.out.println(m.name + " Bonus = " + (int)m.calculateBonus());
        System.out.println(d.name + " Bonus = " + (int)d.calculateBonus());
    }
}
