import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int darts = 0;
        int distance = 999;

        while (distance > 10) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            distance = Math.abs(x) + Math.abs(y);
            darts++;
        }

        System.out.println("Darts thrown: " + darts);
        System.out.println("Bullseye distance: " + distance);
    }
}