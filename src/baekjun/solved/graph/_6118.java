package baekjun.solved.graph;

import java.io.*;
import java.util.*;

public class _6118 {

    /*6 7
            3 6
            4 3
            3 2
            1 3
            1 2
            2 4
            5 2*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer>[] graph = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int[] distance = new int[N + 1];
        Arrays.fill(distance, -1);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        distance[1] = 0;


        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : graph[current]) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[current] + 1;
                    queue.offer(neighbor);
                }
            }
        }

        int maxDistance = 0;
        int maxBarn = 0;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (distance[i] > maxDistance) {
                maxDistance = distance[i];
                maxBarn = i;
                count = 1;
            } else if (distance[i] == maxDistance) {
                count++;
                if (i < maxBarn) {
                    maxBarn = i;
                }
            }
        }

        System.out.println(maxBarn + " " + maxDistance + " " + count);
    }
}
