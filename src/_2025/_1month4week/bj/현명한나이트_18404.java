package _2025._1month4week.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 현명한나이트_18404 {
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
    static int[][] dist;
    static boolean[][] visited;
    static int n;
    static List<int[]> enemies;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        dist = new int[n + 1][n + 1];
        visited = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], -1);
        }

        dist[x][y] = 0;

        enemies = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());
            enemies.add(new int[]{ex, ey});
        }

        bfs(x, y);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int ex = enemies.get(i)[0];
            int ey = enemies.get(i)[1];
            sb.append(dist[ex][ey]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    static void bfs(int sx, int sy) {
        Queue<int[]> queue = new LinkedList<>();
        dist[sx][sy] = 0;
        queue.add(new int[]{sx, sy});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 1 || nx > n || ny < 1 || ny > n) {
                    continue;
                }
                if (dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[cx][cy] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
