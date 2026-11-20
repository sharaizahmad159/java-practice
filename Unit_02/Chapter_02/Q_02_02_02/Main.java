import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the country name from input
        String country = scanner.nextLine();

        // Compare string values using .equals()
        if (country.equals("Argentina")) {
            System.out.println("Lionel Messi");
        } else if (country.equals("Portugal")) {
            System.out.println("Cristiano Ronaldo");
        } else {
            System.out.println("no preference");
        }

        scanner.close();
    }
}