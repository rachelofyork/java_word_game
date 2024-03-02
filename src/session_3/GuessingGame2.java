package session_3;
import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args){
        // Using a do-while loop

        Scanner scanner = new Scanner(System.in);

        int targetNumber = 7;
        int guess;


        System.out.println("\nUsing a do-while loop:");
        System.out.println("Try to guess the number between 1 and 10.");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < targetNumber) {
                System.out.println("Too low. Try again!");
            } else if (guess > targetNumber) {
                System.out.println("Too high. Try again!");
            }
        } while (guess != targetNumber);
        System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");
        scanner.close();
    }
}