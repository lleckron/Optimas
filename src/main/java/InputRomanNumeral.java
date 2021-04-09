import java.util.Scanner;

public class InputRomanNumeral {

    public InputRomanNumeral(){

    }
    public String enterRomanNumeral() {
        String romanNumeral;
        System.out.println("Enter up to 10 roman numerals. Their value will be calculated.");
        do {
            Scanner scanner = new Scanner(System.in);
            romanNumeral = scanner.nextLine();
            if (!romanNumeralBelow3000(romanNumeral)) {
                romanNumeral = "";
            }
        } while(romanNumeral.isEmpty());
        return romanNumeral;
    }

    public Boolean romanNumeralBelow3000(String romanNumeral) {
        if ((romanNumeral.length() > 3) && (romanNumeral.contains("MMM"))) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if ((romanNumeral.length() > 6) && (romanNumeral.contains("DDDDDD"))) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if ((romanNumeral.length() > 4) && (romanNumeral.contains("MMDD") || romanNumeral.contains("MDMD") ||
                romanNumeral.contains("MDDM") || romanNumeral.contains("DDMM") || romanNumeral.contains("DMDM") ||
                romanNumeral.contains("DMMD"))) {

            System.err.println("The roman numeral you have entered is over 3000. Please enter another roman numeral.");
            return false;
        } else if (romanNumeral.length() > 10) {
            System.err.println("You have entered too many roman numerals. Please enter another roman numeral.");
            return false;
        } else {
            return true;
        }
    }
}
