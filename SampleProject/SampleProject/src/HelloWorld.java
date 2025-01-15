import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        // print hello world
        //System.out.println("Hello World!");

        System.out.println("Enter Your Name: ");

        // scanner user input
        Scanner inputscanner = new Scanner(System.in);
        String name = inputscanner.nextLine();

        System.out.println("Hello " +  name + "!");
    }
}
