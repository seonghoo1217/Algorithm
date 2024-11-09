package baekjun.solved.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _14248 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] jumpDistances = new int[n + 1];

        String[] distances = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            jumpDistances[i] = Integer.parseInt(distances[i - 1]);
        }

        int start = Integer.parseInt(br.readLine());

        int reachableCount = bfs(start, n, jumpDistances);

        System.out.println(reachableCount);
    }

    public static int bfs(int start, int n, int[] jumpDistances) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            int left = current - jumpDistances[current];
            int right = current + jumpDistances[current];

            if (left >= 1 && !visited[left]) {
                visited[left] = true;
                queue.offer(left);
            }
            if (right <= n && !visited[right]) {
                visited[right] = true;
                queue.offer(right);
            }
        }
        return count;
    }
}
