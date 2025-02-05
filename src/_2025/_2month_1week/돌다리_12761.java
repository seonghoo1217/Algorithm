package _2025._2month_1week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 돌다리_12761 {
    static class Pair {
        int position;
        int moves;

        public Pair(int position, int moves) {
            this.position = position;
            this.moves = moves;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        final int MAX = 100000;
        boolean[] visited = new boolean[MAX + 1];

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(N, 0));
        visited[N] = true;


        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int pos = current.position;
            int moves = current.moves;

            if (pos == M) {
                System.out.println(moves);
                return;
            }

            int[] nextPositions = {
                    pos + 1,
                    pos - 1,
                    pos + A,
                    pos - A,
                    pos + B,
                    pos - B,
                    pos * A,
                    pos * B
            };

            for (int next : nextPositions) {
                if (next >= 0 && next <= MAX && !visited[next]) {
                    visited[next] = true;
                    queue.add(new Pair(next, moves + 1));
                }
            }
        }
    }
}
