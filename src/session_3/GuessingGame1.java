package session_3;
import java.util.Scanner;

public class GuessingGame1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetNumber = 7;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");

        // Using a while loop
        System.out.println("\nUsing a while loop:");
        System.out.println("Try to guess the number between 1 and 10.");
        guess = 0; // Initializing guess outside the loop
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < targetNumber) {
                System.out.println("Too low. Try again!");
            } else if (guess > targetNumber) {
                System.out.println("Too high. Try again!");
            }
        }
        System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");

        scanner.close();
    }
}
