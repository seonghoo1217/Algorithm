package baekjun.solved.graph;

import java.util.Scanner;

public class _14176 {
    static int M, N;
    static int[][] banner;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        M = scanner.nextInt();
        N = scanner.nextInt();
        banner = new int[M][N];
        visited = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                banner[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (banner[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count); // 결과 출력
        scanner.close();
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (banner[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
