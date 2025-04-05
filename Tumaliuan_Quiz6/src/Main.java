public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting values into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        // Getting the minimum value in the tree
        Node minNode = bst.getMin();
        System.out.println("Minimum value in the tree: " + (minNode != null ? minNode.value : "Tree is empty"));

        // Getting the maximum value in the tree
        Node maxNode = bst.getMax();
        System.out.println("Maximum value in the tree: " + (maxNode != null ? maxNode.value : "Tree is empty"));

        // Traversing the tree in descending order
        System.out.print("In-order traversal in descending order: ");
        bst.traverseInOrderDescending();
    }
}