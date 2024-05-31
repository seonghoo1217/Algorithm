package leetcode.test.test02;

public class _1582 {
    public static int numSpecial(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] rowSum = new int[rows];
        int[] colSum = new int[cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowSum[i]++;
                    colSum[j]++;
                }
            }
        }

        int specialCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j] == 1) {
                    specialCount++;
                }
            }
        }

        return specialCount;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}};
        System.out.println(numSpecial(mat1));
    }
}
