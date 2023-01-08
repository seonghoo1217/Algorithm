package baekjun.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class _1018 {
	public static boolean [][] chess;
	public static int min=64;
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st= new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		chess= new boolean[N][M];
		for (int i=0;i<N;i++){
			String line = br.readLine();
			for (int k=0;k<M;k++){
				if(line.charAt(k)=='W'){
					chess[i][k]=true;
				}else {
					chess[i][k]=false;
				}
			}
		}
		int N_row=N-7;
		int M_row=M-7;

		for (int i=0;i<N_row;i++){
			for (int k=0;k<M_row;k++){
				find(i,k);
			}
		}
		System.out.println(min);
	}

	private static void find(int x, int y) {
		int end_x=x+8;
		int end_y = y + 8;
		int count = 0;

		boolean TF = chess[x][y];	// 첫 번째 칸의 색

		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {

				// 올바른 색이 아닐경우 count 1 증가
				if (chess[i][j] != TF) {
					count++;
				}

				/*
				 * 다음 칸은 색이 바뀌므로
				 * true라면 false로, false 라면 true 로
				 * 값을 변경한다.
				 */
				TF = (!TF);
			}

			TF = !TF;
		}

		/*
		 *  첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 *  첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 *  색칠 할 개수(64 - count) 중 최솟값을 count 에 저장
		 */
		count = Math.min(count, 64 - count);

		/*
		 * 이전까지의 경우 중 최솟값보다 현재 count 값이
		 * 더 작을 경우 최솟값을 갱신
		 */
		min = Math.min(min, count);
	}

}
