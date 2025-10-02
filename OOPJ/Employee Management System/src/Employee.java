class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    Manager(String name, double salary, String department, double bonus) {
        super(name, salary);
        if (bonus < 0) {
            System.out.println("Invalid Bonus");
            bonus = 0;
        }
        this.department = department;
        this.bonus = bonus;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department + ", Bonus: " + bonus);
    }

    double calculateTotalSalary() {
        return salary + bonus;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 40000);
        Employee e2 = new Employee("Neha", 50000);

        Manager m1 = new Manager("Raj", 60000, "HR", 10000);
        Manager m2 = new Manager("Simran", 55000, "IT", -5000); // Invalid
        Manager m3 = new Manager("Vikas", 70000, "Sales", 15000);

        e1.displayDetails();
        e2.displayDetails();

        m1.displayDetails();
        System.out.println("Total Salary: " + m1.calculateTotalSalary());

        m2.displayDetails();
        System.out.println("Total Salary: " + m2.calculateTotalSalary());

        m3.displayDetails();
        System.out.println("Total Salary: " + m3.calculateTotalSalary());
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
