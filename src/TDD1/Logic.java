package TDD1;

import java.util.HashMap;
import java.util.Map;
public class Logic {
    Map<String, String> morseCode; // skapar en HashMap

    // Hashmap för bokstäver och siffror till Morse code
    public Logic() {
        morseCode = new HashMap<>();
        morseCode.put("A", ".-");
        morseCode.put("B", "-...");
        morseCode.put("C", "-.-.");
        morseCode.put("D", "-..");
        morseCode.put("E", ".");
        morseCode.put("F", "..-.");
        morseCode.put("G", "--.");
        morseCode.put("H", "....");
        morseCode.put("I", "..");
        morseCode.put("J", ".---");
        morseCode.put("K", "-.-");
        morseCode.put("L", ".-..");
        morseCode.put("M", "--");
        morseCode.put("N", "-.");
        morseCode.put("O", "---");
        morseCode.put("P", ".--.");
        morseCode.put("Q", "--.-");
        morseCode.put("R", ".-.");
        morseCode.put("S", "...");
        morseCode.put("T", "-");
        morseCode.put("U", "..-");
        morseCode.put("V", "...-");
        morseCode.put("W", ".--");
        morseCode.put("X", "-..-");
        morseCode.put("Y", "-.--");
        morseCode.put("Z", "--..");
        morseCode.put("1", ".----");
        morseCode.put("2", "..---");
        morseCode.put("3", "...--");
        morseCode.put("4", "....-");
        morseCode.put("5", ".....");
        morseCode.put("6", "-....");
        morseCode.put("7", "--...");
        morseCode.put("8", "---..");
        morseCode.put("9", "----.");
        morseCode.put("0", "-----");
        morseCode.put(".", ".-.-.-");
        morseCode.put(",", "--..--");
        morseCode.put("?", "..--..");


    }

    // läser in och returnerar morsekod från bokstäver och siffror
    public String getMorseCode(String testdata) {
        StringBuilder result = new StringBuilder();
        for (char c : testdata.toCharArray()) {
            String morseCode = this.morseCode.get(String.valueOf(c).toUpperCase());
            if (morseCode != null) {
                result.append(morseCode);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}