package roman_num;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int convertRomanToInt(String romanNumeral) {
        // Create a map of Roman numerals to their corresponding integer values.
        Map<Character, Integer> romanNumeralMap = new HashMap<>();
        romanNumeralMap.put('I', 1);
        romanNumeralMap.put('V', 5);
        romanNumeralMap.put('X', 10);
        romanNumeralMap.put('L', 50);
        romanNumeralMap.put('C', 100);
        romanNumeralMap.put('D', 500);
        romanNumeralMap.put('M', 1000);

        // Iterate over the Roman numeral string, and for each character, look up its value in the map.
        int integerValue = 0;
        int previousValue = 0;
        for (char character : romanNumeral.toCharArray()) {
            int currentValue = romanNumeralMap.get(character);
            if (currentValue > previousValue) {
                integerValue -= previousValue;
            }
            integerValue += currentValue;
            previousValue = currentValue;
        }

        // Return the total integer value.
        return integerValue;
    }

    public static void main(String[] args) {
        String romanNumeral = "IX";
        int integerValue = convertRomanToInt(romanNumeral);

        System.out.println("The integer value of the Roman numeral \"" + romanNumeral + "\" is " + integerValue);
    }
}