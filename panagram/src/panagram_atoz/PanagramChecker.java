package panagram_atoz;

import java.util.HashSet;
import java.util.Set;

public class PanagramChecker {
    public static boolean isPanagram(String string) {
        // Convert the string to lowercase.
        string = string.toLowerCase();

        // Create a set to store the unique characters in the string.
        Set<Character> uniqueCharacters = new HashSet<>();

        // Iterate over the string and add each character to the set.
        for (char character : string.toCharArray()) {
            uniqueCharacters.add(character);
        }

        // If the size of the set is 26, then the string is a panagram.
        return uniqueCharacters.size() == 26;
    }

    public static void main(String[] args) {
        String string = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPanagram(string);

        if (isPangram) {
            System.out.println("The string is not a pangram.");
        } else {
            System.out.println("The string is a pangram.");
        }
    }
}