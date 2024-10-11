package baekjun.solved;

import java.io.*;

public class _2232 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= N; i++) {
            if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) {
                System.out.println(i);
            }
        }
    }
}
