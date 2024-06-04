package leetcode.test.test04;

public class _1800 {
    public int maxAscendingSum(int[] nums) {
        int currIndex = 0;
        int max = 0;
        int loopSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > currIndex) {
                loopSum += nums[i];
                currIndex = nums[i];
            } else {
                loopSum = nums[i];
                currIndex = nums[i];
            }
            max = Math.max(max, loopSum);
        }

        return max;
    }
}
