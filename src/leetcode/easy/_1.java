package leetcode.easy;

public class _1 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            int value = nums[i];
            for (int k = i + 1; k < nums.length; k++) {
                if (value + nums[k] == target) {
                    answer[0] = i;
                    answer[1] = k;
                    return answer;
                }
            }
        }
        return answer;
    }

}
