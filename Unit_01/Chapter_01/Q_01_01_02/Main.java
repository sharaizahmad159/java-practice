import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read floating-point inputs
        Scanner scanner = new Scanner(System.in);

        // Read height (H) and width (W)
        double height = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Calculate the area
        double area = height * width;

        // Output the calculated area
        System.out.println(area);

        scanner.close();
    }
}