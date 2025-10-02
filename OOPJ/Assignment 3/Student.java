class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) this.marks = marks;
        else System.out.println("Invalid Marks");
    }
    public int getMarks() { return marks; }
}

class P2_Main {
    public static void main(String[] args) {
        P2_Student s = new P2_Student();
        s.setMarks(85);
        System.out.println("Marks = " + s.getMarks());
    }
}
