class MinMaxBST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);
        if (key < root.data) root.left = insert(root.left, key);
        else if (key > root.data) root.right = insert(root.right, key);
        return root;
    }

    int minValue(Node root) {
        while (root.left != null) root = root.left;
        return root.data;
    }

    int maxValue(Node root) {
        while (root.right != null) root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        MinMaxBST tree = new MinMaxBST();
        int[] keys = {50, 30, 20, 40, 70, 60, 80};
        for (int k : keys) tree.root = tree.insert(tree.root, k);

        System.out.println("Min: " + tree.minValue(tree.root)); // 20
        System.out.println("Max: " + tree.maxValue(tree.root)); // 80
    }
}

