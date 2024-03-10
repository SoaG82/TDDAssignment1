package TDD1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    public void testAToMorseCode() {
        Logic logic = new Logic();
        String testdata = "A";
        String expected = ".-";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);

    }

    @Test
    public void testMorseCodeToA() {
        Logic2 logic2 = new Logic2();
        String testdata2 = ".-";
        String expected = "A";
        String actual = logic2.getLetterMap(testdata2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSOS() {
        Logic logic = new Logic();
        String testdata = "SOS"; // Testar SOS utan mellanslag
        String expected = "... --- ...";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testLowerCase() {
        Logic logic = new Logic();
        String testdata = "s"; // testar liten bokstav
        String expected = "...";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToSOS() {
        Logic2 logic = new Logic2();
        String testdata = "... --- ...";
        assertEquals("SOS", logic.getLetterMap(testdata));
    }

    @Test
    public void testSpaces() {
        Logic logic = new Logic();
        String testdata = "S O S"; // Testar SOS med mellanslag mellan bokstäverna
        String expected = "... --- ...";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testSpaces2() {
        Logic2 logic = new Logic2();
        String testdata = "...---..."; // Testar morsekod utan mellanslag
        String expected = "Something went wrong"; // Borde returnera ett felmeddelande då den letar igenom logic2 klassen efter en kod som har dessa exakta tecken
        String actual = logic.getLetterMap(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputThatDoesNotExist() {
        Logic2 logic = new Logic2();
        String testdata = "&"; // testar ett tecken som inte finns
        String expected = "Something went wrong"; // Borde returnera ett felmeddelande då den letar igenom logic2 klassen efter en kod som har dessa exakta tecken
        String actual = logic.getLetterMap(testdata);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputThatDoesNotExist2() {
        Logic logic = new Logic();
        String testdata = "&"; // testar ett tecken som inte finns
        String expected = "";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputStartWithSpaces() {
        Logic logic = new Logic();
        String testdata = " S O S "; // testar mellanslag före och efter ett ord med mellanslag mellan bokstäverna i ordet
        String expected = "... --- ...";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputStartWithSpaces2() {
        Logic logic = new Logic();
        String testdata = " SOS "; // testar mellanslag före och efter ett ord
        String expected = "... --- ...";
        String actual = logic.getMorseCode(testdata);
        assertEquals(expected, actual);
    }
}
