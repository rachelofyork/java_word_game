package session_2;
import java.util.Scanner;

public class Demo3 {

    public static void playGame(){
        Scanner input = new Scanner(System.in);
        String[] words = new String[2];
        words[0] = "Concatenation";
        words[1] = "Addition";
        int points;
        int numberOfTrials = 0;

        System.out.println("Hello, Welcome to \"Guess The Word\". \nPlease Enter Your Username: ");
        String username = input.next();

        for (int i=0; i<2; i++){
            System.out.println(username + ", please guess a word that is used to combine strings in programming: ");
            String userGuess = input.next();

            if (userGuess.equals(words[0])) {
                points = 3*2;
                System.out.println(username + ", you're correct! You've scored " + points + " points!");
                break;
            }
            else if (userGuess.equals(words[1])){
                points = 0;
                System.out.println("Sorry, you have guessed the kill word and have lost the game! Better luck next time...");
                break;

            }
            else if (numberOfTrials > 0){
                System.out.println("You have used all of your guesses. Come back tomorrow!");
            }
            else {
                System.out.println(("Incorrect, please try again!"));
                numberOfTrials++;
            }

        }
        input.close();
    }

    public static void main(String[] args){
        playGame();  // Call our other methods/functions
    }

}