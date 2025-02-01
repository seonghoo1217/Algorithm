package _2025._1month4week.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 맥주마시면서걸어가기_9205 {
    static int t, n, dist[][];
    static boolean visit[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            dist = new int[n + 2][2];
            visit = new boolean[n + 2];

            for (int i = 0; i < n + 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                dist[i][0] = Integer.parseInt(st.nextToken());
                dist[i][1] = Integer.parseInt(st.nextToken());
            }

            bfs(0);
        }
    }

    static void bfs(int index) {
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        visit[index] = true;

        while (!q.isEmpty()) {
            int p = q.poll();

            if (p == n + 1) {
                System.out.println("happy");
                return;
            }
            for (int i = 1; i < n + 2; i++) {
                if (!visit[i]) {
                    int distance = Math.abs(dist[p][0] - dist[i][0])
                            + Math.abs(dist[p][1] - dist[i][1]);
                    if (distance <= 1000) {
                        visit[i] = true;
                        q.add(i);
                    }
                }
            }
        }
        System.out.println("sad");
    }
}
