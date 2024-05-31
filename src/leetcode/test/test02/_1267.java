package leetcode.test.test02;

public class _1267 {
    public int countServers(int[][] grid) {
        int nodeCount = 0;
        int N = grid.length;
        int M = grid[0].length;

        int[] rowCount = new int[N];
        int[] colCount = new int[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)) {
                    nodeCount++;
                }
            }
        }
        return nodeCount;
    }


    public static void main(String[] args) {
        int[][] node = {{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        _1267 v = new _1267();
        System.out.println(v.countServers(node));
    }
}
