import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String name = sc.nextLine();

            if (name.equals("A girl has no name")) {
                System.out.println("*sweats profusely*");
                break;
            }

            System.out.println("hello " + name + "!");
            System.out.println("NEXT!");
        }
    }
}