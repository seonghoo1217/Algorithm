package leetcode.test.test04;

public class _1856 {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        int mod = (int) (1e9 + 7);

        if (n == 1) return (int) (((long) nums[0] * (long) nums[0]) % mod);

        int[] left = new int[n];
        left[0] = -1;

        for (int i = 1; i < n; i++) {
            int p = i - 1;

            while (p >= 0 && nums[p] >= nums[i])
                p = left[p];
            left[i] = p;
        }

        int[] right = new int[n];
        right[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            int p = i + 1;

            while (p < n && nums[p] >= nums[i])
                p = right[p];
            right[i] = p;

        }

        long res = 0L;
        long[] preSum = new long[n];

        preSum[0] = (long) nums[0];

        for (int i = 1; i < n; i++) {
            preSum[i] = preSum[i - 1] + (long) nums[i];
        }

        for (int i = 0; i < n; i++) {
            long sum = left[i] == -1 ? preSum[right[i] - 1] : preSum[right[i] - 1] - preSum[left[i]];
            long cur = (long) nums[i] * sum;
            res = Math.max(cur, res);
        }

        return (int) (res % mod);
    }
}
