import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0; 

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1; 
            int attempts = 5; 
            boolean guessedCorrectly = false;

            System.out.println("\nI have picked a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts to guess the correct number.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                int userGuess = sc.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++; 
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you're out of attempts. The correct number was: " + targetNumber);
            }

            
            System.out.print("Do you want to play another round? (y/n): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("y");
        }

        
        System.out.println("\nGame Over! You won " + score + " round(s).");
        System.out.println("Thanks for playing!");

        sc.close();
    }
}
