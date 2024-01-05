import java.util.Random;
import java.util.Scanner;

public class numberGame{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 8;
        int rounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0 ;

            System.out.println("\nRound" + (rounds + 1) + ": Guess the number between " + lowerBound + " and " + upperBound );

            while (attempts < maxAttempts){
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == targetNumber){
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    break;
                }
                else if(userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                }
                else{
                    System.out.println("Too high! Try again.");
                }

                }

                rounds++;

                System.out.print("Do you want to play again? (yes/no): ");

            }

            while (scanner.next().equalsIgnoreCase("yes"));

            System.out.println("Thanks for playing! Your total score is based on total attempts: " + totalAttempts);
            scanner.close();
            }

        }
