package leetcode.easy;

public class _14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }


    public static void main(String[] args) {
        _14 v = new _14();
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(v.longestCommonPrefix(arr));
    }
}
