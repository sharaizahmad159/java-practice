import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int turns = 0;
        int totalPoints = 0;
        int turnScore = 0;

        while (turnScore != 180) {
            int dart1 = sc.nextInt();
            int dart2 = sc.nextInt();
            int dart3 = sc.nextInt();

            turnScore = dart1 + dart2 + dart3;
            totalPoints += turnScore;
            turns++;
        }

        if (turns == 1) {
            System.out.println("It took 1 turn to hit 180.");
        } else {
            System.out.println("It took " + turns + " turns to hit 180.");
        }

        System.out.println("Total points thrown: " + totalPoints);
    }
}