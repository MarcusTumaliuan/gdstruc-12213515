class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Method to insert a new value into the tree
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Method to get the node with the minimum value
    public Node getMin() {
        if (root == null) {
            return null; // Tree is empty
        }
        return getMinRec(root);
    }

    private Node getMinRec(Node node) {
        if (node.left == null) {
            return node; // The leftmost node is the minimum
        }
        return getMinRec(node.left);
    }

    // Method to get the node with the maximum value
    public Node getMax() {
        if (root == null) {
            return null; // Tree is empty
        }
        return getMaxRec(root);
    }

    private Node getMaxRec(Node node) {
        if (node.right == null) {
            return node; // The rightmost node is the maximum
        }
        return getMaxRec(node.right);
    }

    // Method to traverse the tree in order descending
    public void traverseInOrderDescending() {
        traverseInOrderDescendingRec(root);
    }

    private void traverseInOrderDescendingRec(Node node) {
        if (node != null) {
            // First visit the right subtree
            traverseInOrderDescendingRec(node.right);
            // Then visit the current node
            System.out.print(node.value + " ");
            // Finally visit the left subtree
            traverseInOrderDescendingRec(node.left);
        }
    }
}