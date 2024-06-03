package leetcode.test.test03;

public class _2280 {
    public int minimumLines(int[][] stockPrices) {
        int x = stockPrices[0][0];
        int y = stockPrices[0][1];
        int cnt = 1;
        String currType = "";

        if (x - y == 0) {
            currType = "wide";
        } else {
            currType = "cross";
        }


        for (int i = 1; i < stockPrices.length; i++) {
            int curX = stockPrices[i][0];
            int curY = stockPrices[i][1];

            if (Math.abs(curX - x) == 1 && Math.abs(curY - y) == 1) {
                x = curX;
                y = curY;
            } else if (Math.abs(curX - x) == 0 && Math.abs(curY - y) == 0) {
                x = curX;
                y = curY;
            } else {
                cnt++;
                x = curX;
                y = curY;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 7}, {2, 6}, {3, 5}, {4, 4}, {5, 4}, {6, 3}, {7, 2}, {8, 1}};
        _2280 v = new _2280();
        System.out.println(v.minimumLines(arr));
    }
}
