class Employee20 {
    protected String name;
    protected double salary;
    public Employee20(String name, double salary) { this.name = name; this.salary = salary; }
    public void displaySalary() { System.out.println(name + " -> Salary=" + (int)salary); }
}

class TeachingStaff20 extends Employee20 {
    protected String subject;
    public TeachingStaff20(String name, double salary, String subject) { super(name, salary); this.subject = subject; }
    @Override public void displaySalary() { System.out.println(name + " -> Subject=" + subject + ", Salary=" + (int)salary); }
}

class Professor extends TeachingStaff20 {
    private String specialization;
    public Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject); this.specialization = specialization;
    }
    @Override public void displaySalary() {
        System.out.println(name + " -> Subject=" + subject + ", Specialization=" + specialization + ", Salary=" + (int)salary);
    }
}

class Lecturer extends TeachingStaff20 {
    private String department;
    public Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject); this.department = department;
    }
    @Override public void displaySalary() {
        System.out.println(name + " -> Subject=" + subject + ", Department=" + department + ", Salary=" + (int)salary);
    }
}

public class Assignment20_CollegeStaffHierarchy {
    public static void main(String[] args) {
        Professor p = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        Lecturer l = new Lecturer("Ms. Mehta", 50000, "Physics", "Science");
        p.displaySalary();
        l.displaySalary();
    }
}
