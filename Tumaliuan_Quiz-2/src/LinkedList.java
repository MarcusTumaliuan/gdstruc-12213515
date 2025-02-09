class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Method to add an element to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++; // Update size
    }

    // Method to remove the first element
    public void removeFirst() {
        if (head != null) {
            head = head.next; // Remove the first element
            size--; // Update size
        }
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }

    // Method to check if the list contains a specific element
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to find the index of a specific element
    public int indexOf(int data) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Return -1 if the element is not found
    }

    // Method to print the list (for testing purposes)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}