class Student{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object for " + name + " is being garbage collected");
        super.finalize();
    }
}

public class StudentObject22 {
    public static void main(String[] args) {

        Student s1 = new Student("Amit");
        s1 = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}