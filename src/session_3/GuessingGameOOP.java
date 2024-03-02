package session_3;
import java.util.Scanner;


class Game {
    // Attribute. Private means targetNumber is only accessible within Game class
    private int targetNumber;

    // Constructor
    public Game() {
        targetNumber = (int) (Math.random() * 10) + 1; // Generating a random number between 1 and 10
    }

    // Method to start the game
    public void startGame() {
        System.out.println("Game started!");
    }

    // Method to check the guess
    public boolean checkGuess(int guess) {
        return guess == targetNumber;
    }

    // Getter for targetNumber
    public int getTargetNumber() {
        return targetNumber;
    }
}


class Player {
    // Attribute
    private String name;

    // Constructor
    public Player(String playerName) {
        this.name = playerName;
    }

    // Getter
    public String getName() {
        return name;
    }

}

public class GuessingGameOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a Player object
        Player player = new Player("Player 1");

        // Welcome message
        System.out.println("Welcome to the Number Guessing Game, " + player.getName() + "!");
        System.out.println("Try to guess the number between 1 and 10.");

        // Creating a Game object
        Game game = new Game();

        // Starting the game
        game.startGame();

        int guess;
        do {
            guess = scanner.nextInt();

            if (game.checkGuess(guess)) {
                System.out.println("Congratulations! You guessed the number " + guess + " correctly!");
                break;
            } else {
                if (guess < game.getTargetNumber()) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
        } while (true);

        scanner.close();
    }
}

