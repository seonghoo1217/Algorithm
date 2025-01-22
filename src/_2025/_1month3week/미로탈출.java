package _2025._1month3week;

import java.util.LinkedList;
import java.util.Queue;

public class 미로탈출 {
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        char[][] map = new char[n][m];

        int startX = 0, startY = 0, leverX = 0, leverY = 0, exitX = 0, exitY = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = maps[i].charAt(j);
                if (map[i][j] == 'S') {
                    startX = i;
                    startY = j;
                } else if (map[i][j] == 'L') {
                    leverX = i;
                    leverY = j;
                } else if (map[i][j] == 'E') {
                    exitX = i;
                    exitY = j;
                }
            }
        }
        int toLever = bfs(map, startX, startY, leverX, leverY, n, m);
        if (toLever == -1) return -1;

        int toExit = bfs(map, leverX, leverY, exitX, exitY, n, m);
        if (toExit == -1) return -1;

        return toLever + toExit;
    }


    private int bfs(char[][] map, int startX, int startY, int targetX, int targetY, int n, int m) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int dist = current[2];

            // 목표 지점에 도달했는지 확인
            if (x == targetX && y == targetY) {
                return dist;  // 도달했으면 즉시 dist 반환
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m
                        && !visited[nx][ny] && map[nx][ny] != 'X') {
                    queue.add(new int[]{nx, ny, dist + 1});
                    visited[nx][ny] = true;
                }
            }
        }
        // 큐가 빌 때까지 목표를 찾지 못하면 -1 반환
        return -1;
    }
}
