package baekjun.solved.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1325 {
    static List<List<Integer>> trustGraph;
    static boolean[] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        trustGraph = new ArrayList<>();

        for (int i = 0; i <= N; i++) {
            trustGraph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] relation = br.readLine().split(" ");
            int A = Integer.parseInt(relation[0]);
            int B = Integer.parseInt(relation[1]);
            trustGraph.get(B).add(A);
        }

        int maxCount = 0;
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            int count = bfs(i);
            if (count > maxCount) {
                maxCount = count;
                result.clear();
                result.add(i);
            } else if (count == maxCount) {
                result.add(i);
            }
        }

        Collections.sort(result);
        for (int computer : result) {
            System.out.print(computer + " ");
        }

    }

    public static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            for (int neighbor : trustGraph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return count - 1; // 자신은 세지 않음
    }
}
