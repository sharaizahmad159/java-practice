import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input N
        int n = scanner.nextInt();

        // Check divisibility by both 3 and 5 first
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }

        scanner.close();
    }
}