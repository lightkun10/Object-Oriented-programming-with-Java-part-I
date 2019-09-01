public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!this.word.contains(letter) && !this.guessedLetters.contains(letter)) {
            this.numberOfFaults++;
        }

        if (!this.guessedLetters.contains(letter)) {
            this.guessedLetters += letter;
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";

        for (int i = 0; i < this.word.length(); i++) {
            // because I can't compare/use contain with char,
            // make the char inside a string first
            // then check if the other string contain the new string of char

            String letterChar = "" + this.word.charAt(i); // start at 'K'
            if (this.guessedLetters.contains(letterChar)) {
                hiddenWord += letterChar;
            } else if (!this.guessedLetters.contains(letterChar)) {
                hiddenWord += '_';
            }
        }

        return hiddenWord;
    }
}

// you can't compare a char with a string explicitely
// make it into a string first, then compare them.
