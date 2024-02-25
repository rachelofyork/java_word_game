package session_1;
import java.util.Objects;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
       System.out.println("Welcome to Guess The Word! Please enter your username: ");
       Scanner getUserValue = new Scanner(System.in);
       String username = getUserValue.next();
       System.out.println("Please guess a word that refers to a single quote data type: ");
       String userGuess = getUserValue.next();
       getUserValue.close();

       String answer = "char";
       boolean finalAnswer = Objects.equals(userGuess, answer);
       System.out.println(username + ", was your guess right? True or False? " + finalAnswer + " The answer was: " + answer);

    }
}
