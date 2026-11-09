package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;

        System.out.println("Guess a number between 1 and 100");

        for (int i = 1; i <= 7; i++) {

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations! You won!");
                break;
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Too High!");
            }

            if (i == 7) {
                System.out.println("Game Over!");
                System.out.println("Correct number: " + number);
            }
        }

        sc.close();
    }
}