public class Main {

    public static void main(String[] args) {
        // HangmanLogic logic = new HangmanLogic("parameter");
        // HangmanUserInterface game = new HangmanUserInterface(logic);
        HangmanLogic pandu = new HangmanLogic("kissa");
        HangmanUserInterface game = new HangmanUserInterface(pandu);
        game.start();
        System.out.println("word is: " + pandu.hiddenWord());

        System.out.println("guessing: A, D, S, F, D");
        pandu.guessLetter("A"); // correct
        pandu.guessLetter("D"); // wrong
        pandu.guessLetter("S"); // correct
        pandu.guessLetter("F"); // wrong
        pandu.guessLetter("D"); // This should not have any effect on the number of
        // faults since D was already
        // guessed
        System.out.println("guessed letters: " + pandu.guessedLetters());
        System.out.println("number of faults: " + pandu.numberOfFaults());
        System.out.println("word now: " + pandu.hiddenWord());
    }
}