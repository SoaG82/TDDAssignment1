package TDD1;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;


public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        Logic2 logic2 = new Logic2();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Write a sentence, letter, number or a Morse code (dots and dashes). (Writing 'stoppa' will exit the program): ");
                String input = scanner.nextLine().trim(); // trimmar ner input från whitespaces och konverterar till stora bokstäver

                StringBuilder output = new StringBuilder();

                if (input.matches("^[ .-]+$")) { // kollar ifall input matchar mellanslag, punkt eller minustecken och kallar i så fall på logic2 klassens get metod och skriver ut morse kod till bokstäver.
                    String morseCode = logic2.getLetterMap(input);
                        output.append(morseCode);
                } else { // Bokstäver och siffror till Morse kod
                    String morseCode = logic.getMorseCode(input.toUpperCase()); // kallar på första logik klassen och gör om bokstäver till morse kod samt gör att små bokstäver läses som även stora bokstäver (.toUppercase()).
                        output.append(morseCode);
                    }
                    if (input.matches("stoppa")) {
                        break;
                    }
                System.out.println("The result is: " + output); // skriver ut input i konsolen.
            } catch (NullPointerException e) {

            } catch (PatternSyntaxException e) {

            } catch (NoSuchElementException e) {

            }
        }
    }
}


/*

Skapa ett program utifrån Krav som står på nästa slide

Lämna in en textfil där länken till ditt publika github-repo finns tillgängligt


Krav:

Skriv ett program som gör om morsekod till engelska och engelska till morsekod

Skriv programmet med minst en logikklass samt en klass som läser in text och
skriver ut text (med en main-metod)

Använd den internationella morsekoden (se slide 4)

Utveckla programmet i TDD och skriv minst 3 JUnit-testfall

Skapa minst två felhanteringar i systemet som fångar två saker som användaren kan göra
som går utanför det vanliga användandet av systemet


 */