class Member {
    protected String name;
    protected int id;
    public Member(String name, int id) { this.name = name; this.id = id; }
    public void displayInfo() { System.out.println(name + " -> ID=" + id); }
}

class Teacher23 extends Member {
    private String subject;
    public Teacher23(String name, int id, String subject) { super(name, id); this.subject = subject; }
    @Override public void displayInfo() { System.out.println(name + " -> ID=" + id + ", Subject=" + subject); }
}

class Student23 extends Member {
    private int grade;
    public Student23(String name, int id, int grade) { super(name, id); this.grade = grade; }
    @Override public void displayInfo() { System.out.println(name + " -> ID=" + id + ", Grade=" + grade); }
}

class Staff23 extends Member {
    private String department;
    public Staff23(String name, int id, String department) { super(name, id); this.department = department; }
    @Override public void displayInfo() { System.out.println(name + " -> ID=" + id + ", Department=" + department); }
}

public class SchoolMembers {
    public static void main(String[] args) {
        Teacher23 t = new Teacher23("Mr. Kumar", 101, "English");
        Student23 s = new Student23("Riya", 201, 10);
        Staff23 st = new Staff23("Mr. Das", 301, "Maintenance");
        t.displayInfo();
        s.displayInfo();
        st.displayInfo();
    }
}
