package session_2;
import java.util.Scanner;

public class Demo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, welcome to \"Guess The Word\". \nPlease Enter Your Username: ");
        String username = input.next();
        System.out.println(username + ", please guess a word that is used to combine strings in programming: ");
        String userGuess = input.next();
        input.close();
        String word = "Concatenation";
        String killWord = "Addition";
        int points;

        if (userGuess.equalsIgnoreCase(word)) {
            points = 3 * 2;
            System.out.println(username + ", you're correct! You've scored " + points + " points!");
        } else if (userGuess.equalsIgnoreCase(killWord)) {
            points = 0;
            System.out.println("Sorry, you have guessed the kill word and have lost the game! Better luck next time...");

        } else {
            System.out.println(("Incorrect! Please run the game again to have another go!"));
        }
    }
}