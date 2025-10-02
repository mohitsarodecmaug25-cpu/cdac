class Staff21 {
    protected String name;
    protected int staffId;
    public Staff21(String name, int staffId) { this.name = name; this.staffId = staffId; }
    public void displayDetails() { System.out.println(name + " -> Staff ID=" + staffId); }
}

class Doctor extends Staff21 {
    private String specialization;
    public Doctor(String name, int staffId, String specialization) {
        super(name, staffId); this.specialization = specialization;
    }
    @Override public void displayDetails() {
        System.out.println(name + " -> Staff ID=" + staffId + ", Specialization=" + specialization);
    }
}

class Nurse extends Staff21 {
    private String shift;
    public Nurse(String name, int staffId, String shift) {
        super(name, staffId); this.shift = shift;
    }
    @Override public void displayDetails() {
        System.out.println(name + " -> Staff ID=" + staffId + ", Shift=" + shift);
    }
}

public class Assignment21_HospitalStaff {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Reddy", 101, "Cardiology");
        Nurse n = new Nurse("Nisha", 102, "Night");
        d.displayDetails();
        n.displayDetails();
    }
}
