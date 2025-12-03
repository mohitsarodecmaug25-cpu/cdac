public class InsertAtPosition {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    static class SinglyLinkedList {
        Node head;

        public void insertEnd(int val) {
            Node n = new Node(val);
            if (head == null) { head = n; return; }
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = n;
        }

        public void insertAtPosition(int val, int pos) {
            Node n = new Node(val);
            if (pos == 0) { n.next = head; head = n; return; }
            Node cur = head;
            for (int i = 0; cur != null && i < pos - 1; i++) cur = cur.next;
            if (cur == null) return; // invalid position
            n.next = cur.next;
            cur.next = n;
        }

        public void printList() {
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertAtPosition(25, 2); // insert at index 2
        System.out.print("List after insertAtPosition: ");
        list.printList();
    }
}
