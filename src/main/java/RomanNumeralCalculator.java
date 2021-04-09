import com.google.common.base.CharMatcher;

public class RomanNumeralCalculator {

    public RomanNumeralCalculator(){
    }

    public int calculateRomanNumeralString(String romanNumeral) {
        final int M = 1000;
        final int D = 500;
        final int C = 100;
        final int L = 50;
        final int X = 10;
        final int V = 5;
        final int I = 1;
        int total;
        int countM = CharMatcher.is('M').countIn(romanNumeral);
        int M_Total = M * countM;
        int countD = CharMatcher.is('D').countIn(romanNumeral);
        int D_Total = D * countD;
        int countC = CharMatcher.is('C').countIn(romanNumeral);
        int C_Total = C * countC;
        int countL = CharMatcher.is('L').countIn(romanNumeral);
        int L_Total = L * countL;
        int countX = CharMatcher.is('X').countIn(romanNumeral);
        int X_Total = X * countX;
        int countV = CharMatcher.is('V').countIn(romanNumeral);
        int V_Total = V * countV;
        int countI = CharMatcher.is('I').countIn(romanNumeral);
        int I_Total = I * countI;
        total = M_Total + D_Total + C_Total + L_Total + X_Total + V_Total + I_Total;
        return total;
    }

    public static void main(String[] args) {
        InputRomanNumeral inputRomanNumeral = new InputRomanNumeral();
        RomanNumeralCalculator romanNumeralCalculator = new RomanNumeralCalculator();

        String romanNumeral = inputRomanNumeral.enterRomanNumeral();
        int romanNumeralTotal = romanNumeralCalculator.calculateRomanNumeralString(romanNumeral);
        System.out.println("Original Roman Numeral String: " + romanNumeral
                            + "\nRepresented as an Integer: " + romanNumeralTotal);
    }
}
