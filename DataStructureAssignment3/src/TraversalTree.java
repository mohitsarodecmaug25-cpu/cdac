class TraversalTree {
    Node root;

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        TraversalTree tree = new TraversalTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);   // 40 20 50 10 30
        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);  // 10 20 40 50 30
        System.out.print("\nPostorder: ");
        tree.postorder(tree.root); // 40 50 20 30 10
    }
}

