package leetcode.test.test03;

public class _1275 {
    public String tictactoe(int[][] moves) {
        char[][] grid = new char[3][3];
        char player = 'A';

        for (int[] move : moves) {
            int row = move[0];
            int col = move[1];
            grid[row][col] = player;
            if (checkWinner(grid, player)) {
                return String.valueOf(player);
            }
            player = (player == 'A') ? 'B' : 'A';
        }

        if (moves.length == 9) {
            return "Draw";
        } else {
            return "Pending";
        }

    }

    private static boolean checkWinner(char[][] grid, char player) {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == player && grid[i][1] == player && grid[i][2] == player) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (grid[0][i] == player && grid[1][i] == player && grid[2][i] == player) {
                return true;
            }
        }

        if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
            return true;
        }
        if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        _1275 v = new _1275();
        System.out.println(v.tictactoe(moves));
    }

}
