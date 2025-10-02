class EmpBase {
    protected String name;
    protected double salary;
    public EmpBase(String name, double salary) { this.name = name; this.salary = salary; }
    public void displaySalary() {
        System.out.println(name + " Total Salary = " + (int)salary);
    }
}

class Manager2 extends EmpBase {
    public Manager2(String name, double salary) { super(name, salary); }
    @Override public void displaySalary() {
        double total = salary + salary * 0.20;
        System.out.println(name + " Total Salary = " + (int)total);
    }
}

class Developer2 extends EmpBase {
    public Developer2(String name, double salary) { super(name, salary); }
    @Override public void displaySalary() {
        double total = salary + salary * 0.10;
        System.out.println(name + " Total Salary = " + (int)total);
    }
}

public class Assignment16_EmployeeSalaryDisplay {
    public static void main(String[] args) {
        Manager2 m = new Manager2("Anita", 50000);
        Developer2 d = new Developer2("Rohit", 40000);
        m.displaySalary();
        d.displaySalary();
    }
}
