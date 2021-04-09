import java.util.Scanner;

public class InputRomanNumeral {

    public InputRomanNumeral(){

    }
    public String enterRomanNumeral() {
        String romanNumeral;
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
        System.out.println("Enter up to 10 roman numerals. Their value will be calculated.");
        if ((romanNumeral.length() > 3) && (romanNumeral.startsWith("MMM"))) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another number.");
            return false;
        } else if((romanNumeral.length() > 6) && (romanNumeral.startsWith("DDDDDD"))) {
            System.err.println("The roman numeral you have entered is over 3000. Please enter another number.");
            return false;
        } else if (romanNumeral.length() > 10) {
            System.err.println("You have entered too many roman numerals. Please enter another number.");
            return false;
        } else {
            return true;
        }
    }
}
