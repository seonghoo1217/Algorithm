package leetcode.easy;

public class _9 {
    public boolean isPalindrome(int x) {
        char[] numCharr = String.valueOf(x).toCharArray();
        int left = 0;
        int right = numCharr.length - 1;
        while (left < right) {
            if (left == right) break;
            if (numCharr[left] != numCharr[right])
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        _9 v = new _9();
        boolean palindrome = v.isPalindrome(121);
        System.out.println(palindrome);
    }
}
