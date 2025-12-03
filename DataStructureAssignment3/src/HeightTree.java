class HeightTree {
    Node root;

    int height(Node node) {
        if (node == null) return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);
        return 1 + Math.max(leftH, rightH);
    }

    public static void main(String[] args) {
        HeightTree tree = new HeightTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height = " + tree.height(tree.root));
        // Output: Height = 3
    }
}
