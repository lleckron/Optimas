import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumeralEntry {

    @Test
    public void TestRomanNumeralBelow3000() {
        InputRomanNumeral inputRomanNumeral = new InputRomanNumeral();
        String romanNumeral = null;
        boolean testBoolean = inputRomanNumeral.romanNumeralBelow3000(romanNumeral);
        Assertions.assertEquals(false, testBoolean);
    }

}
