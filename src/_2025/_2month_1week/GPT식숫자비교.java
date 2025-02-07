package _2025._2month_1week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GPT식숫자비교 {

    public static int[] getKey(String s) {
        int[] key = new int[3];
        if (s.contains(".")) {
            String[] parts = s.split("\\.");
            key[0] = Integer.parseInt(parts[0]);
            key[1] = 1;
            key[2] = Integer.parseInt(parts[1]);
        } else {
            key[0] = Integer.parseInt(s);
            key[1] = 0;
            key[2] = 0;
        }
        return key;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numbers.add(br.readLine().trim());
        }

        Collections.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int[] key1 = getKey(s1);
                int[] key2 = getKey(s2);

                if (key1[0] != key2[0]) {
                    return Integer.compare(key1[0], key2[0]);
                }
                if (key1[1] != key2[1]) {
                    return Integer.compare(key1[1], key2[1]);
                }
                return Integer.compare(key1[2], key2[2]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String num : numbers) {
            sb.append(num).append("\n");
        }
        System.out.print(sb);

    }
}
