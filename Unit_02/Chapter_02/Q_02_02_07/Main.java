package Unit_02.Chapter_02.Q_02_02_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int year = Integer.parseInt(scannerObj.nextLine());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}