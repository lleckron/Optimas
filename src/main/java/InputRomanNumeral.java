import com.google.common.base.CharMatcher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputRomanNumeral {

    public InputRomanNumeral() {

    }

    public String enterRomanNumeral() {
        String romanNumeral;
        System.out.println("Enter up to 10 roman numerals. Their value will be calculated.");
        do {
            Scanner scanner = new Scanner(System.in);
            romanNumeral = scanner.nextLine().toUpperCase();
            if (!romanNumeralBelow3000(romanNumeral)) {
                romanNumeral = "";
            }
        } while (romanNumeral.isEmpty());
        return romanNumeral;
    }

    public Boolean romanNumeralBelow3000(String romanNumeral) {
        int countM = CharMatcher.is('M').countIn(romanNumeral);
        int countD = CharMatcher.is('D').countIn(romanNumeral);
        if (romanNumeral.length() > 10) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if ((countD == 6) && (romanNumeral.length() > 6)) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if ((countM == 2) && (countD == 2) && (romanNumeral.length() > 4)) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if ((countM == 1) && (countD == 4) && (romanNumeral.length() > 5)) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if ((countM == 3) && (romanNumeral.length() > 3))  {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else {
            return true;
        }
    }
}