package _2025._2month_2week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소프티어9657 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            for (int k = 0; k < M; k++) {
                map[i][k] = Integer.parseInt(s[k]);
            }
        }

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;

            for (int row = start; row <= end; row++) {
                for (int col = 0; col < M; col++) {
                    if (map[row][col] == 1) {
                        map[row][col] = 0;
                        break;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                count += map[i][j];
            }
        }

        System.out.println(count);
    }
}
