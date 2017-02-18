import java.util.Scanner;

public class Game {
	private final int TOTAL_NUMBER_OF_LIVES = 6;
	private boolean playerWins = false;
	private Word word;
	private int livesRemaining;
	private Scanner scanner;
	boolean gameOver = false;
	private HangmanImage image;
	private String lettersGuessed;

	public Game(String word, Scanner scanner) {
		this.word = new Word(word);
		livesRemaining = TOTAL_NUMBER_OF_LIVES;
		this.scanner = scanner;
		image = new HangmanImage();
		lettersGuessed="";
	}

	/** Returns true if the player wins, else false */
	public boolean play() {
		while (!gameOver) {
			try {
				System.out.println("\n\n");
				image.draw(livesRemaining);
				printWord();
				guessLetter();
				if (word.checkAllGuessed()) {
					playerWins = true;
					gameOver();
				} else if (livesRemaining == 0) {
					gameOver();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return this.playerWins;
	}
	
	private void printWord () {
		System.out.println("\n" + word.toString() + "\tLives Remaining: " + livesRemaining + "\n\t Letters Guessed: " + lettersGuessed);
	}

	private void guessLetter() {
		scanner.nextLine();
		System.out.println("Guess a letter: ");
		String letter = "";
		if (scanner.hasNext()) {
			letter = scanner.next();
			lettersGuessed+= " " + letter;
		}
		else
			throw new RuntimeException("No letter entered");
		if (!word.guessLetter(letter)) {
			livesRemaining--;
		}
	}

	public void gameOver() {
		image.draw(livesRemaining);
		if (!playerWins)
			System.out.println("The word was " + word.getFullWord());
		gameOver=true;
	}
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		Game game = new Game("Hello", scanner);
		if (game.play()) {
			System.out.println("\nCongrats! You win.");
		} else {
			System.out.println("Hard luck, you lose.");
		}
	}
}
