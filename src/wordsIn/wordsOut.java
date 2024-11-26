package wordsIn;

import java.util.Scanner;

public class wordsOut {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Konstruktor
        wordsIn wordsIn = new wordsIn();

        System.out.println("Varsegod och skriv in ord! Avsluta med 'stop'.");

        //Kollar om användarens input är lika med stop.
        while (true) {
            String input = scan.nextLine();

            if (wordsIn.checkStop(input)) {
                break;
            }
            wordsIn.lineCount();
            wordsIn.wordCount(input);
            wordsIn.charCount(Integer.parseInt(input));
        }
        //Skriver ut de olika variablerna
        wordsIn.printAll();

    }
}
