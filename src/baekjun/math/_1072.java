package baekjun.math;

import java.io.*;
import java.util.StringTokenizer;

public class _1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        int z = (int) ((y * 100) / x);
        if (z >= 99) {
            System.out.println(-1);
            return;
        }

        int left = 0;
        int right = 1000000000;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int temp = (int) (((y + mid) * 100) / (x + mid));

            if (z >= temp) {
                result = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }
}
