package baekjun.solved;

import java.io.*;

public class _1089 {
    static String[][] blubPatterns = {
            {"###", "#.#", "#.#", "#.#", "###"},  // 0
            {"..#", "..#", "..#", "..#", "..#"},  // 1
            {"###", "..#", "###", "#..", "###"},  // 2
            {"###", "..#", "###", "..#", "###"},  // 3
            {"#.#", "#.#", "###", "..#", "..#"},  // 4
            {"###", "#..", "###", "..#", "###"},  // 5
            {"###", "#..", "###", "#.#", "###"},  // 6
            {"###", "..#", "..#", "..#", "..#"},  // 7
            {"###", "#.#", "###", "#.#", "###"},  // 8
            {"###", "#.#", "###", "..#", "###"}   // 9
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[][] display = new char[5][3 * N + N - 1];
        boolean[][] floor = new boolean[N][10];

        for (int i = 0; i < 5; i++) {
            int j = 0;
            for (char c : br.readLine().toCharArray()) {
                display[i][j] = c;
                j++;
            }
        }

        for (int k = 0; k < N; k++) {

            for (int num = 0; num < 10; num++) {
                Boolean isPossible = true;
                for (int i = 0; i < 5; i++) {
                    String nP = blubPatterns[num][i];
                    for (int j = 0; j < 3; j++) {
                        char c = nP.charAt(j);
                        if ((c != display[i][k * 4 + j]) && ('#' == display[i][k * 4 + j])) {
                            isPossible = false;
                            break;
                        }
                    }

                    if (isPossible == false) {
                        break;
                    }
                }

                if (isPossible == true) {
                    floor[k][num] = true;
                }
            }
        }
        Boolean flag = true;
        for (int i = 0; i < N; i++) {
            Boolean for_else = true;
            for (Boolean j : floor[i]) {
                if (j == true) {
                    for_else = false;
                    break;
                }
            }
            if (for_else == true) {
                flag = false;
                break;
            }
        }

        double ans = -1;
        if (flag == true) {
            double cnt = 1;
            int[] cnt_arr = new int[N];
            for (int i = 0; i < N; i++) {
                cnt_arr[i] = 0;
            }

            for (int i = 0; i < N; i++) {
                int c = 0;
                for (Boolean j : floor[i]) {
                    if (j == true) {
                        c += 1;
                    }
                }
                cnt_arr[i] = c;
                cnt *= c;
            }

            double value = 0;
            for (int i = 0; i < N; i++) {
                double i_cnt = cnt / cnt_arr[i];
                for (int j = 0; j < 10; j++) {
                    if (floor[i][j] == true) {
                        value += j * Math.pow(10, N - i - 1) * i_cnt;
                    }
                }
            }

            ans = value / cnt;
        }

        System.out.println(ans);
    }

}
