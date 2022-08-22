package programers.level1;

public class 최소직사각형 {
    static class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max_width=0;
            int max_height=0;
            for (int i=0;i<sizes.length;i++){
                int width = Math.max(sizes[i][0], sizes[i][1]);
                int height = Math.min(sizes[i][0], sizes[i][1]);
                max_width = Math.max(max_width, width);
                max_height = Math.max(max_height, height);
            }
            return max_width*max_height;
        }
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[][] arr={{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        solution.solution(arr);
    }
}
