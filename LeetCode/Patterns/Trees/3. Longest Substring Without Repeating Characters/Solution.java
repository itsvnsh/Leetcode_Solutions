class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> longc = new HashSet<>();
        int count = 0;
        int left = 0;

        for (int i = 0; i < n; i++) {
            if (!longc.contains(s.charAt(i))) {
                longc.add(s.charAt(i));
            } else {
                while (longc.contains(s.charAt(i))) {
                    longc.remove(s.charAt(left));
                    left++;
                }
                longc.add(s.charAt(i));
            }

            count = Math.max(count, i - left + 1);
        }

        return count;
    }
}