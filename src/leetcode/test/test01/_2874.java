package leetcode.test.test01;

public class _2874 {
    public int maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Initialize leftMax
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i - 1]);
        }

        // Initialize rightMax
        rightMax[n - 1] = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i + 1]);
        }

        // Calculate the maximum value of the triplet
        int maxTripletValue = Integer.MIN_VALUE;
        for (int j = 1; j < n - 1; j++) {
            if (leftMax[j] != Integer.MIN_VALUE && rightMax[j] != Integer.MIN_VALUE) {
                maxTripletValue = Math.max(maxTripletValue, (leftMax[j] - nums[j]) * rightMax[j]);
            }
        }

        // If no valid triplet was found, return 0
        return maxTripletValue < 0 ? 0 : maxTripletValue;
    }


    /*public long findMaxMinus(int[] nums, Long value_max) {
        Integer max = Integer.MIN_VALUE;
        int[] temp = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] - nums[k] > max && i < k) {
                    max = nums[i] - nums[k];
                    temp[0] = i;
                    temp[1] = k;
                }
            }
        }

        int second = findSecond(nums, temp);
        return (long) (nums[temp[0]] - nums[temp[1]]) * second;
    }

    public int findSecond(int[] nums, int[] temp) {
        int used1 = temp[0];
        int used2 = temp[1];
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (used1 < i && used2 < i) {
                max = Math.max(max, nums[i]);
            } else {
                continue;
            }
        }

        return max;
    }*/

    public static void main(String[] args) {
        _2874 v = new _2874();
        int[] arr = {6, 11, 12, 12, 7, 9, 2, 11, 12, 4, 19, 14, 16, 8, 16};
        System.out.println(v.maximumTripletValue(arr));
    }
}
