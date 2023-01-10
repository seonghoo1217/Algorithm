package baekjun.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class _10157 {

	static int[] dx={-1,0,1,0};
	static int[] dy={0,1,0,-1};
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(br.readLine());

		int [][] arr=new int[R+2][C+2];

		for(int i = 0; i < (C + 2); i++) {
			arr[0][i] = -1;
			arr[R + 1][i] = -1;
		}

		for(int i = 0; i < (R + 2); i++) {
			arr[i][0] = -1;
			arr[i][C + 1] = -1;
		}

		int k = Integer.parseInt(br.readLine());

		// 좌석을 배정할 수 없는 경우
		if(k > C * R) {
			System.out.println(0);
			return;
		}

		int x=R;
		int y = 1;
		int value = 1;
		int dir = 0;

		while(true) {
			arr[x][y] = value;
			// 대기번호 k 관객 좌석 위치 출력
			if(value == k) {
				System.out.println(y + " " + (R - x + 1));
				break;
			}

			// 이미 채워져있거나 벽을 만날때마다 방향 전환
			if(arr[x + dx[dir]][y + dy[dir]] != 0) {
				dir = (dir + 1) % 4;
			}
			x += dx[dir];
			y += dy[dir];

			value++;

			// 좌석 최대
			if(value > C * R) {
				break;
			}
		}

	}
}
