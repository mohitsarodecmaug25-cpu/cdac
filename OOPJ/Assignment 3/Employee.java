class Employee {
    protected String name;
    protected double basicSalary;
    public Employee(String name, double basicSalary) {
        this.name = name; this.basicSalary = basicSalary;
    }
}

class RegularEmployee extends Employee {
    public RegularEmployee(String name, double basic) { super(name, basic); }
    public double netSalary() { return basicSalary + (0.10 * basicSalary); }
}

class ContractEmployee extends Employee {
    public ContractEmployee(String name, double basic) { super(name, basic); }
    public double netSalary() { return basicSalary + (0.05 * basicSalary); }
}

public class Assignment7_EmployeeHierarchy {
    public static void main(String[] args) {
        RegularEmployee r = new RegularEmployee("Rahul", 20000);
        ContractEmployee c = new ContractEmployee("Riya", 15000);
        System.out.println(r.name + " Net Salary = " + (int)r.netSalary());
        System.out.println(c.name + " Net Salary = " + (int)c.netSalary());
    }
}
