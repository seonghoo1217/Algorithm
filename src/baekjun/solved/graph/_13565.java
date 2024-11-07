package baekjun.solved.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13565 {
    static char[][] map;
    static boolean[][] visited;
    static int M, N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new char[M][N];
        visited = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        
        if (canPercolate()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean canPercolate() {
        for (int j = 0; j < N; j++) {
            if (map[0][j] == '0' && !visited[0][j]) {
                if (dfs(0, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int x, int y) {
        if (x == M - 1) {
            return true;
        }

        visited[x][y] = true;

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N && map[nx][ny] == '0' && !visited[nx][ny]) {
                if (dfs(nx, ny)) {
                    return true;
                }
            }
        }
        return false;
    }
}
