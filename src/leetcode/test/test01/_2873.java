package leetcode.test.test01;

public class _2873 {
    public long maximumTripletValue(int[] nums) {
        Long max = Long.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    max = Math.max(max, (long) (nums[i] - nums[j]) * nums[k]);
                }
            }
        }
        return max < 0 ? 0 : max;
    }


    public static void main(String[] args) {
        _2873 v = new _2873();
        int[] arr = {1000000, 1, 1000000};
        System.out.println(v.maximumTripletValue(arr));
    }
}
