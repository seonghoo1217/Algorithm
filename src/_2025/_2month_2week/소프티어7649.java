package _2025._2month_2week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 소프티어7649 {

    static class Edge {
        int to;
        char label;

        public Edge(int to, char label) {
            this.to = to;
            this.label = label;
        }
    }

    static int N, M;
    static String S;

    static List<Edge>[] adj;
    static List<Edge>[] children;

    static int[][] dp;
    static boolean[] visited;

    static int[][] nextPos;

    static int charToIndex(char c) {
        return c - 'A';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        S = br.readLine().trim();

        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            char c = st.nextToken().charAt(0);

            adj[u].add(new Edge(v, c));
            adj[v].add(new Edge(u, c));
        }

        children = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            children[i] = new ArrayList<>();
        }

        visited = new boolean[N + 1];

    }

    public static void buildTree(int u, int parent) {
        visited[u] = true;
        for (Edge e : adj[u]) {
            int v = e.to;
            if (!visited[v]) {
                children[u].add(e);
                buildTree(v, u);
            }
        }
    }

    public static void buildNextPos() {
        nextPos = new int[M + 1][26];

        for (int c = 0; c < 26; c++) {
            nextPos[M][c] = -1;
        }

        for (int i = M - 1; i >= 0; i--) {
            for (int c = 0; c < 26; c++) {
                nextPos[i][c] = nextPos[i + 1][c];
            }

            int ci = charToIndex(S.charAt(i));
            nextPos[i][ci] = i;
        }
    }
}
