package TDD1;

import java.util.HashMap;
import java.util.Map;
public class Logic2 {
    Map<String , String> letters; // skapar en HashMap

    // HashMap för Morse kod till bokstäver och siffror
    public Logic2() {
        letters = new HashMap<>();
        letters.put(".-", "A");
        letters.put("-...", "B");
        letters.put("-.-.", "C");
        letters.put("-..", "D");
        letters.put(".", "E");
        letters.put("..-.", "F");
        letters.put("--.", "G");
        letters.put("....", "H");
        letters.put("..", "I");
        letters.put(".---", "J");
        letters.put("-.-", "K");
        letters.put(".-..", "L");
        letters.put("--", "M");
        letters.put("-.", "N");
        letters.put("---", "O");
        letters.put(".--.", "P");
        letters.put("--.-", "Q");
        letters.put(".-.", "R");
        letters.put("...", "S");
        letters.put("-", "T");
        letters.put("..-", "U");
        letters.put("...-", "V");
        letters.put(".--", "W");
        letters.put("-..-", "X");
        letters.put("-.--", "Y");
        letters.put("--..", "Z");
        letters.put(".----", "1");
        letters.put("..---", "2");
        letters.put("...--", "3");
        letters.put("....-", "4");
        letters.put(".....", "5");
        letters.put("-....", "6");
        letters.put("--...", "7");
        letters.put("---..", "8");
        letters.put("----.", "9");
        letters.put("-----", "0");
        letters.put(".-.-.-", ".");
        letters.put("--..--", ",");
        letters.put("..--..", "?");
    }

    // läser in och returnerar bokstäver och siffror från morsekod

    public String getLetterMap(String testdata2) {
        String[] symbols = testdata2.split(" ");
        StringBuilder result = new StringBuilder();
        for (String symbol : symbols) {
            String letter = letters.get(symbol);
            if (letter != null) {
                result.append(letter);
            } else {
                return "Something went wrong";
            }
        }
        return result.toString();
    }
}
