package Unit_02.Chapter_02.Q_02_02_05;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int d = Integer.parseInt(scannerObj.nextLine());

        if (d == 1) {
            System.out.println("Sunday");
        } else if (d == 2) {
            System.out.println("Monday");
        } else if (d == 3) {
            System.out.println("Tuesday");
        } else if (d == 4) {
            System.out.println("Wednesday");
        } else if (d == 5) {
            System.out.println("Thursday");
        } else if (d == 6) {
            System.out.println("Friday");
        } else if (d == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("invalid argument");
        }
    }
}