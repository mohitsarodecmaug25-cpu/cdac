public class Search {
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

        public int search(int val) {
            Node cur = head; int idx = 0;
            while (cur != null) {
                if (cur.data == val) return idx;
                cur = cur.next; idx++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        int pos = list.search(30);
        System.out.println(pos >= 0 ? "Element found at index " + pos : "Not found");
    }
}
