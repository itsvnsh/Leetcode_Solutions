import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        Hashtable<Character, Integer> table = new Hashtable<>();
        int n = s.length();
        int left = 0;
        int maxi = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            table.put(c, table.getOrDefault(c, 0) + 1);
            int windowsize = right - left + 1;
            while(true) {
                Map.Entry<Character, Integer> maxfreq =
                    Collections.max(table.entrySet(),
                                    Map.Entry.comparingByValue());

                if (windowsize - maxfreq.getValue() <= k) {
                    break;
                }
                char rem = s.charAt(left);
                table.put(rem, table.get(rem) - 1);
                if (table.get(rem) == 0) {
                    table.remove(rem);
                }
                left++;
                windowsize = right - left + 1;
            }
            maxi = Math.max(maxi, windowsize);
        }

        return maxi;
    }
}