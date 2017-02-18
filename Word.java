
public class Word {
	private String word;
	private boolean[] lettersGuessed;
	private boolean allGuessed;
//	private String head = 
//			"----" +
//		   "/" + "\" +"
//		  "/"
	public Word (String word) {
		this.word = word.toLowerCase();
		lettersGuessed = new boolean [word.length()];
		initBoolArray(lettersGuessed);
		allGuessed = false;
	}
	
	/** Returns true if the word contains the letter, else false */
	public boolean guessLetter(String letter) {
		boolean result = (word.contains(letter));
		if (result) {
			int i = word.indexOf(letter);
			while (i!=-1) {
				lettersGuessed[i] = true;
				i = word.indexOf(letter, i+1);
			}
		}
			
		return result;
	}
	
	public String getFullWord () {
		return this.word;
	}
	
	public String toString () {
		String result = "";
		for (int i = 0; i< lettersGuessed.length; i++) {
			if (lettersGuessed[i])
				result += word.substring(i, i+1);
			else
				result += " _ ";
		}
		return result;
	}
	
	public boolean checkAllGuessed () {
		for (int i = 0; i<lettersGuessed.length; i++) {
			if (!lettersGuessed[i])
				return false;
		}
		return true;
	}
	
	private void initBoolArray (boolean[] array) {
		for (int i=0; i<array.length; i++) {
			array[i] = false;
		}
	}
}
