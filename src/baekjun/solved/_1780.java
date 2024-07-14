package baekjun.solved;

import java.io.*;
import java.util.StringTokenizer;

public class _1780 {
    static int N;
    static int[][] paper;
    static int minus, zero, plus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        paper = new int[N][N]; // N 값 입력 후 초기화

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        minus = zero = plus = 0; // 초기화 추가
        cutPaper(0, 0, N);        // cutPaper 메서드 호출

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }

    static void cutPaper(int x, int y, int size) {
        int num = paper[x][y]; // 현재 종이의 첫 번째 값

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != num) {
                    int newSize = size / 3;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            cutPaper(x + k * newSize, y + l * newSize, newSize);
                        }
                    }
                    return;
                }
            }
        }

        // 종이가 모두 같은 수라면 개수 증가
        if (num == -1) {
            minus++;
        } else if (num == 0) {
            zero++;
        } else {
            plus++;
        }
    }
}
