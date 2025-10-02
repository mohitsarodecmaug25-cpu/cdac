interface BonusEligible { double calculateBonus(); }

abstract class Employee29 {
    protected String name;
    protected String id;
    public Employee29(String name, String id) { this.name = name; this.id = id; }
    abstract double calculateSalary();
}

class PermanentEmployee extends Employee29 implements BonusEligible {
    private double basicSalary;
    private double hra;
    public PermanentEmployee(String name, String id, double basicSalary, double hra) {
        super(name,id); this.basicSalary = basicSalary; this.hra = hra;
    }
    @Override public double calculateSalary() { return basicSalary + hra; }
    @Override public double calculateBonus() { return calculateSalary() * 0.10; } // example 10% bonus
}

class ContractEmployee29 extends Employee29 {
    private double hourlyRate;
    private int hoursWorked;
    public ContractEmployee29(String name, String id, double hourlyRate, int hoursWorked) {
        super(name,id); this.hourlyRate = hourlyRate; this.hoursWorked = hoursWorked;
    }
    @Override public double calculateSalary() { return hourlyRate * hoursWorked; }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        PermanentEmployee p1 = new PermanentEmployee("Amit", "P001", 50000, 5000);
        PermanentEmployee p2 = new PermanentEmployee("Sneha", "P002", 40000, 4000);
        ContractEmployee29 c1 = new ContractEmployee29("Neha", "C001", 300, 100);
        ContractEmployee29 c2 = new ContractEmployee29("Rohit", "C002", 250, 120);

        System.out.println(p1.name + " Salary = " + (int)p1.calculateSalary() + ", Bonus = " + (int)p1.calculateBonus());
        System.out.println(p2.name + " Salary = " + (int)p2.calculateSalary() + ", Bonus = " + (int)p2.calculateBonus());
        System.out.println(c1.name + " Salary = " + (int)c1.calculateSalary());
        System.out.println(c2.name + " Salary = " + (int)c2.calculateSalary());
    }
}
