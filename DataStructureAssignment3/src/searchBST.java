class SearchBST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        return root;
    }

    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        return key < root.data ? search(root.left, key) : search(root.right, key);
    }

    public static void main(String[] args) {
        SearchBST tree = new SearchBST();
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for (int k : keys) tree.root = tree.insert(tree.root, k);

        System.out.println(tree.search(tree.root, 40) ? "Found" : "Not Found");
        System.out.println(tree.search(tree.root, 90) ? "Found" : "Not Found");
        // Output: Found, Not Found
    }
}
