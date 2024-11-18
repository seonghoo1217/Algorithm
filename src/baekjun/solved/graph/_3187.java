package baekjun.solved.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _3187 {
    /*
    6 6
            ...#..
            .##v#.
            #v.#.#
            #.k#.#
            .###.#
            ...###*/
    static int R, C;

    static char[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[][] visited;
    static int sheepResult = 0;
    static int wolfResult = 0;

    static class Point {
        int r;
        int c;

        Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && map[i][j] != '#') {
                    bfs(new Point(i, j));
                }
            }
        }
        System.out.println(sheepResult + " " + wolfResult);
    }

    private static void bfs(Point point) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(point);
        visited[point.r][point.c] = true;
        int wolfCnt = 0;
        int sheepCnt = 0;
        while (!queue.isEmpty()) {
            Point point2 = queue.poll();
            int r = point2.r;
            int c = point2.c;
            if (map[r][c] == 'k') {
                sheepCnt++;
            } else if (map[r][c] == 'v') {
                wolfCnt++;
            }
            for (int i = 0; i < 4; i++) {
                int r2 = point2.r + dx[i];
                int c2 = point2.c + dy[i];
                if ((r2 > 0 && r2 < R && c2 > 0 && c2 < C) && !visited[r2][c2] && map[r2][c2] != '#') {
                    visited[r2][c2] = true;
                    queue.offer(new Point(r2, c2));
                }
            }
        }
        if (sheepCnt > wolfCnt) {
            sheepResult += sheepCnt;
        } else {
            wolfResult += wolfCnt;
        }
    }
}
