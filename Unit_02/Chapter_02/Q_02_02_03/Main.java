import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the health percentage integer H
        int h = scanner.nextInt();

        // Check health ranges from highest to lowest
        if (h >= 80 && h <= 300) {
            System.out.println("healthy");
        } else if (h >= 60 && h <= 79) {
            System.out.println("bloody nose");
        } else if (h >= 40 && h <= 59) {
            System.out.println("face swollen");
        } else if (h >= 20 && h <= 39) {
            System.out.println("eyes bloodshot, face bleeding");
        } else if (h >= 1 && h <= 19) {
            System.out.println("even more blood");
        } else if (h == 0) {
            System.out.println("eyes closed. Game Over");
        }

        scanner.close();
    }
}