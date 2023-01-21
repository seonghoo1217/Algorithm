package baekjun.bruteforce;

import java.io.*;

public class _4396 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		char[][] bomb = new char[N][N];
		char[][] map = new char[N][N];

		int[] dirx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] diry = {-1, 0, 1, -1, 1, -1, 0, 1};
		int key = 1;

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int k = 0; k < N; k++) {
				bomb[i][k] = line.charAt(k);
			}
		}

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				if (line.charAt(j) == 'x') {
					if (bomb[i][j] == '*') {
						key = 0;
					} else {
						int count = 0;
						for (int k = 0; k < 8; k++) {
							int newx = i + dirx[k];
							int newy = j + diry[k];
							if (newx >= 0 && newx < N && newy >= 0 && newy < N && bomb[newx][newy] == '*')
								count++;
						}
						map[i][j] = (char) (count + '0');
					}
				} else {
					map[i][j] = '.';
				}
			}
		}
		if(key == 0) { // 지뢰 열었을 경우 지뢰 부분 *로 바꾸기
			for(int i = 0; i < N ; i++){
				for(int j = 0; j < N; j++) {
					if(bomb[i][j] == '*')
						map[i][j] = '*';
				}
			}
		}

		// 전체 출력
		for(int i = 0; i < N ; i++){
			for(int j = 0; j < N; j++) {
				System.out.print(map[i][j]);
			}
			System.out.print("\n");
		}
	}
}
