import java.util.*;

public class Solution {

    public static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0; // pointer for word
        int j = 0; // pointer for abbreviation

        while (i < word.length() && j < abbr.length()) {

            // If characters match, move both pointers
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }

            // If abbreviation character is not a digit, invalid
            if (!Character.isDigit(abbr.charAt(j))) {
                return false;
            }

            // Leading zero is invalid
            if (abbr.charAt(j) == '0') {
                return false;
            }

            // Parse the full number from abbreviation
            int num = 0;
            while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                num = num * 10 + (abbr.charAt(j) - '0');
                j++;
            }

            // Skip 'num' characters in word
            i += num;
        }

        // Both pointers should reach the end
        return i == word.length() && j == abbr.length();
    }

    public static void main(String[] args) {
        String word = "internationalization";
        String abbr = "i12iz4n";

        boolean result = validWordAbbreviation(word, abbr);
        System.out.println("Result: " + result); // Expected: true
    }
}

