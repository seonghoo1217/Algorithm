package baekjun.solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] studentsNumber = new String[N];

        for (int i = 0; i < N; i++) {
            studentsNumber[i] = br.readLine();
        }

        int max = studentsNumber[0].length();

        for (int k = 1; k <= max; k++) {
            Set<String> unique = new HashSet<>();
            boolean allUnique = true;

            for (int i = 0; i < N; i++) {
                String idPart = studentsNumber[i].substring(max - k);

                if (!unique.add(idPart)) {
                    allUnique = false;
                    break;
                }
            }

            if (allUnique) {
                System.out.println(k);
                return;
            }
        }
    }
}
