public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // Output: 10 -> 20 -> 30 -> null

        // Size of the list
        System.out.println("Size: " + list.size()); // Output: Size: 3

        // Check if the list contains an element
        System.out.println("Contains 20: " + list.contains(20)); // Output: true
        System.out.println("Contains 40: " + list.contains(40)); // Output: false

        // Get index of an element
        System.out.println("Index of 20: " + list.indexOf(20)); // Output: Index of 20: 1
        System.out.println("Index of 40: " + list.indexOf(40)); // Output: Index of 40: -1

        // Remove the first element
        list.removeFirst();
        list.printList(); // Output: 20 -> 30 -> null
        System.out.println("Size after removing first: " + list.size()); // Output: Size after removing first: 2
    }
}