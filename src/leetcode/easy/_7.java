package leetcode.easy;

public class _7 {
    public int reverse(int x) {
        /*if (x < 0) {
            return -Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString());
        }
        return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());*/
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }


    public static void main(String[] args) {
        _7 v = new _7();
        System.out.println(v.reverse(-123));
    }
}
