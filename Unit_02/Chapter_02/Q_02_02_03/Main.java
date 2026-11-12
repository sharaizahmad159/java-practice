package Unit_02.Chapter_02.Q_02_02_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        if (h >= 80) {
            System.out.println("healthy");
        } else if (h >= 60) {
            System.out.println("bloody nose");
        } else if (h >= 40) {
            System.out.println("face swollen");
        } else if (h >= 20) {
            System.out.println("eyes bloodshot, face bleeding");
        } else if (h >= 1) {
            System.out.println("even more blood");
        } else {
            System.out.println("eyes closed. Game Over");
        }

        scanner.close();
    }
}
