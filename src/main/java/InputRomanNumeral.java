import com.google.common.base.CharMatcher;

import java.util.Scanner;

public class InputRomanNumeral {
    public InputRomanNumeral() {
    }

    public String enterRomanNumeral() {
        String romanNumeral;
        System.out.println("Enter up to 10 roman numerals. Their value will be calculated:");
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
        CharSequence INVALID_INPUT = "ABEFGHJKNOPQRSTUWYZ 0123456789,./;':\"\\[\\]\\{\\}=+-_)(*&^%$#@!";
        boolean invalid = CharMatcher.anyOf(INVALID_INPUT).matchesAnyOf(romanNumeral);
        if(invalid){
            System.err.println("You have entered an invalid character. Please enter only roman numerals:");
            return false;
        }

        /*
        Since only 10 characters can be entered, M and D are the only roman numerals capable of making the total pass
        3000. So only the counts for M and D are calculated to ensure the number does not reach past 3000.
         */

        int countM = CharMatcher.is('M').countIn(romanNumeral);
        int countD = CharMatcher.is('D').countIn(romanNumeral);
        if (romanNumeral.length() > 10) {
            System.err.println("You have entered more than 10 characters. Please enter another roman numeral:");
            return false;
        } else if ((countD >= 6) && (romanNumeral.length() > 6)) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral:");
            return false;
        } else if ((countM >= 2) && (countD >= 2) && (romanNumeral.length() > 4)) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral:");
            return false;
        } else if ((countM >= 1) && (countD >= 4) && (romanNumeral.length() > 5)) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral:");
            return false;
        } else if ((countM >= 3) && (romanNumeral.length() > 3))  {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral:");
            return false;
        } else {
            return true;
        }
    }
}