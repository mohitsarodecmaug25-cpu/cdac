public class CountNodes {
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

        public int countNodes() {
            int count = 0;
            Node cur = head;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        System.out.println("Total nodes: " + list.countNodes());
    }
}
