package leetcode.easy;

import java.util.Stack;

public class _20 {
    static Stack<Character> stack = new Stack<>();

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[]}";
        _20 v = new _20();
        System.out.println(v.isValid(s));
        System.out.println(stack);
    }
}
