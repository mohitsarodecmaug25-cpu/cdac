public class DeleteByValue {
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

        public void deleteByValue(int val) {
            if (head == null) return;
            if (head.data == val) { head = head.next; return; }
            Node cur = head;
            while (cur.next != null && cur.next.data != val) cur = cur.next;
            if (cur.next != null) cur.next = cur.next.next;
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
        list.deleteByValue(30);
        System.out.print("After deleteByValue(30): ");
        list.printList();
    }
}
