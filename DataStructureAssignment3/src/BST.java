class BST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for (int k : keys) tree.root = tree.insert(tree.root, k);

        tree.inorder(tree.root);
        // Output: 20 30 40 50 60 70 80
    }
}
