import java.util.EmptyStackException;

public class ArrayStack {
    private Player[] playerArray;
    private  int top;

    public ArrayStack(int capacity){
        playerArray = new Player[capacity];
        top = -1;
    }

    public void push(Player player){
        //stack is full
        if(top == playerArray.length - 1){
            Player[] largerPlayerArray = new Player[playerArray.length * 2];
            System.arraycopy(playerArray, 0, largerPlayerArray, 0, playerArray.length);
            playerArray = largerPlayerArray;
        }

        playerArray[++top] = player;
    }

    public Player pop() {
        // stack is empty
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return playerArray[top--];
    }

    public Player peek() {
        // stack is empty
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return playerArray[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack() {
        for  (int i = top; i >= 0; i--){
            System.out.println(playerArray[i]);
        }
    }
}
