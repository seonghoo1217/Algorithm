package baekjun.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class _1149 {

	final static int RED=0;
	final static int GREEN=1;
	final static int BLUE=2;

	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int [][] arr=new int[N][3];
		StringTokenizer st;
		for (int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			arr[i][RED] = Integer.parseInt(st.nextToken());
			arr[i][GREEN] = Integer.parseInt(st.nextToken());
			arr[i][BLUE] = Integer.parseInt(st.nextToken());
		}

		for (int i=1;i<N;i++){
			arr[i][RED] += Math.min(arr[i - 1][GREEN], arr[i - 1][BLUE]);
			arr[i][GREEN] += Math.min(arr[i - 1][RED], arr[i - 1][BLUE]);
			arr[i][BLUE] += Math.min(arr[i - 1][RED], arr[i - 1][GREEN]);
		}

		System.out.println(Math.min(Math.min(arr[N - 1][RED], arr[N - 1][GREEN]), arr[N - 1][BLUE]));
	}
}
