public class InsertBeginning {
    static class Node {
        int data; Node next;
        Node(int d) { data = d; }
    }

    static class SinglyLinkedList {
        Node head;

        public void insertBeginning(int val) {
            Node n = new Node(val);
            n.next = head;
            head = n;
        }

        public void insertEnd(int val) {
            Node n = new Node(val);
            if (head == null) { head = n; return; }
            Node cur = head;
            while (cur.next != null) cur = cur.next;
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
        list.insertBeginning(5);
        System.out.print("List after insertBeginning: ");
        list.printList();
    }
}


