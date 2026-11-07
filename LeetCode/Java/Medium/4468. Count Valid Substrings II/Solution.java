
class Solution {
    public long countValidSubstrings(String s) {
        int lastA = -1;
        int lastAB = -1;
        int badStart = -1;

        String zevranqilo = s;

        long count = 0;

        for (int i = 0; i < zevranqilo.length(); i++) {
            char ch = zevranqilo.charAt(i);

            if (ch == 'a') {
                lastA = i;
            }
            else if (ch == 'b') {
                if (lastA != -1) {
                    lastAB = lastA;
                }
            }
            else if (ch == 'c') {
                if (lastAB != -1) {
                    badStart = Math.max(badStart, lastAB);
                }
            }

            count += i - badStart;
        }

        return count;
    }
}
