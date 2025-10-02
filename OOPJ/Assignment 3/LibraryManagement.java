import java.util.*;

class Book30 {
    private int bookId;
    private String title;
    private String author;
    public Book30(int bookId, String title, String author) {
        this.bookId = bookId; this.title = title; this.author = author;
    }
    public String getTitle() { return title; }
}

abstract class LibraryMember {
    protected int memberId;
    protected String name;
    public LibraryMember(int memberId, String name) { this.memberId = memberId; this.name = name; }
    abstract void borrowBook(Book30 book);
}

interface Notifyable { void sendNotification(String message); }

class StudentMember extends LibraryMember implements Notifyable {
    private List<Book30> borrowed = new ArrayList<>();
    private final int limit = 3;
    public StudentMember(int memberId, String name) { super(memberId, name); }
    public void borrowBook(Book30 book) {
        if (borrowed.size() >= limit) {
            System.out.println("Cannot borrow more than " + limit + " books");
        } else {
            borrowed.add(book);
            System.out.println("StudentMember " + name + " borrowed " + borrowed.size() + " books");
        }
    }
    public void sendNotification(String message) { System.out.println("Notification sent to " + name + ": " + message); }
}

class FacultyMember extends LibraryMember implements Notifyable {
    private List<Book30> borrowed = new ArrayList<>();
    private final int limit = 5;
    public FacultyMember(int memberId, String name) { super(memberId, name); }
    public void borrowBook(Book30 book) {
        if (borrowed.size() >= limit) {
            System.out.println("Cannot borrow more than " + limit + " books");
        } else {
            borrowed.add(book);
            System.out.println("FacultyMember " + name + " borrowed " + borrowed.size() + " books");
        }
    }
    public void sendNotification(String message) { System.out.println("Notification sent to " + name + ": " + message); }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book30 b1 = new Book30(1, "Book A", "Author A");
        Book30 b2 = new Book30(2, "Book B", "Author B");
        Book30 b3 = new Book30(3, "Book C", "Author C");
        Book30 b4 = new Book30(4, "Book D", "Author D");

        StudentMember student = new StudentMember(1, "Amit");
        FacultyMember faculty = new FacultyMember(2, "Prof. Singh");

        student.borrowBook(b1);
        student.borrowBook(b2);
        faculty.borrowBook(b1);
        faculty.borrowBook(b2);
        faculty.borrowBook(b3);
        faculty.borrowBook(b4);

        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 14 days");
    }
}
