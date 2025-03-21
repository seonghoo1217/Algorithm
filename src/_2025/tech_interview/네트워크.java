package _2025.tech_interview;

public class 네트워크 {
    public static int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];

        int networkCnt = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, visited);
                networkCnt++;
            }
        }
        return networkCnt;
    }

    public static void dfs(int i, int[][] computers, boolean[] visited) {
        visited[i] = true;

        for (int j = 0; j < computers[i].length; j++) {
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(j, computers, visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] test = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(3, test));
    }
}
