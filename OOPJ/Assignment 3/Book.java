class Book {
private int copiesAvailable;
public void addCopies(int n) { if (N > 0) copiesAvailable += n; }
public void removeCopies(int n) {
if (n > 0 && copiesAvailable >= n) copiesAvailable -= n;
else System.out.println("Not enough copies");
}
public int getCopiesAvailable() { return copiesAvailable; }
}
class Book {
public static void main(String[] args) {
P4_Book b = new P4_Book();
b.addCopies(3);
b.removeCopies(1);
System.out.println("Copies available = " + b.getCopiesAvailable());
}
}

