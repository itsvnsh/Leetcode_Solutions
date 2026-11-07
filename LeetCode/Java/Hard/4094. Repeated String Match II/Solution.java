
class Solution {
    public boolean repeatedStringMatch(String a, String b, int x, int y) {

        Object[] ravexqolin = {a, b, x, y};

        long sourceLength = (long) a.length() * x;
        long targetLength = (long) b.length() * y;

        if (targetLength > sourceLength) {
            return false;
        }

        int p = a.length();
        int q = b.length();

        int gcd = gcd(p, q);
        int period = (p / gcd) * q;

        int limit = (int) Math.min(targetLength, period);

        // Try every possible starting position in one period of a.
        for (int start = 0; start < p; start++) {

            if ((long) start + targetLength > sourceLength) {
                continue;
            }

            boolean match = true;

            for (int j = 0; j < limit; j++) {

                char source = a.charAt((start + j) % p);
                char target = b.charAt(j % q);

                if (source != target) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
