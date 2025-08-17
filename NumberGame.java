import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        String playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7; // limit attempts
            boolean guessed = false;

            System.out.println("\n🎮 Welcome to the Number Guessing Game!");
            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("📉 Too low! Try again.");
                } else {
                    System.out.println("📈 Too high! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\n🏆 Final Score: " + score);
        sc.close();
    }
}
