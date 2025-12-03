public class ReverseList {
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

        public void reverse() {
            Node prev = null, cur = head;
            while (cur != null) {
                Node nxt = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nxt;
            }
            head = prev;
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
        list.reverse();
        System.out.print("Reversed list: ");
        list.printList();
    }
}
