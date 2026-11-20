package Unit_02.Chapter_02.Q_02_02_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        int s = Integer.parseInt(scannerObj.nextLine());

        if (s <= 58523) {
            System.out.println(1);
        } else if (s <= 117045) {
            System.out.println(2);
        } else if (s <= 181440) {
            System.out.println(3);
        } else if (s <= 258482) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}