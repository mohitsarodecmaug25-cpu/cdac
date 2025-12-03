package cdac;

import java.util.*;

class Student {
    String name;
    int rollnumber;
    String department;
    double cgpa;

    // Constructor
    public Student(int rollnumber, String name, String department, double cgpa) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.department = department;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return rollnumber + " : " + name + " : " + department + " : " + cgpa;
    }
}

// Comparator for CGPA (Descending)
class SortByCGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.cgpa, s1.cgpa);
    }
}

// Comparator for Name (Alphabetical)
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator for Roll Number
class SortByRollno implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollnumber, s2.rollnumber);
    }
}

// Comparator for Department
class SortByDepartment implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.department.compareTo(s2.department);
    }
}

public class Placementpakka {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(101, "Dhiraj", "CS", 8.5));
        s.add(new Student(102, "Mohit", "CS", 9.2));
        s.add(new Student(103, "Ravi", "IT", 6.7));
        s.add(new Student(104, "Anita", "EC", 4.9));

        // 1. Merit list (CGPA sorting)
        Collections.sort(s, new SortByCGPA());
        System.out.println("Merit List (By CGPA):");
        for (Student stu : s) {
            System.out.println(stu);
        }
        System.out.println();

        // 2. Alphabetical order
        Collections.sort(s, new SortByName());
        System.out.println("Alphabetical Order:");
        for (Student stu : s) {
            System.out.println(stu.name + " (" + stu.cgpa + ")");
        }
        System.out.println();

        // 3. Department-wise grouping
        Map<String, List<Student>> deptmap = new HashMap<>();
        for (Student stu : s) {
            List<Student> deptList = deptmap.getOrDefault(stu.department, new ArrayList<>());
            deptList.add(stu);
            deptmap.put(stu.department, deptList);
        }
        System.out.println("Department Groups:");
        for (String dept : deptmap.keySet()) {
            System.out.print(dept + ": [ ");
            List<Student> deptStud = deptmap.get(dept);
            Iterator<Student> it = deptStud.iterator();
            while (it.hasNext()) {
                System.out.print(it.next().name);
                if (it.hasNext()) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
        System.out.println();

        // 4. Unique names using HashSet
        Set<String> uniqueName = new HashSet<>();
        for (Student stu : s) {
            uniqueName.add(stu.name);
        }
        System.out.println("Unique Students Name:");
        for (String name : uniqueName) {
            System.out.println(name);
        }
        System.out.println();

        // 5. Roll number sorting using TreeSet
        Set<Student> rollnoSet = new TreeSet<>(new SortByRollno());
        rollnoSet.addAll(s);
        System.out.println("Roll No Order:");
        for (Student stu : rollnoSet) {
            System.out.println(stu);
        }
        System.out.println();

        // 6. Performance filter (remove students < 5 CGPA)
        Iterator<Student> it = s.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            if (stu.cgpa < 5.0) {
                it.remove();
            }
        }
        System.out.println("Qualified Students (CGPA >= 5):");
        for (Student stu : s) {
            System.out.println(stu);
        }
        System.out.println();

        // 7. Recent registrations using Stack
        Stack<Student> regiStu = new Stack<>();
        for (Student stu : s) {
            regiStu.push(stu);
        }
        System.out.println("Stack (Registrations): " + regiStu);

        if (!regiStu.isEmpty()) {
            System.out.println("Last Registration: " + regiStu.peek());
        }

        if (!regiStu.isEmpty()) {
            Student removed = regiStu.pop();
            System.out.println("Removed Last Registration: " + removed);
        }
        System.out.println();

        // 8. Hostel applications using Deque
        Deque<Integer> hostel = new LinkedList<>();
        hostel.addFirst(101);
        hostel.addLast(105);
        System.out.println("Hostel Queue: " + hostel);

        if (!hostel.isEmpty()) {
            int allocateFront = hostel.removeFirst();
            System.out.println("Allocated from front: " + allocateFront);
        }
        System.out.println("Hostel Queue after allocation: " + hostel);
    }
}
