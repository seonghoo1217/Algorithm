package baekjun.solved;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _5567 {
    static boolean check[];
    static int N, answer;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list[] = new ArrayList[N + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        check = new boolean[N + 1];

        check[1] = true;
        dfs(1, list, 0);

        for (int i = 2; i < check.length; i++) {
            if (check[i]) answer++;
        }
        System.out.println(answer);
    }


    private static void dfs(int num, List<Integer>[] list, int depth) {
        if (depth == 2) {
            return;
        }

        for (int i = 0; i < list[num].size(); i++) {
            Integer next = list[num].get(i);
            check[next] = true;
            dfs(next, list, depth + 1);
        }
    }
}
