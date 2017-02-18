import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.println("Please enter '1' for one-player.");
		System.out.println("or enter '2' for two-player.");
		Scanner scanner = new Scanner(System.in);
		int input = -1;
		if (scanner.hasNextInt())
			input = scanner.nextInt();
		boolean finished = false;
		if (!finished) {
			if (true) {
				if (input == 1) {
					String word = generateWord();
					Game game = new Game(word, scanner);
					if (game.play()) {
						System.out.println("Congrats! You win.");
//						System.out.println("You win! Would you like to play again? y/n");
						if (scanner.hasNext("n")) {
							finished = true;
							System.out.println("Thank you for playing!");
						} else
							input = 1;
					}
				} else if (input == 2) {
					System.out.println("Please enter the word that you wish your opponent to guess.");
					String text = scanner.next();
//					System.out.println("Opponents turn. Please guess a letter.");
					for (int i=0 ;i<30; i++) {
						System.out.println(" ");
					}
					Game game = new Game(text, scanner);
					if (game.play()) {
//						System.out.println("You win! Would you like to play again? y/n");
						if (scanner.hasNext("n")) {
							finished = true;
							System.out.println("Thank you for playing!");
						} else
							input = 1;
					}
				}
			} else
				System.out.println("Please enter '1' or '2' to play.");
		}

	}

	public static String generateWord() throws FileNotFoundException {
		File file = new File("wordlist.txt");
		Scanner scanner = new Scanner(file);
		Random randomNum = new Random();
		int position = randomNum.nextInt(69902);
		int i = 0;
		String result = "";
		while (scanner.hasNextLine() && i <= position) {
//			System.out.println("here");
			if (i == position) {
				result = scanner.next();
//				System.out.println(result);
				scanner.close();
				return result;
			} else {
				scanner.nextLine();
				i++;
			}
		}
		scanner.close();
		return result;
	}
}