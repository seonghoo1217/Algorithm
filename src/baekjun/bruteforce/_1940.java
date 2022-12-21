package baekjun.bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1940 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int [] number=new int[N];

		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i=0;i<N;i++){
			number[i]=Integer.parseInt(st.nextToken());
		}

		int answer=0;
		Arrays.sort(number);
		int i=0;
		int j=N-1;

		while (i<j){
			if (number[i]+number[j]<M){
				i++;
			}else if(number[i]+number[j]>M){
				j--;
			}else {
				answer++;
				i++;
				j--;
			}
		}

		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
