package baekjun.solved.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2468 {
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        int maxSafeAreas = 0;

        for (int h = 0; h <= 100; h++) {
            visited = new boolean[N][N];
            int safeAreaCount = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] > h && !visited[i][j]) {
                        dfs(i, j, h);
                        safeAreaCount++;
                    }
                }
            }
            maxSafeAreas = Math.max(maxSafeAreas, safeAreaCount);
        }

        System.out.println(maxSafeAreas);
    }

    private static void dfs(int x, int y, int h) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] > h && !visited[nx][ny]) {
                    dfs(nx, ny, h);
                }
            }
        }
    }
}
