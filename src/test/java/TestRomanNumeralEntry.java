import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumeralEntry {

    @Test
    public void TestRomanNumeralBelow3000() {
        InputRomanNumeral inputRomanNumeral = new InputRomanNumeral();
        String romanNumeral = "MDXIDXIDD";
        boolean testBoolean = inputRomanNumeral.romanNumeralBelow3000(romanNumeral);
        Assertions.assertFalse(testBoolean);
    }

    @Test
    public void TestRomanNumeralStringBelowTenChars() {
        InputRomanNumeral inputRomanNumeral = new InputRomanNumeral();
        String romanNumeral = "IIIIIIIIIII";
        boolean testBoolean = inputRomanNumeral.romanNumeralBelow3000(romanNumeral);
        Assertions.assertFalse(testBoolean);
    }

}
