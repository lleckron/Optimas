import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumeralFunctions {
    InputRomanNumeral inputRomanNumeral = new InputRomanNumeral();
    RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();
    @Test
    public void TestRomanNumeralBelow3000() {
        String romanNumeral = "MDXIDXIDD";
        boolean testBoolean = inputRomanNumeral.romanNumeralBelow3000(romanNumeral);
        Assertions.assertFalse(testBoolean);
    }

    @Test
    public void TestRomanNumeralStringBelowTenChars() {
        String romanNumeral = "IIIIIIIIIII";
        boolean testBoolean = inputRomanNumeral.romanNumeralBelow3000(romanNumeral);
        Assertions.assertFalse(testBoolean);
    }

    @Test
    public void TestInvalidCharacterInput() {
        String romanNumeral = "this is a sentence not a roman numeral 1234567890";
        boolean testBoolean = inputRomanNumeral.romanNumeralBelow3000(romanNumeral);
        Assertions.assertFalse(testBoolean);
    }

    @Test
    public void TestRomanNumeralCalculator() {
        String romanNumeral = "XLVII";
        int total = romanNumeralCalculator.calculateRomanNumeralString(romanNumeral);
        Assertions.assertEquals(67,total);
    }
}