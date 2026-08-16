class Solution {
   public int myAtoi(String s) {

    long res = 0;
    boolean minus = false;
    boolean prev = false;

    s = s.trim();

    for (int i = 0; i < s.length(); i++) {

        char ch = s.charAt(i);

        // Sign
        if ((ch == '-' || ch == '+') && !prev && i == 0) {
            if (ch == '-') {
                minus = true;
            }
            prev = true;
            continue;
        }

        // Digit
        if (ch >= '0' && ch <= '9') {

            prev = true;

            int digit = ch - '0';

            res = res * 10 + digit;

            // Overflow
            if (!minus && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (minus && res > 2147483648L) {
                return Integer.MIN_VALUE;
            }

        } else {
            break;
        }
    }

    if (minus) {
        return (int) -res;
    }

    return (int) res;
}
}