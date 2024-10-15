package baekjun.solved;

import java.io.IOException;
import java.util.Scanner;

public class _1189 {
    static int R, C, K;
    static char[][] map;
    static boolean[][] visited;
    static int answer;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        R = scanner.nextInt();
        C = scanner.nextInt();
        K = scanner.nextInt();
        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String next = scanner.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = next.charAt(j);
            }
        }

        visited[R - 1][0] = true;

        dfs(R - 1, 0, 1);
        System.out.println(answer);
    }

    static void dfs(int r, int c, int move) {
        if (r == 0 && c == C - 1) {
            if (move == K) {
                answer++;
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            int newX = r + dx[i];
            int newY = c + dy[i];
            if (newX < 0 || newX >= R || newY < 0 || newY >= C) {
                continue;
            }
            if (visited[newX][newY] || map[newX][newY] == 'T') {
                continue;
            }

            visited[newX][newY] = true;
            dfs(newX, newY, move + 1);
            visited[newX][newY] = false;
        }
    }
}
