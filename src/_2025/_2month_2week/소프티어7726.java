package _2025._2month_2week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 소프티어7726 {
    static int N, M;
    static char[][] map;
    static int[][] ghostDist;
    static final int INF = Integer.MAX_VALUE;

    static final int[] dx = {-1, 0, 1, 0};
    static final int[] dy = {0, 1, 0, -1};

    static int startX, startY;
    static int exitX, exitY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        ghostDist = new int[N][M];

        for (int r = 0; r < N; r++) {
            Arrays.fill(ghostDist[r], INF);
        }

        Queue<int[]> ghostQueue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j);


                if (map[i][j] == 'N') {
                    startX = i;
                    startY = j;
                } else if (map[i][j] == 'D') {
                    exitX = i;
                    exitY = j;
                } else if (map[i][j] == 'G') {
                    ghostQueue.add(new int[]{i, j});
                    ghostDist[i][j] = 0;
                }
            }
        }

        bfsGhost(ghostQueue);

        boolean canEscape = bfsNamwoo();

        System.out.println(canEscape ? "Yes" : "No");
    }

    public static void bfsGhost(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];

            int dist = ghostDist[cx][cy];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;


                if (ghostDist[nx][ny] > dist + 1) {
                    ghostDist[nx][ny] = dist + 1;

                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }


    public static boolean bfsNamwoo() {
        int[][] distN = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(distN[i], INF);
        }

        distN[startX][startY] = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            int time = distN[cx][cy];

            if (cx == exitX && cy == exitY) {
                if (time < ghostDist[cx][cy]) {
                    return true;
                }
            }

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (map[nx][ny] == '#') continue;

                int nextTime = time + 1;

                if (nextTime < ghostDist[nx][ny]) {
                    if (distN[nx][ny] > nextTime) {
                        distN[nx][ny] = nextTime;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
        return false;
    }
}
