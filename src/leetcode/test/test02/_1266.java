package leetcode.test.test02;

public class _1266 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int totalMoveCnt = 0;

        for (int i = 1; i < points.length; i++) {
            int xMove = Math.abs(points[i][0] - points[i - 1][0]);
            int yMove = Math.abs(points[i][1] - points[i - 1][1]);
            totalMoveCnt += Math.max(xMove, yMove);
        }
        return totalMoveCnt;
    }


    public static void main(String[] args) {
        _1266 v = new _1266();
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(v.minTimeToVisitAllPoints(points));
    }
}
