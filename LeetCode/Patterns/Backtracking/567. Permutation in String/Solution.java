
import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        Hashtable<Character, Integer> table1 = new Hashtable<>();
        Hashtable<Character, Integer> table2 = new Hashtable<>();

        int left = 0;
        int window = s1.length();

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            table1.put(c, table1.getOrDefault(c, 0) + 1);
        }

        // Sliding window through s2
        for (int right = 0; right < s2.length(); right++) {

            char c = s2.charAt(right);
            table2.put(c, table2.getOrDefault(c, 0) + 1);

            // Shrink window if it becomes too large
            if (right - left + 1 > window) {
                char removeChar = s2.charAt(left);

                table2.put(
                    removeChar,
                    table2.get(removeChar) - 1
                );

                if (table2.get(removeChar) == 0) {
                    table2.remove(removeChar);
                }

                left++;
            }

            // Compare character frequencies
            if (table1.equals(table2)) {
                return true;
            }
        }

        return false;
    }
}
