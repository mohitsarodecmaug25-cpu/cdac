class Staff {
    protected String name;
    protected double salary;
    public Staff(String name, double salary) {
        this.name = name; this.salary = salary;
    }
    public void display() {
        System.out.println(name + " -> " + salary);
    }
}

class TeachingStaff extends Staff {
    private String subject;
    public TeachingStaff(String name, double salary, String subject) {
        super(name, salary); this.subject = subject;
    }
    @Override public void display() {
        System.out.println(name + " -> " + subject + ", " + (int)salary);
    }
}

class NonTeachingStaff extends Staff {
    private String department;
    public NonTeachingStaff(String name, double salary, String department) {
        super(name, salary); this.department = department;
    }
    @Override public void display() {
        System.out.println(name + " -> " + department + ", " + (int)salary);
    }
}

public class Assignment10_AcademicStaff {
    public static void main(String[] args) {
        TeachingStaff t = new TeachingStaff("Anita", 50000, "Math");
        NonTeachingStaff nt = new NonTeachingStaff("Ramesh", 40000, "Admin");
        t.display();
        nt.display();
    }
}
