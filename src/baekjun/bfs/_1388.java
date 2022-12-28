package baekjun.bfs;

import java.io.*;
import java.util.StringTokenizer;

public class _1388 {
	private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st=new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		char[][] under =new char[N][M];
		boolean[][] check=new boolean[N][M];

		for (int i=0;i<N;i++){
			String line = br.readLine();
			for (int k=0;k<M;k++){
				under[i][k]=line.charAt(k);
				check[i][k]=false;
			}
		}

		int cnt = bfs(under, check);
		System.out.println(cnt);
	}

	private static int bfs(char[][] under, boolean[][] check) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int tmp = 0;
			for (int j = 0; j < M; j++) {
				if (under[i][j] == '|') {
					tmp = 0;
				} else if (++tmp == 1) {
					cnt++;
				}
			}
		}
		for (int j = 0; j < M; j++) {
			int tmp = 0;
			for (int i = 0; i < N; i++) {
				if (under[i][j] == '-') {
					tmp = 0;
				} else if (++tmp == 1) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
