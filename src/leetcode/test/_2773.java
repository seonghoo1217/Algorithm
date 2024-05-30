package leetcode.test;

import java.util.Arrays;

public class _2773 {
    static Integer min = Integer.MAX_VALUE;
    static Integer max = Integer.MIN_VALUE;

    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        for (int n : nums) {
            if (n != min && n != max) {
                return n;
            }
        }

        return -1;
    }

    /*public boolean isMin(int num) {
        if (num < min) {
            min = num;
            return false;
        }
        return true;
    }

    public boolean isMax(int num) {
        if (num > max) {
            max = num;
            return false;
        }
        return true;
    }*/

    public static void main(String[] args) {
        _2773 v = new _2773();
        int[] arr = {1, 2};
        System.out.println(v.findNonMinOrMax(arr));
    }
}
