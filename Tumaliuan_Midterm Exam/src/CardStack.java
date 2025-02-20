import java.util.Arrays;

public class CardStack {
    private Card[] stack;
    private int top;

    public CardStack(int capacity) {
        stack = new Card[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(Card card) {
        if (!isFull()) {
            stack[++top] = card;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public Card pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public Card peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public int size() {
        return top + 1;
    }

    public Card[] getCards() {
        return Arrays.copyOf(stack, top + 1);
    }
}