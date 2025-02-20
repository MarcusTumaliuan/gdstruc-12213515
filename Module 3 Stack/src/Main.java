public class Main {
    public static void main(String[] args) {
        ArrayStack playerStack = new ArrayStack(10);
        playerStack.push(new Player(1, "Saitama", 999));
        playerStack.push(new Player(2, "Deku", 100));
        playerStack.push(new Player(3, "Saiki K.", 500));

        //initiate stack
        System.out.println("Initiate Stack:");
        playerStack.printStack();

        System.out.println("\nPopping " + playerStack.pop());

        System.out.println("\nPeeping " + playerStack.peek());

        System.out.println("\nNew Stack:");
        playerStack.printStack();

        playerStack.push(new Player(4, "Sakomoto", 10));
        System.out.println("\nNew Stack:");
        playerStack.printStack();
    }
}
