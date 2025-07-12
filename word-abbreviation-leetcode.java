import java.util.*;


/**

Description
A string can be shortened by replacing any number of non-adjacent, non-empty substrings with their lengths (without leading zeros).

For example, the string "implementation" can be abbreviated in several ways, such as:

"i12n" -> ("i mplementatio n")
"imp4n5n" -> ("imp leme n tatio n")
"14" -> ("implementation")
"implemetation" -> (no substrings replaced)
Invalid abbreviations include:

"i57n" -> (i mplem entatio n, adjacent substrings are replaced.)
"i012n" -> (has leading zeros)
"i0mplementation" (replaces an empty substring)
You are given a string named word and an abbreviation named abbr, return true if abbr correctly abbreviates word, otherwise return false.

A substring is a contiguous non-empty sequence of characters within a string.

Example 1:

Input: word = "apple", abbr = "a3e"

Output: true
Example 2:

Input: word = "international", abbr = "i9l"

Output: false
Example 3:

Input: word = "abbreviation", abbr = "abbreviation"

Output: true
Constraints:

1 <= word.length <= 100
word is made up of only lowercase English letters.
1 <= abbr.length <= 100
abbr is made up of lowercase English letters and digits.
All digit-only substrings of abbr fit in a 32-bit integer.



**/

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

