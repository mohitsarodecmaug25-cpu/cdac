import java.util.*;

public class LevelOrderTraversal {
    Node root;

    void levelOrder(Node node) {
        if (node == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.levelOrder(tree.root);
        // Output: 1 2 3 4 5 6 7
    }
}
