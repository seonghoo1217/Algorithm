package baekjun.solved.graph;

import java.io.*;
import java.util.*;

public class _15723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<String, List<String>> graph = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            String a = split[0];
            String b = split[2];


            graph.putIfAbsent(a, new ArrayList<>());
            graph.get(a).add(b);
        }

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] split = br.readLine().split(" ");
            String origin = split[0];
            String target = split[2];

            boolean result = checkRelationship(graph, origin, target);

            System.out.println(result ? "T" : "F");
        }
    }

    private static boolean checkRelationship(Map<String, List<String>> graph, String a, String b) {
        Set<String> visited = new HashSet<>();
        return dfs(graph, a, b, visited);
    }

    private static boolean dfs(Map<String, List<String>> graph, String current, String target, Set<String> visited) {
        if (current.equals(target)) {
            return true;
        }
        visited.add(current);

        List<String> neighbors = graph.get(current);
        if (neighbors != null) {
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor) && dfs(graph, neighbor, target, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
