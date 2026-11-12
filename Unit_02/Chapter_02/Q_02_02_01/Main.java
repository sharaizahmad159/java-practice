package Unit_02.Chapter_02.Q_02_02_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }

        scanner.close();
    }
}
