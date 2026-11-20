import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Read the student's name from the first line of input
        String name = scanner.nextLine();

        // Print the greeting string
        System.out.println("Good evening, " + name + "!");

        scanner.close();
    }
}